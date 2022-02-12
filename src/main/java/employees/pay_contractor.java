package employees;

public class pay_contractor implements does_something
{

	public float do_it(float hours, float pay_rate)
	{
		float total_pay;
		total_pay = hours*pay_rate;
		return total_pay;
		
	}
}
