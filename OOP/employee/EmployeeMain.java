package employee;

public class EmployeeMain {
    public static void main(String[] args){
        Employee emp = new Employee("Sunny mae","vape shop",5000.0 );
        System.out.println(emp);
        System.out.println("Annual salary:" + emp.calculateAnnualsalary());
        emp.updatesalary(10);
        System.out.println("After the 10% raise:" +emp);
        emp.setsalary(5500.0);
        System.out.println("after the setting  new salary:"+emp);
    }
}
