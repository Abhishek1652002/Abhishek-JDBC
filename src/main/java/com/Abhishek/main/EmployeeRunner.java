package com.Abhishek.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.Abhishek.dao.EmployeeDaoImpl;
import com.Abhishek.entity.Employee;
import com.Abhishek.dao.EmployeeDao;

public class EmployeeRunner {

	public static void main(String[] args) throws SQLException    {
		
		//Persistent object
		
		
		EmployeeDao edao=new EmployeeDaoImpl();
		
		Employee emp=new Employee(16,"Anshika","female",77000);
		
		
		
		edao.deleteEmpById(4);
		
		
		
		
		
		
		
		
		
		
		
		
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root","root" );
//		
//		Statement statement =connection.createStatement();
//		
//		statement.executeUpdate("insert into employee(id,name,gender,salary) values("+ravi.getId()+",'"+ravi.getName()+"','"+ravi.getGender()+"',"+ravi.getSalary()+")");
//		
		
		
		System.out.println("Query Executed");
	}

}

		
	
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	


