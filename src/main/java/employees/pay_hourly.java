package employees;

public class pay_hourly implements does_something
{

	@Override
	public float do_it(float h, float pay_rate)
	{
		float total_pay = 0;
		float remainder = 0;
		
		if (h<=40)
		{
			total_pay = h*pay_rate;
		}
		else
		{
			remainder = h-40;
			total_pay = (float) (40*pay_rate + remainder*(1.50*pay_rate));
			
		}
		
		return total_pay;
	}

}
