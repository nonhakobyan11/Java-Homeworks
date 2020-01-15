package homework1.university_problem;

public class University {
    private String universityName;
    private Faculty[] faculties;

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setFaculties(Faculty[] faculties) {
        if (faculties.length == 0) {
            System.out.println("You havn't added any faculties in University. Please fix it.");
            throw new RuntimeException("University has no faculties");
        }
        this.faculties = faculties;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }
}
