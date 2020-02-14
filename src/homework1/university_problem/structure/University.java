package homework1.university_problem.structure;

public class University {
    private String universityName;
    private Faculty[] faculties;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setFaculties(Faculty[] faculties) {
        if (faculties.length == 0) {
            throw new RuntimeException("You havn't added any faculties in University.");
        }
        this.faculties = faculties;
    }

    public Faculty[] getFaculties() {
        return faculties;
    }
}
