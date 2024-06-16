package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
//		Department department = new Department(2, null);
		
//		System.out.println("===== Test 1: seller findById =====");
//		Seller seller = sellerDao.findById(3);
//		System.out.println(seller);
//		
//
//		
//		System.out.println("\n===== Test 2: seller findByDepartment =====");
//		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
//		for( Seller sel: list) {
//			System.out.println(sel);
//		}
//		
//		System.out.println("\n===== Test 3: seller findAll =====");
//		List<Seller> listFindAll = sellerDao.findAll();
		
//		System.out.println("\n===== Test 4: seller insert =====");
//		Seller newSeller = new Seller(null,"Greg", "greg@gmail.com", new Date(), 4000.0, department);
//		sellerDao.insert(newSeller);
		
//		System.out.println("\n===== Test 5: seller update =====");
//		Seller newSeller = sellerDao.findById(1);
//		newSeller.setName("Chris");
//		sellerDao.update(newSeller);
//		System.out.println("Update Complete");
		
//		System.out.println("\n===== Test 6: seller delete =====");
//		sellerDao.deleteById(47);	
//		System.out.println("Delete Complete");
	
		
		//DEPARTMENT DAO
		
		
//		System.out.println("===== Test 1: department findById =====");
//		System.out.print("Enter deparment id: ");
//		int id = sc.nextInt();
//		Department newDepartment = departmentDao.findById(id);
//		System.out.println(newDepartment);
		
		System.out.println("\n===== Test 2: department findAll =====");
		List<Department> listFindAll = departmentDao.findAll();
		
		for(Department obj: listFindAll) {
				System.out.println(	obj.toString());
		}
		
//		System.out.println("\n===== Test 3: department insert =====");
//		Department newDepartment = new Department(null, "Sports");
//		departmentDao.insert(newDepartment);

//		System.out.println("\n===== Test 4: department update =====");
//		System.out.print("Enter deparment update name: ");
//		String name = sc.nextLine();
//		System.out.println();
//		Department newDepartment = departmentDao.findById(4);
//		newDepartment.setName(name);
//		departmentDao.update(newDepartment);
//		System.out.println("Update Complete");
		
//		System.out.println("\n===== Test 5: department delete =====");
//		departmentDao.deleteById(8);	
//		System.out.println("Delete Complete");
		
		
	}

}
