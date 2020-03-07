package com.cg;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {

	public class TestHello{
		private Hello h1;
		
		@Before
		public void init() {
			h1=new Hello();
		}
		
		@After
		public void clean() {
			h1=null;
		}
		
		@Test
		public void tetstsayHello() {
assertEquals("hello world",h1.sayHello());
	}
}
}
