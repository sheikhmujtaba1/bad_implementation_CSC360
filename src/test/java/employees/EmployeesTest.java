package employees;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeesTest
{
	ArrayList<Employee> all_employees;
	ArrayList<Float> pays;
	

	@BeforeEach
	void setUp() throws Exception
	{
		all_employees = new ArrayList<Employee>();
		Employees.addEmployee("eli", 41f, 7.25f, 2, all_employees);
		Employees.addEmployee("hayata", 41f, 7.25f, 1, all_employees);
		Employees.addEmployee("son", 41f, 7.25f, 0, all_employees);
		Employees.addEmployee("gif", 32f, 10f, 0, all_employees);
		Employees.addEmployee("son", 32f, 9f, 1, all_employees);
		Employees.addEmployee("son", 30f, 80f, 2, all_employees);
		pays = Employees.pay_all(all_employees);
	}

	@Test
	void testPay()
	{
		ArrayList<Float> rightPays = new ArrayList<>();
		rightPays.add(297.25f);
		rightPays.add(300.875f);
		rightPays.add(290.0f);
		rightPays.add(400.0f);
		rightPays.add(288.0f);
		rightPays.add(2400.0f);
		assertEquals(rightPays, pays);
	}
	
	@Test
	void Testnames()
	{
		String name = "eli";
		assertEquals(all_employees.get(0).name, name);
		
	}

}
