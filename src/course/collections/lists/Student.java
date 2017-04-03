package course.collections.lists;

public class Student {

	// declaring variables
	private String name;
	private int dob;
	private String sex;
	private int age;
	private int contact;
	
	// Constructor with parameters
	public Student(String name, int dob, String sex, int age, int contact) {
		super();
		this.name = name;
		this.dob = dob;
		this.sex = sex;
		this.age = age;
		this.contact = contact;

	}
	
	// setters and getters methods
	
	// gets String name
	public String getName() {
		
		return name;
	}
	// sets String name
	public void setName(String name) {
		this.name = name;
	}
	// gets date of birth
	public int getDob() {
		return dob;
	}
	// sets date of birth
	public void setDob(int dob) {
		this.dob = dob;
	}
	// gets gender value
	public String getSex() {
		return sex;
	}
	// sets String
	public void setSex(String sex) {
		this.sex = sex;
	}
	// gets age value
	public int getAge() {
		
		return age;
	}
	// sets age value
	public void setAge(int age) {
		this.age = age;
	}
	// gets contact value
	public int getContact() {
		
		return contact;
	}
	// sets contact value
	public void setContact(int contact) {
		this.contact = contact;
	}

}
