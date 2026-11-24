package mypack;

public class Person {
	 private String nm;
	 private String address;
	 private int age;
	public Person(String nm,String address,int age) {
		this.nm= nm;
		this.address= address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person name = " + nm + ",\naddress = " + address + ",\nage = " + age;
	}

}
