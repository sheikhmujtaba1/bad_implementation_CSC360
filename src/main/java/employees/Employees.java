package employees;

import java.util.*;

public class Employees
{

	/* salaried = 0, hourly = 1 and contractor = 2*/
	public static void addEmployee(String name, float hours_worked, float pay_rate, int i, ArrayList<human> all_employees)
	{
		human x = null;
		if (i==0)
			{
				x = new someone(name, hours_worked, pay_rate);
			}
		else if (i==1)
			{
				x = new he(name, hours_worked, pay_rate);
			}
		else if (i==2)
			{
				x = new Contractor_employee(name, hours_worked, pay_rate);
			}
		
		all_employees.add(x);
	}
	
	public static ArrayList<Float> pay_all(ArrayList<human> all_employees)
	{
		int len = all_employees.size();
		int i;
		human curr_emp;
		ArrayList<Float> pay_stub = new ArrayList<Float>();
		for (i=0; i<len; i++)
		{
			curr_emp = all_employees.get(i);
			Float pay = curr_emp.pay_behavior();
			
			pay_stub.add(pay);		
		}
		return pay_stub;
	}
	
	public static void main(String args[])
	{
		ArrayList<human> all_employees = new ArrayList<human>();
		addEmployee("eli", 41f, 7.25f, 2, all_employees);
		System.out.println(all_employees.get(0).s);
		pay_all(all_employees);
		ArrayList<Float> pays = pay_all(all_employees);
		System.out.println(pays.get(0));
		
	}
	
	

}
