package com.infy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExercise {

	public static void main(String[] args) {

		int count =0;
		String a = "hclabhclabhclabhclabxyz";
	
		String p =" [ab]";
		Pattern pat= Pattern.compile(p);
		Matcher m= pat.matcher(a);
		if(m.find()== true){
			count++;

		}

		System.out.println(count);
	}



}