package employees;

public class Hourly_employee extends Employee
{
	public Hourly_employee(String name, float hours_worked, float pay_rate)
	{
		super(name, hours_worked, pay_rate);
		calcpay = new pay_hourly();
	}

}
