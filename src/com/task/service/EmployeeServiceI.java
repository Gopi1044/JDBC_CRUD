package com.task.service;
import java.sql.SQLException;

import com.task.bean.*;

public interface EmployeeServiceI {
	void insertEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException;
	void updateEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException;
	void selectEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException;
	void deleteEmployee(EmployeeBean emp) throws ClassNotFoundException, SQLException;
}
