package com.cloning;

public class Deepcloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		
		/*
		 * deep cloning 
		 * it is process of creating complete duplicate object 
		 * but we have to override the clone method 
		 * Programmer is responsible to create  implement clone method
		 * 
		 */
		Employee emp1 = new Employee(100, "vinesh");

		Employeecopy d1 = new Employeecopy(emp1, "dhravi");
		System.out.println(d1.getName()+" "+d1.getEmp().getId()+" "+d1.getEmp().getName());
		Employeecopy d2 = (Employeecopy) d1.clone();
		
		d2.setName("mahesh");
		
		d2.getEmp().setId(1000);
		d2.getEmp().setName("raju");
		
		
		
     System.out.println(  d2.getName()+" "+d2.getEmp().getId()+""+d2.getEmp().getName());
     System.out.println(d1.getName()+" "+d1.getEmp().getId()+""+d1.getEmp().getName());



	}

}
