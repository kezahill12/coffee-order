import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeManager manager=new GradeManager();
        manager.addGrade(85);
        manager.addGrade(42);
        manager.addGrade(90);
        manager.addGrade(38);
        manager.addGrade(78);


        manager.addGrade(150);


        manager.displayGrades();

        manager.sortGrades();
        manager.displayGrades();


        System.out.println("Is 90 present? " + manager.searchGrade(90));
        System.out.println("Is 50 present? " + manager.searchGrade(50));


        try {
            System.out.println("Average grade: " + manager.calculateAverage());
            System.out.println("Highest grade: " + manager.highestGrade());
            System.out.println("Lowest grade: " + manager.lowestGrade());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}






