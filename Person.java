

public class Person
{
	private String forename;
	private String surname;
	private int age;
	private char gender;
	
	//no argument constructor 
	public Person()
		name = "null";
		age = 0;
		gender = 'u';
		
	//argument constructor
	public Person(String mForename, String mSurname, int mAge, char mGender)
	{
		setForename(mForename);
		setSurnmae(mSurname);
		setAge(mAge);
		setGender(mGende)r;
	}
	
	public void setForname(String mForename)
	{
		this.forename = mForename;
	}
	
	public void getForename()
	{
		return forename;
	}
	
	public void setSurname(String mSurname)
	{
		this.surname = mSurname;
	}
	
	public void setAge(int mAge)
	{
		this.age = mAge;
	}
	
	public void getAge()
	{
		return age;
	}
	
	public void setGender(char mGender)
	{
		this.gender = mGender;
	}
	
	public void getGender
	{
		return gender;
	}
	
	public String toString()
	{
		return getForename() + "\n" + getSurname() + "\n" + getAge() + "\n" + getGender;
	}
}//end Person class