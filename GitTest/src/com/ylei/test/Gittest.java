package com.ylei.test;

import java.util.ArrayList;
import java.util.List;

public class Gittest {
	public static void main(String[] args) {
		System.out.println("Git Test");

		System.out.println("Git branch meila");
		List<String> lists = Gittest.addlist();
		for (String list : lists) {
			System.out.println(list);
		}
		if (searchNumber()) {
			System.out.println("list中有10018");
		}
		
	}
public static List<String> addlist(){
	
	List<String> list = new ArrayList<String>();
	for (int i = 0; i < 20; i++) {
		 list.add(i, "100"+i);	
	}
	return list;
}

public static boolean searchNumber(){
	boolean realut = false;
	List<String> lists = Gittest.addlist();
	for (String list : lists) {
		if (list.equals("10018")) {
			realut = true;
		}
	}
	
	
	return realut;
}
}
