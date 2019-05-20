package com.jiaju.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.jiaju.dao.CompanyDao;
import com.jiaju.entity.Company;
import com.jiaju.util.DBManager;

public class CompanyDaoImpl implements CompanyDao {

	public Company queryCompany() {
		Company company = new Company();
		
		ResultSet rs = DBManager.querySQL("select * from company;");
		try {
			while (rs.next()){
				company.setId(rs.getInt(1));
				company.setName(rs.getString(2));
				//....
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return company;
	}

}
