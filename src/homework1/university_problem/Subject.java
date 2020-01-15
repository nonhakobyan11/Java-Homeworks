package homework1.university_problem;

public class Subject {
    private String subjectName;
    private double grade;

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setGrade(double grade)  {
        if (grade < 0 || grade > 10) {
            System.out.println("Grade should be more or equal to zero and less or equal to 10.");
            throw new RuntimeException("Invalid grade");
        }
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getGrade() {
        return grade;
    }
}
