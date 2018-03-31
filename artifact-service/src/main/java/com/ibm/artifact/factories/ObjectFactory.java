package com.ibm.artifact.factories;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.ibm.artifact.annotations.JournalisationTechnique;

public class ObjectFactory {
	
	public static Object create(Class clazz) throws Exception {
		Object object = clazz.newInstance();
		Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
	            Annotation[] annotations = method.getDeclaredAnnotations();
	            for (Annotation annotation : annotations) {
	                if(annotation instanceof JournalisationTechnique) {
	                	System.out.println("Annotation de type Journal Technique");
	                }
	            }
		}
			return object;
	}

}
