package employees;

public class Contractor_employee extends Employee
{
	public Contractor_employee(String name, float hours_worked, float pay_rate)
	{
		super(name, hours_worked, pay_rate);
		calcpay = new pay_contractor();
	}
}
