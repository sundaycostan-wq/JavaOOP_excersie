package employee;

public class Employee {
    
    private String name;
    private String jobTitle;
    private double salary;

public Employee(String name, String jobTitle, double salary) {
    this.name = name;
    this.jobTitle = jobTitle;
    this.salary = salary;
}
public String getName(){
  return name;
}
public String getjobTitle(){
  return jobTitle;
}
public double getsalary(){
  return salary;
}
public double calculateAnnualsalary(){
  return salary *12;
}
public void updatesalary(double percentageIncrease){
  if (percentageIncrease > 0) {
    salary += salary*(percentageIncrease / 100);
        
}
}
 public void setsalary(double newsalary){
  if (newsalary>=0);
    this.salary = newsalary;
}


 public String toString(){
    return "Employee{" +  "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    
 }
}


    

