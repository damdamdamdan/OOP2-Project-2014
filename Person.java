

public class Person
{
	private String forename;
	private String surname;
	private int age;
	private String gender;
	
	//no argument constructor 
	public Person()
	{
		forename = "null";
		surname = "null";
		age = 0;
		gender = "u";
	}	
	//multi argument constructor
	public Person(String mForename, String mSurname, int mAge, String mGender)
	{
		setForename(mForename);
		setSurname(mSurname);
		setAge(mAge);
		setGender(mGender);
	}
	//constructor for setting the name
	public void setForename(String mForename)
	{
		this.forename = mForename;
	}
	//constructor for getting the name
	public String getForename()
	{
		return forename;
	}
	//constructor for setting the surname
	public void setSurname(String mSurname)
	{
		this.surname = mSurname;
	}
	//constructor for getting the surname
	public String getSurname()
	{
		return surname;
	}
	//constructor for setting the age
	public void setAge(int mAge)
	{
		this.age = mAge;
	}
	//constructor for getting the age
	public int getAge()
	{
		return age;
	}
	//constructor for setting the gender
	public void setGender(String mGender)
	{
	
		this.gender = mGender;
	}
	//constructor for getting the gender
	public String getGender()
	{
		return gender;
	}
	//overiding the toString method
	public String toString()
	{
		return "Forename:" + getForename() + "\nSurname:" + getSurname() + "\nAge:" + getAge() + "\nGender:" + getGender();
	}
}//end Person class