import java.util.Scanner;

public class q1{
    public static void main(String args[])
    {
        System.out.println("Program to calculate the percentage of marks of 5 subject::\n");
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter total marks");
        float tot = sc.nextInt();

        System.out.println("Enter the marks of subject 1:");
        float sub1 = sc.nextInt();
        
        System.out.println("Enter the marks of subject 2:");
        float sub2 = sc.nextInt();
        
        System.out.println("Enter the marks of subject 3:");
        float sub3 = sc.nextInt();
        
        System.out.println("Enter the marks of subject 4:");
        float sub4 = sc.nextInt();
        
        System.out.println("Enter the marks of subject 5:");
        float sub5 = sc.nextInt();

        float res =((sub1+sub2+sub3+sub4+sub5)/tot)*100;

        System.out.print("The result of the student is="+res+"%" );





    }
}