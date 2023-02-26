package class001;

public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.setName(name);
		this.setSalary(salary);
		this.setWorkHours(workHours);
		this.setHireYear(hireYear);
	}
	
	public double tax (double maas) {
		double	vergi=0;
		if(this.getSalary()>=1 && this.getSalary()<1000) {
			
		} else {
			vergi= (this.getSalary()*3)/100.0;
			System.out.println("Vergi ödemeniz: " + vergi );
			
		}
		return vergi;
	}
	
	public double bonus (double calismaSaati) {
		double bonus =0;
		if (this.getWorkHours()<=40) {
			System.out.println("Bu ay herhangi bir fazla mesai hakedişiniz yoktur!!");
		}
		else {
			
			bonus=(this.getWorkHours()-40)*30;
			System.out.println("Bu ayki fazla mesai hak edişiniz:" + bonus);			
		}
		return bonus;
	}
	void raiseSalary() {
	    int n=2021-this.getHireYear();
	    if(n<10) {
	    	double i=(this.getSalary()*5)/100.0;
	    	System.out.println("Maaş artışınız: " + i);
	    	this.setSalary(this.getSalary()+i);
	    } else if(n>9 && n<20) {
	    	double i=(this.getSalary()*10)/100.0;
	    	System.out.println("Maaş artışınız: " + i);
	    	this.setSalary(this.getSalary()+i);
	    } else {
	    	double i=(this.getSalary()*15)/100.0;
	    	System.out.println("Maaş artışınız: " + i);
	    	this.setSalary(this.getSalary()+i);
	    }
	    
	}
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if(salary>0) {
		this.salary = salary;
		}
		else {
			System.out.println("Lütfen geçerli bir ücret bilgisi giriniz!!");
		}
	}


	public int getWorkHours() {
		return workHours;
	}


	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}


	public int getHireYear() {
		return hireYear;
	}


	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	void printInfo() {
		System.out.println("Çalışan adı: " + this.getName() );
		System.out.println("Maaşı: " + this.getSalary());
		System.out.println("Çalışma saati: " + this.getWorkHours());
		System.out.println("Başlangıç yılı: " + this.getHireYear());
		
		tax(this.getSalary());
		bonus(this.getWorkHours());
		raiseSalary();
		System.out.println("Vergi, bonuslar ve maaş arttırımıyla birlikte toplam maaşınız: " + (this.getSalary() + (bonus(this.getWorkHours())-tax(this.getSalary()))));
		
		
	}
	
	
	
}
