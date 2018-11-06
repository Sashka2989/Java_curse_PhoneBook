package com.phoneBook;

public class FizFace extends User{
	private String mobPhone;
	
	FizFace()
	{
		super();
		mobPhone = "null";
	}
	FizFace(String fio, String phone, String adres, String mobPhone)
	{
		super(fio, phone, adres);
		this.mobPhone = mobPhone;
	}
	
	public String GetData()
	{
		return (super.GetData() + " " + mobPhone);
	}
	
	public void SetMobPhone(String mobPhone)
	{
		this.mobPhone = mobPhone;
	}
	
}