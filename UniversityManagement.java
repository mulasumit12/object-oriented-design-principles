import java.util.ArrayList;

class Course1 {
    String name;

    public Course1(String name) {
        this.name = name;
    }
}

class Professor {
    String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignCourse(Course1 course) {
        System.out.println("Professor " + name + " is assigned to course: " + course.name);
    }
}

class Student1 {
    String name;

    public Student1(String name) {
        this.name = name;
    }

    public void enrollCourse(Course1 course) {
        System.out.println("Student " + name + " enrolled in " + course.name);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Alice");
        Professor p1 = new Professor("Dr. Smith");
        Course1 c1 = new Course1("Math");

        s1.enrollCourse(c1);
        p1.assignCourse(c1);
    }
}