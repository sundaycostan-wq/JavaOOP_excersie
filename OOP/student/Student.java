package student;
public class Student{
    public static void main(String[] args) {
        Student student = new Student();
        student.addCourse("Math");
        student.addCourse("Science");
        System.out.println(student);
        student.addCourse("Science");
        System.out.println(student);
    }

    private void addCourse(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addCourse'");
    }

}

   


    


