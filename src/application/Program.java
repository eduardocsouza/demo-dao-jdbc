package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		 
		 SellerDao sellerDao = DaoFactory.creatorSellerDao();
		 
		 System.out.println("=== TEST 1: Seller findById ===");
		 Seller seller = sellerDao.findByld(3);
		 
		 System.out.println(seller);
	}

}
