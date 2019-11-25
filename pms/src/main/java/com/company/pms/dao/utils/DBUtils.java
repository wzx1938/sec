package com.company.pms.dao.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DBUtils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("tese_c3p0");
	public static QueryRunner getQueryRunner() throws Exception{
	    return new QueryRunner(dataSource);
 }
	 public static void colse(ResultSet rs,PreparedStatement ps,Connection con)throws Exception{
		  if(rs != null)rs.close();
		  if(ps != null)ps.close();
		  if(con != null)con.close();
	 }
}
