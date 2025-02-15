package com.crud.view;

import com.crud.controller.EmployeeController;
import com.crud.model.Employee;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        EmployeeController ec = new EmployeeController();

        boolean value = true;
        while (value) {

            System.out.println("Enter Option, Which CRUD operation you want to perform : ");
            System.out.println("1 : To add new employee details.");
            System.out.println("2 : To get all details of employee.");
            System.out.println("3 : To search employee by name.");
            System.out.println("4 : To delete record of employee by name.");
            System.out.println("Exit.......");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter Data to enter into database: \n");
                    Employee e = new Employee();
//                System.out.println("Enter ID for new Employee: \n");
//                e.setId(sc.nextInt());
                    System.out.println("Enter Name of new Employee: \n");
                    e.setName(sc.next());
                    System.out.println("Enter salary for new Employee: \n");
                    e.setSal(sc.nextDouble());
                    System.out.println("Enter Phone No of new Employee: \n");
                    e.setPhno(sc.nextLong());
                    ec.addEmployee(e);
                    break;
                }

                case 2: {
                    ec.getAllEmployee();
                    break;
                }
                case 3: {
                    System.out.println("Enter employee name to get all details : \n");
                    ec.getDetailsByName(sc.next());
                    break;
                }
                case 4: {
                    System.out.println("Enter employee name to delete record : \n : \n");
                    ec.deleteByName(sc.next());
                    break;
                }
                case 5:{
                    value = false;
                }
                default:
                    System.out.println("Invalid Input choice....");
            }
        }


    }
}
