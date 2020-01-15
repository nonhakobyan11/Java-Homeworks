package homework1.university_problem;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String universityName;
    private String facultyName;
    private String groupName;
    private Subject[] subjects;

    public Student(StudentBuilder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        email = builder.email;
        universityName = builder.universityName;
        facultyName = builder.facultyName;
        groupName = builder.groupName;
    }

    public void setSubjects(Subject[] subjects) {
        if (subjects.length == 0) {
            throw new RuntimeException("Student has no subject");
        }
        this.subjects = subjects;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
        private String firstName;
        private String lastName;
        private String email;
        private String universityName;
        private String facultyName;
        private String groupName;

        public StudentBuilder(String firstName, String lastName, String email, String universityName, String facultyName, String groupName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.universityName = universityName;
            this.facultyName = facultyName;
            this.groupName = groupName;
        }

        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }
}
