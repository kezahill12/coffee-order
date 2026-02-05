import java.util.Arrays;
public class GradeManager {

    int[] grades = new int[5];
    int count = 0;

    void addGrade(int grade) {
        try {
            if (grade < 0 || grade > 100) {
                throw new IllegalArgumentException("Grade must be between 0 and 100.");
            }
            if (count >= grades.length) {
                throw new ArrayIndexOutOfBoundsException("Cannot add more grades, array is full.");
            }
            grades[count] = grade;
            count++;
            System.out.println("Grade added: " + grade);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid grade: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Attempt to add grade finished.\n");
        }
    }


    void displayGrades() {
        if (count == 0) {
            System.out.println("No grades to display.");
            return;
        }
        System.out.print("Grades: ");
        for (int i = 0; i < count; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println("\n");
    }


    void sortGrades() {
        if (count == 0) {
            System.out.println("No grades to sort.");
            return;
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (grades[j] > grades[j + 1]) {
                    int temp = grades[j];
                    grades[j] = grades[j + 1];
                    grades[j + 1] = temp;
                }
            }
        }
        System.out.println("Grades sorted.\n");
    }


    boolean searchGrade(int grade) {
        for (int i = 0; i < count; i++) {
            if (grades[i] == grade) return true;
        }
        return false;
    }


    double calculateAverage() {
        if (count == 0) {
            throw new IllegalStateException("No grades to calculate average.");
        }
        int sum = 0;
        for (int i = 0; i < count; i++) sum += grades[i];
        return (double) sum / count;
    }


    int highestGrade() {
        if (count == 0) throw new IllegalStateException("No grades to find highest.");
        int max = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] > max) max = grades[i];
        }
        return max;
    }

    int lowestGrade() {
        if (count == 0) throw new IllegalStateException("No grades to find lowest.");
        int min = grades[0];
        for (int i = 1; i < count; i++) {
            if (grades[i] < min) min = grades[i];
        }
        return min;

    }
}