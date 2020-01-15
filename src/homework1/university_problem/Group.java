package homework1.university_problem;

public class Group {
    private String groupName;
    private Student[] students;

    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setStudents(Student[] students) {
        if (students.length == 0) {
            System.out.println("You havn't added any faculties in University. Please fix it.");
            throw new RuntimeException("Group has no students");
        }
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
}
