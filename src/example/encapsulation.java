package example;
//Encapsulation--Bindind data with methods
//Encapsulation--wrapping data and code together as single unit.
//By this we can achieve data hiding becuase other class will not be able to access data through private data members.
class studentdata{
	//we can create fully encapsulated class in java by making all data members of class private
	//And we can create getter and setter methods to get and set the data in it.
	//so data members will be private and getter and setter methds will be public.
	private int rollno;
	private String name;
	
	//Getter and setter methods which are public
	public void setRollno(int r) {
		rollno = r;
	}
	public int getRollno() {
		return rollno;
	}
	public void setname(String name) {
		this.name = name;//using this keyword--which refers current object or we can use below method
		//we can define string n as parameter and then name=n
	}
	public String getname() {
		return name;
	}
}
public class encapsulation {

	public static void main(String[] args) {
		studentdata s1 = new studentdata();
		s1.setRollno(4);
		s1.setname("gayathri");
		System.out.println(s1.getRollno());
		System.out.println(s1.getname());
	}

}
