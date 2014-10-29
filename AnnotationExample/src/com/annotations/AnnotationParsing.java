package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationParsing {

	public static void main(String[] args) {
		try{
			for(Method method: AnnotationParsing.class.getClassLoader().loadClass("com.annotations.Main").getMethods()){
				if(method.isAnnotationPresent(com.annotations.MethodInfo.class)){
					try{
						for (Annotation anno: method.getDeclaredAnnotations()){
							System.out.println("Annotation in method" + method + "");
						}
						
					}catch(Exception e){
						System.out.println("Exception throw " + e.getMessage());
						System.out.println(e.getStackTrace());
					}
				}
			}
		}
		catch(Exception e){
			System.out.println("Exception throw " + e.getMessage());
			System.out.println(e.getStackTrace());
		}

	}

}
