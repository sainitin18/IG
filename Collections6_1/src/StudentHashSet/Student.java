package StudentHashSet;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    public Student(String firstName, String lastName, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }
    
	@Override
	public int hashCode() {
		return Objects.hash(address, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}
    
}
