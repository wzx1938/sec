package com.company.pms.dao.idao;

import com.company.pms.dao.pojo.NewReportOne;
import com.company.pms.dao.pojo.NewReportTwo;

import java.util.List;

public interface INewReportOneDao {
	  List<NewReportOne> FindByDate(String BeginHiredate, String EndHiredate) throws Exception;
	  List<NewReportTwo> FindbyDate(String Begindate, String Enddate) throws Exception;

}
