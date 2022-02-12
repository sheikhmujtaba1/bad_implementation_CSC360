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
	 * @param calc_using_somethings
	 **/
	public Employee(String name, float hours_worked, float pay_rate)
	{
		super();
		this.name = name;	// the name of the employee
		this.hours_worked = hours_worked;	// the number of hours the employee worked
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
	public String gN(){return name;}
	/**
	 * @param name the name to set
	 */
	public void sN(String name){this.name=name;}
	/**
	 * @return the hours_worked
	 */
	public float gHW(){return hours_worked;}
	/**
	 * @param hours_worked the hours_worked to set
	 */
	public void sHW(float hours_worked){this.hours_worked=hours_worked;}
	/**
	 * @return the pay_rate
	 */
	public float gPR(){return pay_rate;}
	/**
	 * @param pay_rate the pay_rate to set
	 */
	public void setPay_rate(float pay_rate){this.pay_rate = pay_rate;}
	

}
