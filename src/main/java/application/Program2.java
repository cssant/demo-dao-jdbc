package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println();

        System.out.println("=== TEST 1: department FindAll ===");
        List<Department> list = departmentDao.findAll();

        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println();

        System.out.println("=== TEST 2: department FindById ===");
        System.out.print("Insert an ID to find: ");
        int id = sc.nextInt();
        sc.nextLine();
        Department dep = departmentDao.findById(id);

        if (dep != null) {
            System.out.println(dep);
        }
        else {
            System.out.println("Department not found!");
        }

        System.out.println();

        System.out.println("=== TEST 3: department Insert ===");
        System.out.print("Name for new department: ");
        String name = sc.nextLine();
        Department newDepartment = new Department(null, name);
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        sc.close();
    }

}
