package student;

import java.util.ArrayList;
import java.util.List;
public class StudentMain {
    
private String name;
private String grade;
private List<String> courses;
public StudentMain(String name, String grade) {
    this.name = name;
    this.grade = grade;
    this.courses = new ArrayList<>();
    }
public void addCourse(String course) {
    if (!courses.contains(course)) {
    courses.add(course);
 System.out.println("Added: " + course);
    } else {
System.out.println("Already enrolled: " + course);
}
}
public void removeCourse(String course) {
    if (courses.remove(course)) {
System.out.println("Removed: " + course);
    } else {
System.out.println("Not found: " + course);
}
}
public String toString() {
    return "Student [Name: " + name + ", Grade: " + grade + ", Courses: " + courses + "]";
    }

    
}
