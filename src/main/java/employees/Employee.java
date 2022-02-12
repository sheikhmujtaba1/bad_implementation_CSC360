package employees;

public abstract class Employee
{
	String name;
	Float hours_worked;
	Float pay_rate;
	does_something calc_using_somethings;

	
	/**
	 * @param name
	 * @param hours_worked
	 * @param pay_rate
/*<<<<<<< HEAD
	 * @param calc_using_somethings
=======
	 * @param cp
>>>>>>> a0eb294e773cdc5d76535783ab8b89a5a5d7415c*/
	public Employee(String name, float hours_worked, float pay_rate)
	{
		super();
		this.name = name;
		this.hours_worked = hours_worked;
		this.pay_rate = pay_rate;
		this.calc_using_somethings = null;
	}
	
	
	public Employee()
	{
		
	}
	
	public float pay_behavior()
	{
		return calc_using_somethings.do_it(hours_worked, pay_rate);
	}
	/**
	 * @return the name
	 */
	public String getName(){return name;}
	/**
	 * @param name the name to set
	 */
	public void setName(String name){this.name=name;}
	/**
	 * @return the hours_worked
	 */
	public float getHours_worked()
	{
		return hours_worked;
	}
	/**
	 * @param hours_worked the hours_worked to set
	 */
	public void setHours_worked(float hours_worked)
	{
		this.hours_worked = hours_worked;
	}
	/**
	 * @return the pay_rate
	 */
	public float getPay_rate()
	{
		return pay_rate;
	}
	/**
	 * @param pay_rate the pay_rate to set
	 */
	public void setPay_rate(float pay_rate)
	{
		this.pay_rate = pay_rate;
	}
	

}
