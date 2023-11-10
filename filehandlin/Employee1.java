package filehandlin;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee1 implements Serializable {

	private String dept;
	private String desg;
	private String doj;

	public Employee1() {
		super();
	}

	public Employee1(String dept, String desg, String doj) {
		super();
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return dept+","+desg+","+doj;
	}
	
	

}
