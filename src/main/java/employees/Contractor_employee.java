package employees;

public class Contractor_employee extends human
{
	public Contractor_employee(String name, float hours_worked, float pay_rate)
	{
		super(name, hours_worked, pay_rate);
		calc_using_somethings = new pay_contractor();
	}
}
