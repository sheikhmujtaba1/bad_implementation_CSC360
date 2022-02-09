package employees;

public class pay_contractor implements Calculate_pay
{

	public float calc_pay(float hours, float pay_rate)
	{
		float total_pay;
		total_pay = hours*pay_rate;
		return total_pay;
		
	}
}
