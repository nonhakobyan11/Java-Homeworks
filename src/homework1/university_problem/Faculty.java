package homework1.university_problem;

public class Faculty {
    private String facultyName;
    private Group[] groups;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setGroups(Group[] groups) {
        if (groups.length == 0) {
            System.out.println("You havn't added any Groups in Faculty.");
            throw new RuntimeException();
        }
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }
}
