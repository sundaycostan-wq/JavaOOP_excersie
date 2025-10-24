package course;

public class Course {
    String courseName;
    String instructor;
    int credits;

    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    public void displayDetails() {
        System.out.println(courseName + " by " + instructor + " (" + credits + " credits)");
    }
}