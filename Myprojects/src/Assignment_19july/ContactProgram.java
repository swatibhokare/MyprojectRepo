package Assignment_19july;

class Contact {
	String contactperson;
	String mobilenumber;
	String email;

	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contact(String contactperson, String mobilenumber, String email) {
		super();
		this.contactperson = contactperson;
		this.mobilenumber = mobilenumber;
		this.email = email;
	}

	public void PrintContact() {
		System.out.println(contactperson);
		System.out.println(mobilenumber);
		System.out.println(email);
	}
}

class CompanyCotact extends Contact {

	String companyname;
	String website;
	String department;
	String city;
	String country;
	String address;
	int pin;

	public CompanyCotact(String contactperson, String mobilenumber, String email, String companyname, String website,
			String department, String city, String country, String address, int pin) {
		super(contactperson, mobilenumber, email);
		this.companyname = companyname;
		this.website = website;
		this.department = department;
		this.city = city;
		this.country = country;
		this.address = address;
		this.pin = pin;
	}

	public void PrintContact() {
		System.out.println(companyname);
		System.out.println(website);
		System.out.println(department);
		System.out.println(city);
		System.out.println(country);
		System.out.println(address);
		System.out.println(pin);

	}
}

class EmployeeContact extends Contact {
	String city;
	String country;
	int pin;
	String designation;
	String dateofbirth;

	public EmployeeContact(String contactperson, String mobilenumber, String email, String city, String country,
			int pin, String designation, String dateofbirth) {
		super(contactperson, mobilenumber, email);
		this.city = city;
		this.country = country;
		this.pin = pin;
		this.designation = designation;
		this.dateofbirth = dateofbirth;
	}

	public void PrintContact() {
		System.out.println(city);
		System.out.println(country);
		System.out.println(pin);
		System.out.println(designation);
		System.out.println(dateofbirth);

	}
}

public class ContactProgram {

	public static void main(String[] args) {
       Contact contact =new Contact("Sachin", "9809809809", "sachin@gmail.com");
       contact.PrintContact();
       
       EmployeeContact employeeContact = new EmployeeContact("Sachin", "9809809809", "sachin@gmail.com","latur", "india", 412315,"tester","30/04/1994");
       employeeContact.PrintContact();
	}

}
