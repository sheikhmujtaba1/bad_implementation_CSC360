package employees;

public class pay_salaried implements does_something
{

	@Override
	public float thing(float h, float pay_rate)
	{
		float total_pay;
		h = 40;
		total_pay = pay_rate*h;
		return total_pay;
	}

}
