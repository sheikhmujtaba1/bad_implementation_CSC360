package employees;

public abstract class Employee
{
	String name;
	Float hours_worked;
	Float pay_rate;
	
	Calculate_pay calcpay;
	
	/**
	 * @param name
	 * @param hours_worked
	 * @param pay_rate
	 * @param calcpay
	 */
	public Employee(String name, float hours_worked, float pay_rate)
	{
		super();
		this.name = name;
		this.hours_worked = hours_worked;
		this.pay_rate = pay_rate;
		this.calcpay = null;
	}
	
	
	public Employee()
	{
		
	}
	
	public float pay_behavior()
	{
		return calcpay.calc_pay(hours_worked, pay_rate);
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
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
