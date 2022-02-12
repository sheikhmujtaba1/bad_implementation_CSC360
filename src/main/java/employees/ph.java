package employees;

public class ph implements does_something
{

	@Override
	// Does a thing in order to make the thing instead do something else
	public float thing(float h, float pr)
	{
		float tp = 0;
		float r = 0;
		// Checks if the thing is less than something
		if (h<=40)
		{
			tp = h*pr;
		}
		// If thing is not less than something do something else
		else
		{
			r = h-40;
			tp = (float) (40*pr + r*(1.50*pr));
			
		}
		// Give back a thing
		return tp;
	}

}
