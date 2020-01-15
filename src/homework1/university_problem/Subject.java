package homework1.university_problem;

public class Subject {
    private String subjectName;
    private int grade;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setGrade(int grade)  {
        if (grade < 0 || grade > 10) {
            System.out.println("Grade should be more or equal to zero and less or equal to 10. Please fix it.");
            throw new RuntimeException("Invalid grade");
        }
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGrade() {
        return grade;
    }
}
