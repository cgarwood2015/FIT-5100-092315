package ch02;

public class Employee {
	private String fName;  //Instance variable first name
	private String lName;  //Instance variable last name
	private double mthSalary;  //Salary
	
	
	public Employee(String fName,String lName,double mthSalary){
		this.fName = fName;
		this.lName = lName;
		this.mthSalary = mthSalary;
	}
	

	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public double getMthSalary() {
		return mthSalary;
	}


	public void setMthSalary(double mthSalary) {
		if(mthSalary > 0.0)
			this.mthSalary = mthSalary;
	}

}


