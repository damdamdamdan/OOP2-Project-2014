//Staff.java

public class Staff 
{	
	//attributes
	private String staffId;
	private String password;
	
	/*no argument constructor method 
	 @param staffId, password*/
	public Staff()
	{
		staffId = "";
		password = "";
	}
	/*multi argument constructor method
	 @param staffid, password*/
	public Staff(String staffId, String password)
	{
		setStaffId(staffId);
		setPassword(password);
	}
	/*mutator method to set up the staffid
	 *@param staffid*/
	
	public void setStaffId(String staff)
	{
		this.staffId = staff;
	}
	/*accessor method to return the staffid
	 *@return the staffid*/
	public String getStaffId()
	{
		return staffId;
	}
	/*mutator method for setting up the password
	 *@param passwoord of the staff*/
	public void setPassword(String pass)
	{
		this.password = pass;
	}
	/*accessor method to return the password
	 *@return the password*/
	public String getPassword()
	{
		return password;
	}
	/**toString method to return the staff details
	 *@return the staffid and password as string*/
	
	public String toString()
	{
		return "Staff Id:" + staffId +"\nPassword:" + password;
	}
	





}//end Class