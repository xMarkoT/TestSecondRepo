package com.test.repo.start;

import com.test.repo.model.Model;
import com.test.repo.model.SecondModel;

public class Main {
	public static void main(String[] args) {
		Model m = new Model();
		m.setStr1("Hello Git");
		m.setStr2(" Testing repository");
		
		System.out.println(m.getStr1());
		System.out.println(m.getStr2());
		
		/*
		 * Lines after the first push/pull
		 */
		
		SecondModel sm = new SecondModel();
		sm.setMyStr("Push Pull comment");
		System.out.println(sm.getMyStr());
	}
}
