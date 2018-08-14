import java.util.HashMap;
import java.util.Map;

class Address {

	private String address1;

	private String address2;

	private String city;

	private String state;

	private String country;

	public Address(String city, String state, String country) {

		this.city = city;
		this.state = state;
		this.country = country;
	}

}

class User {

	private String firstName;
	private String lastName;

	public User(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder().append(firstName).append(" ").append(lastName);
		return builder.toString();
	}

}

public class OutOfMemoryEg1 {

	private Map<User, Address> leakingMap = new HashMap<User, Address>();

	/**
	 * Keeps adding user and their address infinitely.
	 */
	public void addAddresses() {

		for (int counter = 0;; ++counter) {

			User user = new User("fName" + counter, "Name" + counter);
			Address address = new Address("Bangalore", "KA", "India");
			leakingMap.put(user, address);
			System.out.println("added: " + user);
		}
	}

	public static void main(String args[]) {

		new OutOfMemoryEg1().addAddresses();
	}
}