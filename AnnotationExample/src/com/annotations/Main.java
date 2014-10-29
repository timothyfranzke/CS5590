package com.annotations;
import java.io.FileNotFoundException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	}
	
	@Override
	@MethodInfo(author = "Tim", comments="Main method", date = "Sept 20 2014", revision = 1)
	public String toString(){
		return "Overriden toString method";
	}
	
	@Deprecated
	@MethodInfo(comments="deprecated methods", date = "Sept 20 2014")
	public static void oldMethod(){
		System.out.println("old method, don't use it");
	}
	
	@SuppressWarnings({"unchecked", "deprecated"})
	@MethodInfo(author = "Some Guy", date = "Sept 20 2014", comments = "Main method", revision = 10)
	public static void genericTest() throws FileNotFoundException{
		List l = new ArrayList();
		l.add("abc");
		oldMethod();
	}

}
