//Staff.java

public class Staff 
{	
	private String staffId;
	private String password;
	
	
	public Staff()
	{
		staffId = "";
		password = "";
	}
	
	public Staff(String staffId, String password)
	{
		setStaffId(staffId);
		setPassword(password);
	}
	
	public void setStaffId(String staff)
	{
		this.staffId = staff;
	}
	
	public String getStaffId()
	{
		return staffId;
	}
	
	public void setPassword(String pass)
	{
		this.password = pass;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String toString()
	{
		return "Staff Id:" + staffId +"\nPassword:" + password;
	}
	





}//end Class