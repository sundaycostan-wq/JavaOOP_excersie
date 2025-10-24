package employee2;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
  private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
}   
public String getName() {
    return name;
}
public double getSalary() {
    return salary;
}
public LocalDate getHireDate() {
    return hireDate;
}
public void setName(String name) {
this.name = name;
}
   public void setSalary(double salary) {
        this.salary = salary;
    }
public void setHireDate(LocalDate hireDate) {
this.hireDate = hireDate;
}
public int calculateYearsOfService() {
    LocalDate currentDate = LocalDate.now();
    Period period = Period.between(hireDate, currentDate);
    return period.getYears();
}


}
