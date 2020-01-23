package homework1.university_problem;

public class Student {
    // All final attributes
    private String fullName; //required
    private String email; //required
    private String universityName; //optional
    private String facultyName; //optional
    private String groupName; //optional
    private Subject[] subjects; //optional

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

    //All getter, and NO setter to provide immutability
    public Subject[] getSubjects() {
        return subjects;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() { return email; }

    public String getUniversityName() {
        return universityName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getGroupName() { return groupName; }

    @Override
    public String toString() {
        return "Student: "+ this.fullName +", "+ this.email +", "+ this.universityName +", "+ this.facultyName +", "+ this.groupName;
    }

    public static class StudentBuilder {
        private String fullName;
        private String email;
        private String universityName;
        private String facultyName;
        private String groupName;

        //, String universityName, String facultyName, String groupName
        public StudentBuilder(String fullName, String email) {
            this.fullName = fullName;
            this.email = email;
        }

        public StudentBuilder universityName(String universityName){
            this.universityName = universityName;
            return this;
        }

        public StudentBuilder facultyName(String facultyName){
            this.facultyName = facultyName;
            return this;
        }

        public StudentBuilder groupName(String groupName){
            this.groupName = groupName;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
