//Student Grade Calcultor 

import java.util.Scanner;

class student {
    int marks[] = new int[5];
    int total = 0;
    double percentage;
    // char grade;

    public void inputmarks() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks in subject " + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }

    }

    public void totalmarks() {
        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }
        System.out.println("Total Marks = " + total);
    }

    public void averagepercent() {
        percentage = (double)total / 5;
        System.out.println("Average Percentage = "+percentage);
    }

    public void grade()
    {
        if(percentage<=100 && percentage>=95) {
            System.out.println("Grade = A+ ");
        }

        else if (percentage<=95 && percentage>=90) {
            System.out.println("Grade = A ");
            
        }

        else if(percentage<=90 && percentage>=80) {
            System.out.println("Grade = B+ ");
        }

        else if(percentage<=80 && percentage>=70) {
            System.out.println("Grade = B");
        }

        else if(percentage<=70 && percentage>=60) {
            System.out.println("Grade = C+");
        }

        else {
            System.out.println("Fail");
        }
    }

}

public class Task2 {

        public static void main(String[] args) {
            
            student obj=new student();
            obj.inputmarks();
            obj.totalmarks();
            obj.averagepercent();
            obj.grade();

            
        }
}
