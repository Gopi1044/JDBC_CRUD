package com.task.service;
import com.task.dao.*;

import java.sql.SQLException;

import com.task.bean.*;

public class EmployeeServiceImpl implements EmployeeServiceI {

	@Override
	public void insertEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao=new EmployeeDaoImpl();
		//EmployeeBean bean1=new EmployeeBean();
		dao.insertEmployee(emp);
	}

	@Override
	public void updateEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao=new EmployeeDaoImpl();
		//EmployeeBean bean2=new EmployeeBean();
		dao.updateEmployee(emp);
		
	}

	@Override
	public void selectEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao=new EmployeeDaoImpl();
		//EmployeeBean bean3=new EmployeeBean();
		dao.selectEmployee(emp);
		
	}

	@Override
	public void deleteEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException {
		EmployeeDaoI dao=new EmployeeDaoImpl();
		//EmployeeBean bean4=new EmployeeBean();
		dao.deleteEmployee(emp);
		
	}
}
