package com.mind.project.shared.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mind.project.shared.model.Employee;

public class ManagerDB {
	
	public  static Map<Integer,List<Integer> > mgr = new HashMap<Integer,List<Integer> >();
//	public ArrayList<Employee> manager=new ArrayList<Employee>();
	
	
	public void addReportees(Integer mgr_id, List<Integer> emplist)
	{
		mgr.put(mgr_id, emplist);
		
	}
	
    public int getMapCount()
    {
    	System.out.println("The size of the manager map is" +mgr.size());
    	return mgr.size();
    }

	public boolean searchManageRUserName(Integer UserId) {
		
if(mgr.containsKey(UserId))
{
	return true;
}
else
{
	return false;
}
		
		
	}
  

	/*public boolean searchManagerIdAndPassword(Employee employee) {
		// TODO Auto-generated method stub
	if(manager.contains(employee))
	{
		System.out.println("Manager id and password");	
	return true;
	}
	else
	{
	return false;
	}
	}

	public void addManager(Employee employee1) {
		// TODO Auto-generated method stub
		manager.add(employee1);
		System.out.println("Manager database");
		
	}*/
	

}
