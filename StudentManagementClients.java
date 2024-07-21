package Muhtar_SDET.Day24_ArrayListContinue_DateTimesIntro.TasksOzzy;

public class StudentManagementClients {
    public static void main(String[] args) {

        SelfTask1_StudentManagement student1 = new SelfTask1_StudentManagement();



        student1.setInfo("Hakan", 100);

        student1.setInfo("Alice", 85);
        student1.setInfo("Bob", 90);
        student1.setInfo("Charlie", 78);
        student1.printStudents();

        student1.updateGrade("Alice", 95);
        student1.printStudents();

        student1.removeStudent("Bob");
        student1.printStudents();

        student1.calculateAverageGrade();

        // Testing setInfo to update and add new students
        student1.setInfo("David", 82);
        student1.setInfo("Alice", 88);
        student1.printStudents();
        student1.calculateAverageGrade();

        System.out.println(student1.toString());
    }


    }

