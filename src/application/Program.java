package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seler, findById ====");
		Seller seller = sellerDao.findById(14);
		
		System.out.println(seller);

		
	}

}
