import java.util.Scanner;

//Student Grade Calculator

class Grade{
    public String grade(int p){
        switch (p / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5:
                return "E";
            default:
                return "F";
        }
    }
}

public class Task2{
    public static void main(String[] args){
        Grade grd = new Grade();
        Scanner sc = new Scanner(System.in);

        System.out.println("how many subjectss you got");
        int totalSubjects= sc.nextInt();
        int totalmarks = 0;

        for (int i = 0; i < totalSubjects; i++) {
            System.out.println("how lit was subject " + (i + 1));
            int marks = sc.nextInt();
            totalmarks += marks;
        }

        int avgPercent = totalmarks / totalSubjects;

        String Grade = grd.grade(avgPercent);

        System.out.println("Total marks: " + totalmarks);
        System.out.println("Percentage: " + avgPercent+"%");
        System.out.println("Grade: " + Grade);

        sc.close();
    }
}


//let's hit and try the code fam!