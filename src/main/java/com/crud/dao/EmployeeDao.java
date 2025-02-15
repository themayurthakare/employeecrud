package com.crud.dao;

import com.crud.model.Employee;
import jakarta.persistence.*;

import java.util.List;

public class EmployeeDao {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hari");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();

    public void addEmployee(Employee e) {
        et.begin();
        em.persist(e);
        et.commit();
    }

    public void getAllEmployee() {
        String jpql = "select e from Employee e";
        et.begin();
        Query query = em.createQuery(jpql);
        List<Employee> li = query.getResultList();
        et.commit();
        for (Employee e : li) {
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSal() + " " + e.getPhno());
        }
    }

    public void getDetailsByName(String name) {
        String jpql = "select e from Employee e where e.name = :name";
        et.begin();
        Query query = em.createQuery(jpql);
        query.setParameter("name", name);
        List<Employee> li = query.getResultList();
        et.commit();
        for (Employee e : li) {
            System.out.println(e.getId() + " " + e.getName() + " " + e.getSal() + " " + e.getPhno());
        }
    }

    public void deleteByName(String name) {
        String jpql = "delete from Employee e where e.name =:name";
        et.begin();
        Query query = em.createQuery(jpql);
        query.setParameter("name", name);
        int deletedCount = query.executeUpdate();
        et.commit();
        if (deletedCount > 0) {
            System.out.println("Record with name '" + name + "' deleted successfully.");
        } else {
            System.out.println("No record found with name '" + name + "'.");
        }
    }
}
