package collection;

//created by Dipali Jambhale 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	int rollNumber, age;
	String name;

	public Student(int rollNumber, int age, String name) {
		super();
		this.rollNumber = rollNumber;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;

	}

}

public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		list.add(new Student(101, 20, "Megha"));
		list.add(new Student(101, 20, "Megha"));
		list.add(new Student(101, 20, "Megha"));
		list.add(new Student(101, 20, "Megha"));
		list.add(new Student(101, 20, "Megha"));

		Collections.sort(list);

		System.out.println("list after Sorting :");
		for (Student student : list) {
			System.out.println(student);
		}
	}

}
