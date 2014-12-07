//Person.java

public class Person
{
	//forename of guest
	private String forename;
	//surname of guest
	private String surname;
	//age
	private int age;
	//phone number	
	private int mNumber;
	
	//no argument constructor 
	public Person()
	{
		forename = "null";
		surname = "null";
		age = 0;
		mNumber = 0;
		
	}	
	//multi argument constructor
	public Person(String mForename, String mSurname, int mAge, int number)
	{
		setForename(mForename);
		setSurname(mSurname);
		setAge(mAge);
		setNumber(number);
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
	public void setNumber(int number)
	{
	
		this.mNumber = number;
	}
	//constructor for getting the gender
	public int getNumber()
	{
		return mNumber;
	}
	//overiding the toString method
	public String toString()
	{
		return "Forename:" + getForename() + "\nSurname:" + getSurname() + "\nAge:" + getAge() + "\nPhone Number:" + getNumber();
	}
}//end Person class