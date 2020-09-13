package com.jwj.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.jwj.db.Utils;
import com.jwj.vo.Admin;

public class AdminDao {
	/*
	 * ½ÇÉ«µÇÈë
	 */
QueryRunner qr= new QueryRunner();
public Admin findbyNameAndPassword(String adminname,String adminpassword)
{ String sql="select adminname,adminpassword from adminlogin where adminname=? and adminpassword=?";
	 Admin a=null;
	 try {
		a=qr.query(Utils.getConnection(), sql, new BeanHandler<Admin>(Admin.class),adminname,adminpassword);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return a;
}

}
