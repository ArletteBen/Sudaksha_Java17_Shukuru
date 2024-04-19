package PersonDetails;

public class Person {
private int id;
private String fname;
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Person [id=" + id + ", fname=" + fname + ", email=" + email + "]";
}

}
