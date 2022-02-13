package employees;

public class has_somethingtodowithhuman extends human
{
	public has_somethingtodowithhuman(String name, float hours_worked, float pay_rate)
	{
		super(name, hours_worked, pay_rate);
		calc_using_somethings = new ph();
	}

}
