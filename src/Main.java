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

            case '2':

                double smallest,tempo;

                System.out.println("Enter first number");
                a = sc.nextDouble();

                System.out.println("Enter second number");
                b = sc.nextDouble();
                System.out.println("Enter first number");
                c = sc.nextDouble();

                tempo=a>b?b:a;

               smallest =c>tempo?tempo:c;

                System.out.println("The smallest number is: "+smallest);
                break;

            case '3':

                int i, n = 0, m = 0, flag = 0;
                System.out.println("Enter the  number to check:");
                n = sc.nextInt();
                m = n / 2;
                if (n == 0 || n == 1) {
                    System.out.println(n + " not a prime number");
                } else {
                    for (i = 2; i <= m; i++) {
                        if (n % i == 0) {
                            System.out.println(n + " not a prime number");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println(n + " is a prime number");
                    }
                }

                break;


            case'4' :

                Scanner reader = new Scanner(System.in);

                System.out.print("Enter a number: ");
                int num = reader.nextInt();

                if(num % 2 == 0)
                    System.out.println(num + " is even");
                else
                    System.out.println(num + " is odd");







        }
    }
}