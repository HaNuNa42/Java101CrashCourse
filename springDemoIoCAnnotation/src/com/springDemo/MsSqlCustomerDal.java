package com.springDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("database") //annotation injection
public class MsSqlCustomerDal implements ICustomerDal {
	
	//String injection
	@Value("${database.connectionString}")
	String connectionString;

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Connection String : " + this.connectionString);
		System.out.println("MSSQL veritabanýna eklendi");

	}

}
