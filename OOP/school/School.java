package school;

import java.util.ArrayList;
import java.util.List;
public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<SchoolClass> classes;
    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public boolean removeStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public boolean removeTeacher(String name) {
        return teachers.removeIf(t -> t.getName().equals(name));
    }
    public void createClass(String className, Teacher teacher) {
        if (teachers.contains(teacher)) {
            classes.add(new SchoolClass(className, teacher));
        } else {
            System.out.println("Teacher not found in school.");
        }
    }
    public List<Student> getStudents() {
        return students;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public List<SchoolClass> getClasses() {
        return classes;
    }
}