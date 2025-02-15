//package com.crud.dao; // Corrected package name
//
//import com.crud.model.Employee;
//import jakarta.persistence.*;
//
//import java.util.List;
//
//public class EmployeeDao1 { // Renamed from EmployeeDeo to EmployeeDao
//    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("mayur");
//
//    private EntityManager getEntityManager() {
//        return emf.createEntityManager();
//    }
//
//    public void addEmployee(Employee e) {
//        EntityManager em = getEntityManager();
//        EntityTransaction et = em.getTransaction();
//        try {
//            et.begin();
//            em.persist(e);
//            et.commit();
//        } catch (Exception ex) {
//            et.rollback();
//            ex.printStackTrace();
//        } finally {
//            em.close();
//        }
//    }
//
//    public List<Employee> getAllEmployees() {
//        EntityManager em = getEntityManager();
//        String jpql = "SELECT e FROM Employee e";
//        List<Employee> employees = em.createQuery(jpql, Employee.class).getResultList();
//        em.close();
//        return employees;
//    }
//
//    public List<Employee> getDetailsByName(String name) {
//        EntityManager em = getEntityManager();
//        String jpql = "SELECT e FROM Employee e WHERE e.name = :name";
//        List<Employee> employees = em.createQuery(jpql, Employee.class)
//                .setParameter("name", name)
//                .getResultList();
//        em.close();
//        return employees;
//    }
//
//    public void deleteByName(String name) {
//        EntityManager em = getEntityManager();
//        EntityTransaction et = em.getTransaction();
//        try {
//            et.begin();
//            String jpql = "DELETE FROM Employee e WHERE e.name = :name";
//            Query query = em.createQuery(jpql);
//            query.setParameter("name", name);
//            int deletedCount = query.executeUpdate();
//            et.commit();
//
//            if (deletedCount > 0) {
//                System.out.println("Record with name '" + name + "' deleted successfully.");
//            } else {
//                System.out.println("No record found with name '" + name + "'.");
//            }
//        } catch (Exception ex) {
//            et.rollback();
//            ex.printStackTrace();
//        } finally {
//            em.close();
//        }
//    }
//}
