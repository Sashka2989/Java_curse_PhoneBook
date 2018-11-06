package com.phoneBook;

public class UrFace extends User{
	private String inn;
	
	UrFace()
	{
		super();
		inn = "null";
	}
	UrFace(String fio, String phone, String adres, String inn)
	{
		super(fio, phone, adres);
		this.inn = inn;
	}
	
	public String GetData()
	{
		return (super.GetData() + " " + inn);
	}
	
		public void SetInn(String inn)
	{
		this.inn= inn;
	}
	
}