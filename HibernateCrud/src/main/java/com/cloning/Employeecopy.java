package com.cloning;

public class Employeecopy implements Cloneable {

	private Employee emp;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
          //deep cloning working impl
		Employee emp2 = new Employee(emp.getId(),emp.getName());

		Employeecopy empcopy = new Employeecopy(emp2, name);
		return empcopy;

		
		//shallow cloning  working impl
		// return super.clone();

	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Employeecopy(Employee emp, String name) {
		super();
		this.emp = emp;
		this.name = name;
	}

}
