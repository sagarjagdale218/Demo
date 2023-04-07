package com.sts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column
	private String name;
    @Column
	private String address;
    @Column
	private int std;
    @Column
	private long mnumber;
    @Column
	private double per;
    //Parameterize constructor
	public Student(int id, String name, String address, int std, long mnumber, double per) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.std = std;
		this.mnumber = mnumber;
		this.per = per;
	}
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//getter and setter for id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//getter and setter for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//getter and setter for address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//getter and setter for std
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	//getter and setter for mnumber
	public long getMnumber() {
		return mnumber;
	}
	public void setMnumber(long mnumber) {
		this.mnumber = mnumber;
	}
	//getter and setter for percentage
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	//to string method!!
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", std=" + std + ", mnumber=" + mnumber
				+ ", per=" + per + "]";
	}
    
	
	
}
