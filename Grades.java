import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
//        int gradeCounter = 0;
//        int grades = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input grades or -1 to quit :");
//        int gradesInputted = scanner.nextInt();
//        while (gradesInputted != -1){
//            grades = grades + gradesInputted;
//            System.out.println("input grades or -1 to quit :");
//            gradesInputted = scanner.nextInt();
//            gradeCounter = gradeCounter+1;
//            System.out.println("grades = " + " " + grades);
//            System.out.println("gradeCounter ="+ " " + gradeCounter);
//
//        }
//        System.out.println("grades outside  " + grades);
//        System.out.println("grades counter outside  " + gradeCounter);
//        System.out.println(grades/gradeCounter);

        int students = 0;
        int totalScore = 0;
        int averageScore = 0;
        int counter = 1;
        while (counter <= 20){
            Scanner scanner = new Scanner(System.in);
            System.out.println("input grades :");
            int grades = scanner.nextInt();
            students = students+1;
            totalScore = totalScore+ grades;
            counter = counter+1;
        }

        System.out.println(students);
        System.out.println(totalScore);
        averageScore = totalScore/students;
        System.out.println(averageScore);

    }
}
