package com.company.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDemo {

	public static void main(String[] args) {

		long timeBefore;
		long timeAfter;

		DbSingleton instance = DbSingleton.getInstance();

		timeBefore = System.currentTimeMillis();
		Connection connection = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore);

		Statement statement;
		try{
			statement = connection.createStatement();
			int count = statement.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), " +
			                                    "City VARCHAR(20))");
			System.out.println("Table created");
			statement.close();
		}catch (SQLException ex){
			ex.printStackTrace();
		}

		timeBefore = System.currentTimeMillis();
		connection = instance.getConnection();
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore);
	}
}
