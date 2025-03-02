package model;

public class Doctor {
	int id;
	String name;
	String spec;
	
//	public Doctor(int id, String name, String spec) {
//		// TODO Auto-generated constructor stub
//		this.id = id;
//		this.name = name;
//		this.spec = spec;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpec() {
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", spec=" + spec + "]";
	}
	
}
