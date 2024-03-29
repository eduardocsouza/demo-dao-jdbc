package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		 
		 SellerDao sellerDao = DaoFactory.creatorSellerDao();
		 
		 System.out.println("=== TEST 1: Seller findById ===");
		 Seller seller = sellerDao.findByld(3);
		 
		 System.out.println(seller);
		 
		 System.out.println("\n=== TEST 2: Seller findByDepartment ====");
		 Department department = new Department(2, null);
		 
		 List<Seller> list = sellerDao.findByDepartment(department);
		 for(Seller obj : list) {
			 System.out.println(obj);
		 }
		 
		 System.out.println("\n=== TEST 3: Seller findByAll ====");

		 list = sellerDao.findAll();
		 for(Seller obj : list) {
			 System.out.println(obj);
		 }
		 
		 System.out.println("\n=== TEST 4: Seller insert implementation ====");
		 
		 Seller newSeller = new Seller(null, "michael", "mic@gmail.com", new Date(), 4000.0, department);

		 sellerDao.insert(newSeller);
		 System.out.println("Novo Id = " + newSeller.getId());
		 
		
		 System.out.println("\n=== TEST 5: Seller Update ====");
		 seller = sellerDao.findByld(11);
		 seller.setName("bob2");
		 sellerDao.update(seller);
		 seller.setEmail("jack@gmail.com");
		 sellerDao.update(seller);
		 
		 System.out.println("Update ok!");

		 
		 
	}

}
