public class Student{
	private String name;
	private int age;
	private String ID;
	
	public String getName(){ return name; }
	public int getAge() { return age;}
	public String getID() { return ID;}
	
	public void setName(String name) { 
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public Student() {
		name = "Undefined";
		age = 0;
		ID = "Undefined";
	}
	
	public Student(Student s1) {
		this.name = s1.getName();
		this.age = s1.getAge();
		this.ID = s1.getID();
	}
	
	public Student(String name , int age , String ID) {
		this.name = name;
		this.age = age;
		this.ID = ID;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(ID);
		System.out.println("-------------------");
	}
	
	
	
	
}