//Person.java
/**This is an instantiable Person class.
 @Daniel Ufir
 @version 1.7*/

public class Person
{
	//attributes
	//forename of guest
	private String forename;
	//surname of guest
	private String surname;
	//age
	private int age;
	//phone number	
	private int mNumber;
	
	/**no argument constroctor method
	 @param forename, surname, age, number*/
	public Person()
	{
		forename = "null";
		surname = "null";
		age = 0;
		mNumber = 0;
		
	}	
	/**multi argument constructor method
	 @param forename, surname, age, number*/
	public Person(String mForename, String mSurname, int mAge, int number)
	{
		setForename(mForename);
		setSurname(mSurname);
		setAge(mAge);
		setNumber(number);
	}
	/** mutator method for setting up the forename of the guest
	 @param forename of the guest*/
	public void setForename(String mForename)
	{
		this.forename = mForename;
	}
	/** acessor method to return the guests forename
	 *@return the forename of the guest */
	public String getForename()
	{
		return forename;
	}
	/** mutator method for setting up the surname of the guest
	 @param surname of the guest*/
	public void setSurname(String mSurname)
	{
		this.surname = mSurname;
	}
	/** acessor method to return the guests surname
	 *@return the surname of the guest */
	public String getSurname()
	{
		return surname;
	}
	/** mutator method for setting up the age of the guest
	 *@param age of the guest*/
	public void setAge(int mAge)
	{
		this.age = mAge;
	}
	/** acessor method to return the guests age
	 *@return the age of the guest */
	public int getAge()
	{
		return age;
	}
	/** mutator method for setting up the number of the guest
	 *@param number of the guest*/
	public void setNumber(int number)
	{
	
		this.mNumber = number;
	}
	/** acessor method to return the guests number
	 *@return the number of the guest */
	public int getNumber()
	{
		return mNumber;
	}
	/*toSTring method to return the guests details
	 *@return the forename, surname, age and number as string*/
	public String toString()
	{
		return "Forename:\t " + getForename() + "\nSurname: \t" + getSurname() + "\nAge:\t " + getAge() + "\nPhone Number:\t " + getNumber();
	}
}//end Person class