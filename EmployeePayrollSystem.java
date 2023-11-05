import java.util.ArrayList;
abstract class Employee{
	private String name;
	private int id;
	public Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public abstract double caculateSallery();
	@Override
	public String toString(){
		return "Employee[name="+name+" , id="+id+" , salary="+caculateSallery()+"]";
	}
}



class FullTimeEmployee extends Employee{
	private double monthsalary;
	public FullTimeEmployee(String name,int id,double monthsalary){
		super(name,id);
		this.monthsalary=monthsalary;
	}
	@Override
	public double caculateSallery(){
		return monthsalary;
	}
}

class PartTimeEmployee extends Employee{
	private int hoursWork;
	private int hoursRate;
	public PartTimeEmployee(String name,int id,int hoursWork,int hoursRate){
		super(name,id);
		this.hoursRate=hoursRate;
		this.hoursWork=hoursWork;
	}

	@Override
	public double caculateSallery(){
		return hoursWork*hoursRate;
	}
}


class PayrollSystem{
	private ArrayList<Employee> emp;

	public PayrollSystem(){
		emp=new ArrayList<>();
	}
	public void addEmployee(Employee empl){
		emp.add(empl);
	}
	public void removeEmployee(int id){
		Employee empToRemove=null;
		for(Employee empp : emp){
			if(empp.getId()==id){
				empToRemove=empp;
				break;
			}
		}
		if(empToRemove!=null){
			emp.remove(empToRemove);
		}
		else{
			System.out.println("Employee does not exist");
		}
	}
	public void displayEmployes(){
		for(Employee empp: emp){
			System.out.println(empp);
		}
	}
}

public class EmployeePayrollSystem{
	public static void main(String[] args) {
		PayrollSystem system=new PayrollSystem();
		FullTimeEmployee emp1=new FullTimeEmployee("Sumit",101,56000.0);
		PartTimeEmployee emp2=new PartTimeEmployee("Vinay",102,40,1000);
		system.addEmployee(emp1);
		system.addEmployee(emp2);
		System.out.println("Initial Details : ");
		system.displayEmployes();
		System.out.println("Remove Employee");
		system.removeEmployee(102);
		System.out.println("Remaining Employees");
		system.displayEmployes();
		
	}
}