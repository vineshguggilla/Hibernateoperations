package com.crud;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class Crudoperations1 {

	@Test
	@AfterEach
	public void test() {
		
		CreateQueryoperation jtest= new CreateQueryoperation();
		
		jtest.queryoperation();
		
	}
	

	@Test
	@BeforeEach
	public void test1() {
		
		 Crteiriaoperations jtest1 = new Crteiriaoperations();
		
		jtest1.getalldetails();
		
	}

	
	

}
