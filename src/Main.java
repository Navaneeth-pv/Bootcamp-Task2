import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Choose your Choice----------------");
        System.out.println("1. Largest of 3 numbers");
        System.out.println("2. Smallest of 3 numbers");
        System.out.println("3. Check prime or not");
        System.out.println("4. Even or not ");
        System.out.println("5. Reverse of number");
        System.out.println("6. Exit");

        char operator;
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        operator=sc.next().charAt(0);

        switch(operator) {

            case '1':

                double largest,temp;

                System.out.println("Enter first number");
                a = sc.nextDouble();

                System.out.println("Enter second number");
                b = sc.nextDouble();
                System.out.println("Enter first number");
                c = sc.nextDouble();

                temp=a>b?a:b;

                largest=c>temp?c:temp;

                System.out.println("The largest number is: "+largest);
                break;


        }
    }
}