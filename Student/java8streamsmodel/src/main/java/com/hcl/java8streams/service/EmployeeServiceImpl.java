package com.hcl.java8streams.service;

import java.util.List;
import com.hcl.java8streams.dao.EmployeeDao;
import com.hcl.java8streams.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
private EmployeeDao employeeDAO;


// @Override
@Transactional
public List<Employee> getAllEmployee() {
return employeeDAO.getAllEmployee();

}
}



