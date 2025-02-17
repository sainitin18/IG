package Ex1;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Contact {

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String mobileNumber;

    public Contact(String firstName, String middleName, String lastName, LocalDate dateOfBirth, String gender, String mobileNumber) throws InvalidException {
        validate(firstName, lastName, dateOfBirth, gender, mobileNumber);

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
    }
    
    public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}

	private void validate(String firstName, String lastName, LocalDate dateOfBirth, String gender, String mobileNumber) throws InvalidException {
        if (firstName == null || firstName.isEmpty()) 
            throw new InvalidException("First name cannot be null");
        if (lastName == null || lastName.isEmpty()) 
            throw new InvalidException("Last name cannot be null");
        if (dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) 
            throw new InvalidException("Enter valid Date of birth");
        if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")) 
            throw new InvalidException("Gender must be Male or Female");
        if (!Pattern.matches("\\d{10}", mobileNumber)) 
            throw new InvalidException("Mobile number must have 10 digits.");
    }

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName;
    }
}
