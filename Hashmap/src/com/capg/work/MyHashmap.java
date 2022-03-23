package com.capg.work;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyHashmap {
	 
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
	
	map.put(1 , "Rohan");
	map.put(2 , "Rohit");
	map.put(3, "Mohit");
	
	System.out.println(MyHashmap.class.getName());
	System.out.println();
	
	Logger logger = Logger.getLogger(MyHashmap.class.getName());
	
	
	map.forEach((k,v)-> logger.log(Level.INFO, k +" "+ v));
	
//	for (HashMap<Integer, String> m : map) {
//		
//	}
	
	TreeMap<Integer, String> newTree = new TreeMap<>();
	newTree.put(1, "Rohan");
	newTree.forEach((k,v)-> System.out.println(k+v));
	
	}

	
	
}
