package employees;

public abstract class human
{
	String s;
	Float hw;
	Float pr;
	does_something calc_using_somethings;
	
	/**
	 * @param s
	 * @param hw
	 * @param f
	 * @param calc_using_somethings
	 **/
	public human(String s, float hw, float f)
	{
		super();
		this.s = s;	// the name of the employee
		this.hw = hw;	// the number of hours the employee worked
		this.pr = f;
		this.calc_using_somethings = null;
	}
	
	
	public human()
	{
		
	}
	
	public float pay_behavior()
	{
		return calc_using_somethings.do_it(hw, pr);
	}
	/**
	 * @return the name
	 */
	public String gN(){return s;}
	/**
	 * @param name the name to set
	 */
	public void sN(String name){this.s=name;}
	/**
	 * @return the hours_worked
	 */
	public float gHW(){return hw;}
	/**
	 * @param hours_worked the hours_worked to set
	 */
	public void sHW(float hours_worked){this.hw=hours_worked;}
	/**
	 * @return the pay_rate
	 */
	public float gPR(){return pr;}
	/**
	 * @param pay_rate the pay_rate to set
	 */
	public void setPay_rate(float pay_rate){this.pr = pay_rate;}
	

}
