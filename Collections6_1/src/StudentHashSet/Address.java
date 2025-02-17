package StudentHashSet;

import java.util.Objects;

public class Address {
	    private String street;
	    private String city;
	    private String state;

	    public Address(String street, String city, String state) {
	        this.street = street;
	        this.city = city;
	        this.state = state;
	    }
	    
		@Override
		public int hashCode() {
			return Objects.hash(city, state, street);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Address other = (Address) obj;
			return Objects.equals(city, other.city) && Objects.equals(state, other.state)
					&& Objects.equals(street, other.street);
		}

		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", state=" + state + "]";
		}
}
