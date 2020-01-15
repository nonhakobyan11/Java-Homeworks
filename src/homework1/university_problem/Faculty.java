package homework1.university_problem;

public class Faculty {
    private String facultyName;
    private Group[] groups;

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setGroups(Group[] groups) {
        if (groups.length == 0) {
            System.out.println("You havn't added any Groups in Faculty. Please fix it.");
            throw new RuntimeException("Faculty has no groups");
        }
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }
}
