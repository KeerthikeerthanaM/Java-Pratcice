
public class EmployeeConst {
	int id;
	String name;
	int salary;
	
	EmployeeConst()
	{
		
	}
	EmployeeConst(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	void show()
	{
		System.out.println("The Employee ID is:"+id+ " Name is:"+name+ " and the salary is:"+salary);
	}
	public static void main(String args[])
	{
		EmployeeConst e=new EmployeeConst(146,"Geetha",20000);
		e.show();
	}
	
	

}
