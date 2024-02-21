package com.task.ui;

import java.sql.SQLException;
import java.util.Scanner;
import com.task.service.*;
import com.task.bean.*;

public class Demo_CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your option");
		System.out.println("===================================");
		System.out.println("1. Insert Employee data");
		System.out.println("2. Update Employee data");
		System.out.println("3. Select Employee data");
		System.out.println("4. Delete Employee data");
		int option=sc.nextInt();
		switch(option) {
		case 1:{
			insertEmployee();
			break;
		}
		case 2:{
			updateEmplopyee();
			break;
		}
		case 3:{
			selectEmployee();
			break;
			
		}
		case 4:{
			deleteEmployee();
			break;
			
		}
		default:{
			System.out.println("Entered option is invalid");
		}
		}
	}

	private static void deleteEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		System.out.println("Enter empid to delete from data");
		Scanner sc=new Scanner(System.in);
		int getId=sc.nextInt();
		bean.setEmpid(getId);
		service.deleteEmployee(bean);
		
	}

	private static void selectEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		System.out.println("Enter the Empid of Employee to view data");
		Scanner sc=new Scanner(System.in);
		int getId=sc.nextInt();
		bean.setEmpid(getId);
		service.selectEmployee(bean);
		
	}

	private static void updateEmplopyee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		System.out.println("Enter empid for which data to be updated");
		Scanner sc=new Scanner(System.in);
		int getId=sc.nextInt();
		System.out.println("Enter empname to be updated for Employee");
		String getName=sc.next();
		System.out.println("Enter empaddress to be updated for Employee");
		String getAddress=sc.next();
		bean.setEmpid(getId);
		bean.setEmpname(getName);
		bean.setEmpaddress(getAddress);
		service.updateEmployee(bean);
		
	}

	private static void insertEmployee() throws ClassNotFoundException, SQLException {
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		EmployeeBean bean=new EmployeeBean();
		System.out.println("Enter empid , empname , empaddress");
		Scanner sc=new Scanner(System.in);
		int getId=sc.nextInt();
		String getName=sc.next();
		String getAddress=sc.next();
		bean.setEmpid(getId);
		bean.setEmpname(getName);
		bean.setEmpaddress(getAddress);
		service.insertEmployee(bean);
		
	}

}
