package com.ibm.artifact.controllers;

import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.artifact.beans.Apple;


@Controller
@RequestMapping(method=RequestMethod.GET,value="apples")
public class AppleController {
	
	ObjectMapper mapper = new ObjectMapper();
	ApplicationContext contextSpring = null;
	
	@RequestMapping(value="/getAll", produces="application/json")
	public @ResponseBody List<Apple> getApples() {
		
		List<Apple> response = new ArrayList<Apple>();
		try {
			contextSpring = new ClassPathXmlApplicationContext("spring/ApplicationContext.xml");
			Resource jsonResource = contextSpring.getResource("json/data.json");
			response = convertStreamToApples(jsonResource.getInputStream());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(contextSpring !=null) {
				((ConfigurableApplicationContext)contextSpring).close();
			}
		}
		return response;
	}
	
	private List<Apple> convertStreamToApples(InputStream stream) {
		List<Apple> liste = new ArrayList<>();
		try {
			StringWriter writer = new StringWriter();
			IOUtils.copy(stream, writer, "UTF-8");
			String json = writer.toString();
			liste = Arrays.asList(mapper.readValue(json, Apple[].class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return liste;
	}

}
