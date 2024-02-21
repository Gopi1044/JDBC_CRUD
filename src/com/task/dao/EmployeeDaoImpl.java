package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.task.util.*;
import com.task.bean.EmployeeBean;

public class EmployeeDaoImpl implements EmployeeDaoI {
	public static Connection connection=null;
	public static PreparedStatement pst=null;
	@Override
	public void insertEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException{
		int empid=emp.getEmpid();
		String empname=emp.getEmpname();
		String empaddress=emp.getEmpaddress();
		connection=EmployeeUtil.getDbConnection();
		pst=connection.prepareStatement("insert into emp_jdbc value(?,?,?)");
		pst.setInt(1, empid);
		pst.setString(2,empname);
		pst.setString(3, empaddress);
		pst.executeUpdate();
		System.out.println("One Record is inserted");
	}
	@Override
	public void updateEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		int empid=emp.getEmpid();
		String empname=emp.getEmpname();
		String empaddress=emp.getEmpaddress();
		connection=EmployeeUtil.getDbConnection();
		pst=connection.prepareStatement("update emp_jdbc set empname=?,empaddress=? where empid=?");
		pst.setString(1,empname);
		pst.setString(2, empaddress);
		pst.setInt(3, empid);
		pst.executeUpdate();
		System.out.println("One Record is updated");
		
	}
	@Override
	public void selectEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		connection=EmployeeUtil.getDbConnection();
		int empid=emp.getEmpid();
		pst=connection.prepareStatement("select * from emp_jdbc where empid=?");
		pst.setInt(1, empid);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
	@Override
	public void deleteEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		int empid=emp.getEmpid();;
		connection=EmployeeUtil.getDbConnection();
		pst=connection.prepareStatement("delete from emp_jdbc where empid=?");
		pst.setInt(1, empid);
		pst.executeUpdate();
		System.out.println("One Record is deleted");
		
	}
	
}
