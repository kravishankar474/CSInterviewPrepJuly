package first;
class Student{
	String name;
	int marks;
	boolean checkPass(){
		if(marks>40) 
			{
				return true;
			}
		else {
			return false;
		}
	}
	

	int findMax(int a,int b,int c)
	{
		if(a>b) //Nested If-Else
		{
			if(a>c)
			{
				return a;
			}
			else {
				return c;
			}
		}
		else {
			if(b>c) 
				{
					return b;
				}
			else {
				return c;
			}
		}
	}
	
	void checkVowel(char c)
	{
		switch(c) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
			//default case, if none of the above run.
		default:
			System.out.println("Consonent");
			break;
		}
	}
}
public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.name = "Ram";
		s1.marks = 80;
		Student s2 = new Student();
		s2.name = "Sham";
		s2.marks = 35;
		System.out.println(s1.checkPass());
		System.out.println(s2.checkPass());
		//Check max of 3 numbers
		int x = s1.findMax(10,20,30);
		System.out.println(x);
		s1.checkVowel('a');
	}

}
