import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;

        String record = " ";
        int counter = 1;
        while (counter <=10){
            System.out.print("input student number :");
            String studentNumber = scanner.next();
            System.out.print("input grade :");
            String grade = scanner.next();
            switch (grade){
                case "A":
                    gradeA++;
                    break;
                case "B":
                    gradeB++;
                    break;
                case "C":
                    gradeC++;
                    break;
                case "D":
                    gradeD++;
                    break;
                default:
                    gradeF++;
                    break;
            }

            counter++;



        }

        System.out.println("gradeA " + gradeA + " " + "gradeB " + gradeB + " " + "gradeC " + gradeC + " " + "gradeD" + gradeD+ " " + "gradeF" + gradeF);


    }
}
