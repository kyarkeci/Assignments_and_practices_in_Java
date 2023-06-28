import java.util.Scanner;

public class Grades2 {
    public static void main(String[] args) {
        int gradeCounter = 0;
        int grades = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input grades or -1 to quit :");
        int gradesInputted = scanner.nextInt();
        while (gradesInputted != -1){
            grades = grades + gradesInputted;
            System.out.println("input grades or -1 to quit :");
            gradesInputted = scanner.nextInt();
            gradeCounter = gradeCounter+1;
            System.out.println("grades = " + " " + grades);
            System.out.println("gradeCounter ="+ " " + gradeCounter);

        }
        System.out.println("grades outside  " + grades);
        System.out.println("grades counter outside  " + gradeCounter);
        System.out.println(grades/gradeCounter);
    }
}
