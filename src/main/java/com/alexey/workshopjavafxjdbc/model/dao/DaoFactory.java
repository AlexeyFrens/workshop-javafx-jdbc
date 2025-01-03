package com.alexey.workshopjavafxjdbc.model.dao;


import com.alexey.workshopjavafxjdbc.db.DB;
import com.alexey.workshopjavafxjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.alexey.workshopjavafxjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
