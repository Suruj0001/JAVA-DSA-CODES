package JAVA.src;

import java.util.Scanner;

public class Conditionals {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        /*

        Syntax for for-loop

        for(initialisation , condition , increment/decrement){
        output
        }

         */

        /*

       int salary = 25000;

       if(salary > 24000) {
           salary = salary + 2000;
       }
        else {
            salary = salary + 1000;
       }
        System.out.println(salary);


         */


        /*

        // Print 1 to n

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "");
            System.out.println("SURUJ");

        // Printing Suruj number of times of n from the user

         */

        /*
        Syntax for while - loop

        initialisation

        while(condition) {

            // body
            // increment

            }

            *print hello world 5 times

            int n = 1;

            while (n <= 5) {

            System.out.println(n);
            System.out.println("Hello World");

            n+=1;

         */

        /* Q . Largest Number
            int max = a ;

            if(b > a){
            max = b;
             }
            if (c > a) {
            max = c ;
            }
            else {
            max = a;
            }
        System.out.println(max);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int max = Math.max(c , Math.max(a , b));

            System.out.println(max);

         */

        /* Case check */
        /*
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {

            System.out.println("Lower Case");

        }else {
            System.out.println("Upper case");
        }
        */

        /* q1 . Fibonacci series*/

        /*
        Scanner in = new Scanner(System.in);

        int a = 0 ;
        int b = 1 ;
        int count = 2 ;
        int n = sc.nextInt();

        while (count <= n){
            int temp = b ;
            b = b + a ;
            a = temp;
            count++;
        }

        System.out.println(b);

         */

        /*Find out the no of 3 in a number taken by the user

        Scanner in  = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n > 0){
            int rem = n % 10 ;
            if (rem == 3){
                count++;
            }
            n = n / 10 ;
        }
        System.out.println(count);

         */

        /* Q . Print the reverse of a number

         Scanner in = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0 ;

        while(n > 0){

            int rem = n % 10 ;
            n /= 10 ;
            ans = ans * 10 + rem;

        }
        System.out.println(ans);


        */


    }

    }

