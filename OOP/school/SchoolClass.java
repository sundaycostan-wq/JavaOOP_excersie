package school;

import java.util.ArrayList;
import java.util.List;
public class SchoolClass {
    private String className;
    private Teacher teacher;
    private List<Student> students;
    public SchoolClass(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public boolean removeStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }
    public String getClassName() {
        return className;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public List<Student> getStudents() {
        return students;
    }
    public String toString() {
        return className + " taught by " + teacher.getName() + " with " + students.size() + " students";
    }
}