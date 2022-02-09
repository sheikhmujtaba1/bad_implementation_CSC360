package employees;

public class Salaried_employee extends Employee
{
	public Salaried_employee(String name, float hours_worked, float pay_rate)
	{
		super(name, hours_worked, pay_rate);
		calcpay = new pay_salaried();
	}
}
