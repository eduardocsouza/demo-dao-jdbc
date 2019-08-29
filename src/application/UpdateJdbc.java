package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class UpdateJdbc {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.creatorSellerDao();
		
		Department dep = new Department(4, null);
		
		Seller seller = new Seller(10, "duduok", "dudu@gmail.com", new Date(), 4500.0, dep);
		
		sellerDao.update(seller);
		System.out.println(seller);
		
	}
	
}
