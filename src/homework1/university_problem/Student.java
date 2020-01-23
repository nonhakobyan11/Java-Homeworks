package homework1.university_problem;

public class Student {
    private String fullName;
    private String email;
    private String universityName;
    private String facultyName;
    private String groupName;
    private Subject[] subjects;

    public Student(StudentBuilder builder) {
        fullName = builder.fullName;
        email = builder.email;
        universityName = builder.universityName;
        facultyName = builder.facultyName;
        groupName = builder.groupName;
    }

    public void setSubjects(Subject[] subjects) {
        if (subjects.length == 0) {
            throw new RuntimeException("You havn't added any subject to this Student.");
        }
        this.subjects = subjects;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getGroupName() {
        return groupName;
    }

    public static class StudentBuilder {
        private String fullName;
        private String email;
        private String universityName;
        private String facultyName;
        private String groupName;

        public StudentBuilder(String fullName, String email, String universityName, String facultyName, String groupName) {
            this.fullName = fullName;
            this.email = email;
            this.universityName = universityName;
            this.facultyName = facultyName;
            this.groupName = groupName;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
