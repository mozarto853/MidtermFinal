package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/

	public String name;
	public String id;
	public String salary;
	public String dOB;
	public String number;
	public String ssn;
	public String position;

	public String getEmployeeDetails(){
		return name + id + salary + dOB + number + ssn + position;
	}

	public static void printEmployee(EmployeeInfo e){
		System.out.println(e.getEmployeeDetails());
	}

	public static void employeeBonus(EmployeeInfo b){
		System.out.println(EmployeeInfo.calculateEmployeeBonus(10,1));
	}

	}


