package com.cloning;

public class Shallowcloningimpl {

	public static void main(String[] args) throws CloneNotSupportedException {
/*
 * 
 *    it is process of creating only duplicate reference but not creating duplicate object 
 * shallow cleaning is meant for clone method to overcome this problem we should go for Deep cloning 
 * 
 */
		Employee emp = new Employee(101, "vinesh");

		Employeecopy d1 = new Employeecopy(emp, "dhravi");
		System.out.println(d1.getName()+" "+d1.getEmp().getId()+""+d1.getEmp().getName());
		Employeecopy d2 = (Employeecopy) d1.clone();
		
		d2.setName("mahesh");
		
		d2.getEmp().setId(1000);
		d2.getEmp().setName("raju");
		
		
		
     System.out.println(  d2.getName()+" "+d2.getEmp().getId()+""+d2.getEmp().getName());
     System.out.println(d1.getName()+" "+d1.getEmp().getId()+""+d1.getEmp().getName());

	}

}
