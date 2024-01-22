package com.hexaware.collectionDemo; 
import java.util.*; 
public class SetDemo { 
	public static void main(String[] args) 
	{ 
		Set<String> hash_Set = new HashSet<String>(); 
		hash_Set.add("A"); 
		hash_Set.add("A"); 
		hash_Set.add("B"); 
		hash_Set.add("C"); 
		hash_Set.add("D"); 
		System.out.println(hash_Set); 
	} 
}
