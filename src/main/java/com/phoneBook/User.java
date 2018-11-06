package com.phoneBook;
import java.io.*;

public abstract class User{
	private String fio, phoneNumber, adress;
	static int indx = 0;
	
	User()
	{
		indx++;
		fio = "name";
		phoneNumber = "0";
		adress = "nope";
	}
	User(String fio, String phone, String adress)
	{
		this.fio = fio;
		phoneNumber = phone;
		this.adress = adress;
	}
	
	public String GetData()
	{
		return (fio + " " + phoneNumber + " " + adress);
	}
	
	public void SetFio(String fio)
	{
		this.fio = fio;
	}
	
	public void SetPhone(String phone)
	{
		phoneNumber = phone;
	}
	
	public void SetAdress(String adress)
	{
		this.adress = adress;
	}
}