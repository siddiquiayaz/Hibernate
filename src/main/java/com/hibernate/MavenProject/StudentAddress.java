package com.hibernate.MavenProject;


import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Table(name ="student_address")
@Entity  
public class StudentAddress {
	
	 @Override
	public String toString() {
		return "StudentAddress [studentId=" + studentId + ", city=" + city + ", street=" + street + ", cityIsOpen="
				+ cityIsOpen + ", y=" + y + ", image=" + Arrays.toString(image) + ", adedDate=" + adedDate + "]";
	}
	@Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name ="student_address_id")
   	private int studentId;
	 @Column (length = 100,name="CITY")
     private String city;
	 @Column(length = 60,name="STREET")
     private String street;
	 @Column (name="city_isOpenn")
     private boolean cityIsOpen;
	 @Transient
     private double y;
	 @Lob
     private byte[] image;
	 @Temporal(TemporalType.DATE)
	 private Date adedDate;
	public StudentAddress() {
		super();
		
	}
	public StudentAddress(int studentId, String city, String street, boolean cityIsOpen, double y, byte[] image,Date adedDate) {
		super();
		this.studentId = studentId;
		this.city = city;
		this.street = street;
		this.cityIsOpen = cityIsOpen;
		this.y = y;
		this.image = image;
		this.adedDate=adedDate;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public boolean getCityIsOpen() {
		return cityIsOpen;
	}
	public void setCityIsOpen(boolean cityIsOpen) {
		this.cityIsOpen = cityIsOpen;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Date getAdedDate() {
		return adedDate;
	}
	public void setAdedDate(Date adedDate) {
		this.adedDate = adedDate;
	}

	

}
