package com.ibm.artifact.handlers;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.ibm.artifact.annotations.JournalisationTechnique;

public class JcmsServiceHandler<T> implements InvocationHandler {

	private T t;

	public JcmsServiceHandler(T t) {
	      this.t = t;
	  }
	@Override
	  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	      Object result = null;
	      if(method.isAnnotationPresent(JournalisationTechnique.class) && method.getAnnotation(JournalisationTechnique.class).isActive()) {
	    	  result = processJournalTechnique(method, args);
	      }
	      else {
	    	  result = method.invoke(t, args);
	      }
	      return result;
	  }

    
    @SuppressWarnings("unchecked")
    public static <T> T getProxy(T t, Class<? super T> interfaceType) {
    	@SuppressWarnings("rawtypes")
		JcmsServiceHandler handler = new JcmsServiceHandler(t);
        return (T) Proxy.newProxyInstance(interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType}, handler
        );
    }
    
    /** Traitement annotation **/
    
    private Object processJournalTechnique(Method method, Object[] args) {
    	Object result = null;
    	try {
    		openTransaction();
    		persistToJournal(args);
    		result = method.invoke(t, args);
    		persistToJournal(result);
    	}
    	catch(Throwable t) {
    		persistToJournal(t.getMessage());
    	}
    	finally {
			closeTransaction();
		}
    	return result;
    }
    
    private void openTransaction() {
    	System.out.println("Ouverture Connexion");
    }
    private void closeTransaction() {
    	System.out.println("Fermeture Connexion");
    }
    private void persistToJournal(Object data) {
    	System.out.println("Persistence des données dans le journal technique");
    }
}