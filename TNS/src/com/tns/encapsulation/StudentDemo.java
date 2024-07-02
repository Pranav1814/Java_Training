//student demo class
package com.tns.encapsulation;


public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Pranav");
		//System.out.println("Name of s1 : "+s1.getName());
		
		s1.setAge(20);
		//System.out.println("Age of s1 : "+s1.getAge());
		
		s1.setId(01);
		//System.out.println("Id of s1 : "+s1.getId());
		
		System.out.println(s1);
	}
}
