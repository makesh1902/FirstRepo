package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

//	@Test
//	public void testAdd() {
//		
//		int n1=10,n2=10;
//		assertEquals(20,Main.add(n1, n2));
//	}
//	@Test
//	public void testCompare() {
//		
//		int n1=10;int n2=10;
//		assertTrue(Main.compare(n1, n2));
//		assertFalse(Main.compare(n1, n2));
//	}
	@Test
	public void testObject()
	{
		Flight f1 = new Flight(1, "Chennai", "Vpm");
		Flight f2 = new Flight(1, "Chennai", "Vpm" );
		assertEquals("objj not equal",f1, f2);//(f1, f2);
	}

}
