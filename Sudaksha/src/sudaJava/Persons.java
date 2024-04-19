package sudaJava;

public class Persons {
int code;
String name;
public Persons() {
	
}
public Persons(int code, String name) {
	this.code = code;
	this.name = name;
}

public int getCode() {
	return code;
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Persons [code=" + code + ", name=" + name + "]";
}

}
