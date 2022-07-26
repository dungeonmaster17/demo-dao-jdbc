package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() { //hiding implemen
		return new SellerDaoJDBC();
	}
}
