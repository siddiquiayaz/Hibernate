package com.hibernate.MavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.mapping.IdGenerator;

@Entity 
public class Student1 {
	@Id

	private int id;
	private String name;
	private String address;
	public Student1(int id ,String name,String address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	
	}
	
	
		public Student1() {
		super();
	}


		public int setId(int id) {
			return this.id =id;
		}
		
		public int getId() {
               return id;			
		}
		public String setName(String name) {
			return this.name=name;
			
		}
		public String getName() {
			return name;
			
		}
		public String  setAddress(String address) {
			return this.address =address;
		}
	    public String  getAddress() {
	    	return address;
			
		}
	    @Override
	public String toString() {
		return this.id+"  :  " +this.name+"  :  "+this.address;
		
	}
	    
	    void m1(String b) {
		    System.out.println("hi");	
		    }
	    void m1(Object a) {
	    	System.out.println("by");
	    }
	    
	   
	
        public static void main(String ...args) {
			Student1 student1=new Student1();
			student1.m1(null);
		}
}
