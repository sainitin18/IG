package Ex1;
import java.time.LocalDate;

public class ContactTest {

	public static void main(String[] args) throws InvalidException, StackOverflowException, StackEmptyException {
		LocalDate d = LocalDate.parse("2004-04-21");
		Contact c1 = new Contact("Nitin","Sai","Virat",d,"Female","1234567890");
		Stack s = new Stack(1);
		s.push(c1);
//		Contact c2 = new Contact("Nitin","SaiM","Virat",d,"Male","1234567890");
//		s.push(c2);
//		s.pop();
	}

}
