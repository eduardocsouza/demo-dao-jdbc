package application;

import java.util.List;

import model.dao.DepDaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DepDaoFactory.creatorDepartmentDao();
		
		System.out.println("=== test 1: findById ====");
		Department dep = depDao.findByld(3);
		
		System.out.println(dep);
		
		System.out.println("\n=== test 2: findAll ====");
		
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		/*
		System.out.println("\n=== test 3: insert ====");

		Department newDep = new Department(null, "music");
		depDao.insert(newDep);
		System.out.println("New ID: " + newDep.getId());	
		
		System.out.println("\n=== test 4: upDate ====");
		*/
		dep = depDao.findByld(3);
		dep.setName("Food");
		depDao.update(dep);
		
		System.out.println("\n=== test 5: Delete ====");

		depDao.deleteByld(13);
		depDao.deleteByld(10);
		depDao.deleteByld(9);
		depDao.deleteByld(7);
		depDao.deleteByld(6);
	}
}
