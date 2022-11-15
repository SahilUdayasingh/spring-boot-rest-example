package com.javatpoint;
public class Airplane 
{
private int id;
private String pname;
private String batchno;
private double price;
private int noOfAirplane;
//default constructor
public Airplane()
{
	
}
//constructor using fields
public Airplane(int id, String pname, String batchno, double price, int noOfAirplane) 
{
super();
this.id = id;
this.pname = pname;
this.batchno = batchno;
this.price = price;
this.noOfAirplane = noOfAirplane;
}
//getters and setters
public int getId() 
{
return id;
}
public void setId(int id) 
{
this.id = id;
}
public String getPname() 
{
return pname;
}
public void setPname(String pname) 
{
this.pname = pname;
}
public String getBatchno() 
{
return batchno;
}
public void setBatchno(String batchno) 
{
this.batchno = batchno;
}
public double getPrice() 
{
return price;
}
public void setPrice(double price) 
{
this.price = price;
}
public int getNoofAirplane() 
{
return noOfAirplane;
}
public void setNoofproduct(int noOfAirplane) 
{
this.noOfAirplane = noOfAirplane;
}
}