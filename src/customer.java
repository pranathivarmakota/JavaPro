import java.util.Objects;

public class Customer {
	private static int count;
	private int customerId;
	private String name;
	private String location;
	String email;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Customer.count = count;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Customer(int customerId, String name, String location, String email){
		this.customerId = customerId;
		this.name=name;
		this.location=location;
		this.email=email;
	}
	public String toString() {
		return customerId+"\t"+name+"\t"+location+"\t"+email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, email, location, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId && Objects.equals(email, other.email)
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name);
	}
	
}
