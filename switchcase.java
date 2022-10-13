import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Syntax of switch case

         switch (expression){
            //cases

            case one:
                //do something
                break;

             case two:
                //do something
                break;

              default:
               do something
        }

         /*  Checking Fruits by User

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit : ");
        String fruit = in.next();

        switch(fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;

            case "Apple":
                System.out.println("Sweet Fruits , A apple a day keep a doctor away");
                break;

            case "Grapes":
                System.out.println("A Small Round Fruits");
                break;

            default:
                System.out.println("Enter a valid fruit , Thank You");

        }


        /*


         */

                /* what if you remove the break statments ? It will automatically print the next command
                lines without your permission
                 */

               /* alt+enter --> more cleaner synatx advanced styles .
               switch (fruit) {
                    case "Mango" -> System.out.println("King of Fruits");
                    case "Apple" -> System.out.println("Sweet Fruits , A apple a day keep a doctor away");
                    case "Grapes" -> System.out.println("A Small Round Fruits");
                    default -> System.out.println("Enter a valid fruit , Thank You");
                }
                */
        /*

        Selection of DAY From user

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Day : ");
        int day = in.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

         */

        // Nested switch case getting employee name and department 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the EmplOYEE id : ");
        int empid = in.nextInt();
        System.out.println("Enter the department id : ");
        String department = in.next();

        switch(empid) {
            case 1:
                System.out.println("Suruj Kalita");
                break;


            case 2:
                System.out.println("Kunal Kushwaha");
                break;

            case 3:
                System.out.println("Employee no 3");

                switch(department) {
                    case "IT":
                        System.out.println("IT department");
                        break;

                    case "Management":
                        System.out.println("Management Department");
                        break;
                }

        }
    }
}
