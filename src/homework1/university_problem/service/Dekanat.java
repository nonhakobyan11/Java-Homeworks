package homework1.university_problem.service;

import homework1.university_problem.structure.*;

public class Dekanat {
    private Student[] allStudentsInUni;
    double sumOfAllGradesForStudent = 0;
    int sumOfSubjects = 0;
    double sumOfAllGradesOfOneSubjectInGroup = 0;
    int sumOfStudentsStudyingSameSubjectInGroup = 0;
    double sumOfAllGradesOfOneSubjectInFaculty = 0;
    int sumOfStudentsStudyingSameSubjectInFaculty = 0;
    double sumOfAllGradesOfOneSubjectInUni = 0;
    int sumOfStudentsStudyingSameSubjectInUni = 0;

    public void createTheUniversity() {
        try {
            University university = new University("NPUA");
            System.out.println("Welcome to " + university.getUniversityName() + "!!!");

            //Adding Faculties
            Faculty computerScience = new Faculty("Computer Science");
            Faculty cybernetics = new Faculty("Cybernetics");
            Faculty[] faculties = new Faculty[]{computerScience, cybernetics};
            university.setFaculties(faculties);

            // Adding Groups for Computer Science
            Group computerScienceGroup1 = new Group("Software Engineering");
            Group computerScienceGroup2 = new Group("Information Security");
            Group[] groupsOfComputerScience = new Group[]{computerScienceGroup1, computerScienceGroup2};
            computerScience.setGroups(groupsOfComputerScience);

            // Adding Groups for Cybernetics
            Group cyberneticsGroup1 = new Group("Microelectronics");
            Group cyberneticsGroup2 = new Group("Management Systems");
            Group[] groupsOfCybernetics = new Group[]{cyberneticsGroup1, cyberneticsGroup2};
            cybernetics.setGroups(groupsOfCybernetics);

            //Adding all groups existing in the University in new array
            Group[] allGroupsInUni = new Group[]{computerScienceGroup1, computerScienceGroup2, cyberneticsGroup1, cyberneticsGroup2};

            // Adding Students to Software Engineering Group
            Student softwareEngineeringStudent1 = new Student.StudentBuilder("Karapetyan Andranik", "karapetyanandranik@mail.ru")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(computerScience.getFacultyName())
                    .setGroupName(computerScienceGroup1.getGroupName())
                    .build();

            Student softwareEngineeringStudent2 = new Student.StudentBuilder("Hovhannisyan Mariam", "hovhmariam@gmail.com")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(computerScience.getFacultyName())
                    .setGroupName(computerScienceGroup1.getGroupName())
                    .build();

            Student softwareEngineeringStudent3 = new Student.StudentBuilder("Vardanyan Artak", "vardanyana@gmail.com")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(computerScience.getFacultyName())
                    .setGroupName(computerScienceGroup1.getGroupName())
                    .build();
            Student[] softwareEngineeringStudents = new Student[]{softwareEngineeringStudent1, softwareEngineeringStudent2, softwareEngineeringStudent3};
            computerScienceGroup1.setStudents(softwareEngineeringStudents);


            // Adding Students to Information Security Group
            Student securityStudent1 = new Student.StudentBuilder("Harutyunyan Armine", "harutyunyan@mail.ru")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(computerScience.getFacultyName())
                    .setGroupName(computerScienceGroup2.getGroupName())
                    .build();
            Student securityStudent2 = new Student.StudentBuilder("Mkrtchyan Armen", "armenmkrtchyan@gmail.com")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(computerScience.getFacultyName())
                    .setGroupName(computerScienceGroup2.getGroupName())
                    .build();
            Student securityStudent3 = new Student.StudentBuilder("Vardanyan Artavazd", "vardanyanart@gmail.com")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(computerScience.getFacultyName())
                    .setGroupName(computerScienceGroup2.getGroupName())
                    .build();
            Student[] securityStudents = new Student[]{securityStudent1, securityStudent2, securityStudent3};
            computerScienceGroup2.setStudents(securityStudents);

            // Adding Students to Microelectronics Group
            Student microelectronicsStudent1 = new Student.StudentBuilder("Hovhannisyan Martin", "hovhmartin@mail.ru")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(cybernetics.getFacultyName())
                    .setGroupName(cyberneticsGroup1.getGroupName())
                    .build();
            Student microelectronicsStudent2 = new Student.StudentBuilder("Niazyan Vardan", "vardanniazyan@gmail.com")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(cybernetics.getFacultyName())
                    .setGroupName(cyberneticsGroup1.getGroupName())
                    .build();
            Student[] microelectronicsStudents = new Student[]{microelectronicsStudent1, microelectronicsStudent2};
            cyberneticsGroup1.setStudents(microelectronicsStudents);

            // Adding Students to Management Systems Group
            Student managementSystemsStudent1 = new Student.StudentBuilder("Hambardzumyan Erik", "hovherik@gmail.com")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(cybernetics.getFacultyName())
                    .setGroupName(cyberneticsGroup2.getGroupName())
                    .build();
            Student managementSystemsStudent2 = new Student.StudentBuilder("Abrahamyan Kristine", "kristabrahamyan@gmail.com")
                    .setUniversityName(university.getUniversityName())
                    .setFacultyName(cybernetics.getFacultyName())
                    .setGroupName(cyberneticsGroup2.getGroupName())
                    .build();
            Student[] managementSystemsStudents = new Student[]{managementSystemsStudent1, managementSystemsStudent2};
            cyberneticsGroup2.setStudents(managementSystemsStudents);


            // Adding Subjects and Grades to software engineers
            Subject mathOfSoftwareEngineeringStudent1 = new Subject("Mathematical analysis");
            mathOfSoftwareEngineeringStudent1.setGrade(7);
            Subject javaOfSoftwareEngineeringStudent1 = new Subject("Algorithms Basics. Java Core");
            javaOfSoftwareEngineeringStudent1.setGrade(10);
            Subject[] subjectsOfSoftwareEngineeringStudent1 = new Subject[]{mathOfSoftwareEngineeringStudent1, javaOfSoftwareEngineeringStudent1};
            softwareEngineeringStudent1.setSubjects(subjectsOfSoftwareEngineeringStudent1);

            Subject mathOfSoftwareEngineeringStudent2 = new Subject("Mathematical analysis");
            mathOfSoftwareEngineeringStudent2.setGrade(8);
            Subject[] subjectsOfSoftwareEngineeringStudent2 = new Subject[]{mathOfSoftwareEngineeringStudent2};
            softwareEngineeringStudent2.setSubjects(subjectsOfSoftwareEngineeringStudent2);

            Subject javaOfSoftwareEngineeringStudent3 = new Subject("Algorithms Basics. Java Core");
            javaOfSoftwareEngineeringStudent3.setGrade(10);
            Subject[] subjectsOfSoftwareEngineeringStudent3 = new Subject[]{javaOfSoftwareEngineeringStudent3};
            softwareEngineeringStudent3.setSubjects(subjectsOfSoftwareEngineeringStudent3);

            // Adding subjects to Information Security students
            Subject mathOfInformationSecurityStudent1 = new Subject("Mathematical analysis");
            mathOfInformationSecurityStudent1.setGrade(5);
            Subject cryptOfInformationSecurityStudent1 = new Subject("Cryptography and Secrecy");
            cryptOfInformationSecurityStudent1.setGrade(9);
            Subject[] subjectsOfInformationSecurityStudent1 = new Subject[]{mathOfInformationSecurityStudent1, cryptOfInformationSecurityStudent1};
            securityStudent1.setSubjects(subjectsOfInformationSecurityStudent1);

            Subject mathOfInformationSecurityStudent2 = new Subject("Mathematical analysis");
            mathOfInformationSecurityStudent2.setGrade(7);
            Subject javaOfInformationSecurityStudent2 = new Subject("Algorithms Basics. Java Core");
            javaOfInformationSecurityStudent2.setGrade(4);
            Subject[] subjectsOfInformationSecurityStudent2 = new Subject[]{mathOfInformationSecurityStudent2, javaOfInformationSecurityStudent2};
            securityStudent2.setSubjects(subjectsOfInformationSecurityStudent2);

            Subject cryptOfInformationSecurityStudent3 = new Subject("Cryptography and Secrecy");
            cryptOfInformationSecurityStudent3.setGrade(6);
            Subject[] subjectsOfInformationSecurityStudent3 = new Subject[]{cryptOfInformationSecurityStudent3};
            securityStudent3.setSubjects(subjectsOfInformationSecurityStudent3);

            // Adding subjects to Microelectronics
            Subject mathOfMicroelectronicsStudent1 = new Subject("Mathematical analysis");
            mathOfMicroelectronicsStudent1.setGrade(5);
            Subject[] subjectsOfMicroelectronicsStudent1 = new Subject[]{mathOfMicroelectronicsStudent1};
            microelectronicsStudent1.setSubjects(subjectsOfMicroelectronicsStudent1);

            Subject microelectronicsOfMicroelectronicsStudent2 = new Subject("Microelectronic");
            microelectronicsOfMicroelectronicsStudent2.setGrade(10);
            Subject[] subjectsOfMicroelectronicsStudent2 = new Subject[]{microelectronicsOfMicroelectronicsStudent2};
            microelectronicsStudent2.setSubjects(subjectsOfMicroelectronicsStudent2);

            // Adding subjects to Management Systems
            Subject mathOfManagementSystemsStudent1 = new Subject("Mathematical analysis");
            mathOfManagementSystemsStudent1.setGrade(9);
            Subject[] subjectsOfManagementSystemsStudent1 = new Subject[]{mathOfManagementSystemsStudent1};
            managementSystemsStudent1.setSubjects(subjectsOfManagementSystemsStudent1);

            Subject MsOfManagementSystemsStudent2 = new Subject("Management Systems");
            MsOfManagementSystemsStudent2.setGrade(7);
            Subject[] subjectsOfManagementSystemsStudent2 = new Subject[]{MsOfManagementSystemsStudent2};
            managementSystemsStudent2.setSubjects(subjectsOfManagementSystemsStudent2);


            int quantityAllStudentsInUni = softwareEngineeringStudents.length
                    + securityStudents.length
                    + microelectronicsStudents.length
                    + managementSystemsStudents.length;

            this.allStudentsInUni = new Student[quantityAllStudentsInUni];
            int position = 0;
            for (Group g : allGroupsInUni) {
                for (Student s : g.getStudents()) {
                    allStudentsInUni[position] = s;
                    position++;
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void calculateAverageGradeForUniversity(String subject) {

        for (Student student : allStudentsInUni) {
            for (int j = 0; j < student.getSubjects().length; j++) {
                if (student.getUniversityName().equals("NPUA")
                        && student.
                        getSubjects()[j].getSubjectName().equals(subject)) {
                    sumOfAllGradesOfOneSubjectInUni += student.getSubjects()[j].getGrade();
                    sumOfStudentsStudyingSameSubjectInUni++;
                }
            }
        }

        double averageGradeForUniversity = sumOfAllGradesOfOneSubjectInUni / sumOfStudentsStudyingSameSubjectInUni;
        System.out.println("University's average grade from '" + subject + "' is " + averageGradeForUniversity);
    }

    public void calculateAverageGradeForFaculty(String faculty, String subject) {

        for (Student student : allStudentsInUni) {
            for (int j = 0; j < student.getSubjects().length; j++) {
                if (student.getFacultyName().equals(faculty)
                        && student.getSubjects()[j].getSubjectName().equals(subject)) {
                    sumOfAllGradesOfOneSubjectInFaculty += student.getSubjects()[j].getGrade();
                    sumOfStudentsStudyingSameSubjectInFaculty++;
                }

            }
        }
        double averageGradeForFaculty = sumOfAllGradesOfOneSubjectInFaculty / sumOfStudentsStudyingSameSubjectInFaculty;
        System.out.println("Faculty's average grade from '" + subject + "' is: " + averageGradeForFaculty);
    }

    public void calculateAverageGradeForGroup(String group, String subject) {
        for (Student student : allStudentsInUni) {
            for (int j = 0; j < student.getSubjects().length; j++) {
                if (student.getGroupName().equals(group)
                        && student.getSubjects()[j].getSubjectName().equals(subject)) {
                    sumOfAllGradesOfOneSubjectInGroup += student.getSubjects()[j].getGrade();
                    sumOfStudentsStudyingSameSubjectInGroup++;
                }
            }
        }
        double averageGradeForGroup = sumOfAllGradesOfOneSubjectInGroup / sumOfStudentsStudyingSameSubjectInGroup;
        System.out.println("Groups's average grade from '" + subject + "' is: " + averageGradeForGroup);
    }

    public void calculateAverageForOneStudent(String fullname) {
        for (Student student : allStudentsInUni) {
            if (student.getFullName().equals(fullname)) {
                for (int j = 0; j < student.getSubjects().length; j++) {
                    sumOfAllGradesForStudent = student.getSubjects()[j].getGrade();
                    sumOfSubjects++;
                }
            }
        }
        double averageGradeForStudent = sumOfAllGradesForStudent / sumOfSubjects;
        System.out.println("Current student's average grade is: " + averageGradeForStudent);
    }
}
