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
        Department dep = departmentDao.findById(id);

        System.out.println(dep);


        sc.close();
    }

}
