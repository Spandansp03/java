import java.util.Scanner;

public class takingInputs{
    /**
     * 
     */
    public static void main(String args[] )
    {
        System.out.println("Taking input from user::");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = sc.nextInt();
         System.out.println("Enter the Second Number:");
        int b = sc.nextInt();
        int sum= a+b;
        System.out.println("The sum of two numbers is ::" +sum);

        System.out.println("Taking input from user:: float");
        
        System.out.println("taking input for 1:");
        float c = sc.nextFloat();
         System.out.println("taking input for 2:");
        float d = sc.nextFloat();

        float sum1=c+d;
         System.out.println("The sum of two numbers is ::" +sum);

        String abc =sc.nextLine();
        System.out.println(abc); //outputs entire line

        String str =sc.next();
        System.out.println(str); // only outputs one word

        




    }
}