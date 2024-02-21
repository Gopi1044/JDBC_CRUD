package com.task.dao;
import java.sql.SQLException;

import com.task.bean.*;

public interface EmployeeDaoI  {
	public void insertEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException;
	public void updateEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException;
	public void selectEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException;
	public void deleteEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException;
}
