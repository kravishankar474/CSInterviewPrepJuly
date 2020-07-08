package keywords;
class Student{
	int rollNo;
	String name;
	static int count = 0;//Static Variables belong to class
	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}
	static void showCount()//Static methods can only use static variables
	{
		System.out.println(count);
//		System.out.println(this.rollNo);
	}
}
public class StaticStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.showCount();
		Student s1 = new Student(100,"Ram");
		System.out.println(Student.count);
		Student s2 = new Student(200,"Sham");
		System.out.println(Student.count);
		Student s3 = new Student(500,"Karma");
		//Task is to find the total number of objects created of Student class
		System.out.println(s1.count);
		System.out.println(s2.count);
		System.out.println(s3.count);// can also call by object
		System.out.println(Student.count); // Can call by class Name, because belongs to class
		Student.showCount();
	}

}
