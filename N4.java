import java.nio.charset.MalformedInputException;

abstract class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    abstract void showContent();

    void displayDetail() {
        System.out.println("Course name: " + courseName);
        System.out.println("Duration: " + duration);
    }
}

class ProgrammingCourse extends Course {
    String language;

    ProgrammingCourse(String courseName, int duration, String language) {
        super(courseName, duration);
        this.language = language;
    }

    void showContent() {
        System.out.println("This course covers programming in " + language + ".");
    }
}

class DesignCourse extends Course {
    String tool;

    DesignCourse(String courseName, int duration, String tool) {
        super(courseName, duration);
        this.tool = tool;
    }

    void showContent() {
        System.out.println("This course covers design using " + tool + ".");
    }
}
