package com.crud.controller;

import com.crud.dao.EmployeeDao;
import com.crud.model.Employee;

public class EmployeeController {
    EmployeeDao ed = new EmployeeDao();

    public void addEmployee(Employee e) {
        ed.addEmployee(e);
    }

    public void getAllEmployee() {
        ed.getAllEmployee();
    }

    public void getDetailsByName(String name) {
        ed.getDetailsByName(name);
    }

    public void deleteByName(String name) {
        ed.deleteByName(name);
    }

}
