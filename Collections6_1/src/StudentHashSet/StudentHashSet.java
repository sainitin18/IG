package StudentHashSet;

import java.util.HashSet;
public class StudentHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> students = new HashSet<>();

        Address addr1 = new Address("4th phase", "Hyderabad", "Telangana");
        Address addr2 = new Address("DED", "Chennai", "Tamil Nadu");

        Student s1 = new Student("Virat", "Kohli", 20, addr1);
        Student s2 = new Student("Rohit", "Sharma", 22, addr2);
        Student s3 = new Student("Virat", "Kohli", 21, addr1); 

        students.add(s1);
        students.add(s2);
        students.add(s3); 

        System.out.println("Students in HashSet:");
        for (Student s : students) {
            System.out.println(s);
        }
	}

}
