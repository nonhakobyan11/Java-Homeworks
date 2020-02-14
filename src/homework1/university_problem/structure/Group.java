package homework1.university_problem.structure;

public class Group {
    private String groupName;
    private Student[] students;

    public Group(String groupName) {
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setStudents(Student[] students)  {
        if (students.length == 0) {
            throw new RuntimeException("You havn't added any faculties in University.");
        }
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }
}
