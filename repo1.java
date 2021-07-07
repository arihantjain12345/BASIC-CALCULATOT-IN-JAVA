import java.util.Scanner;
public class java_practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //MENU
        System.out.println("******* WELCOME TO AJ CALCULATOR *******");
        System.out.println();
        while (true){
            System.out.println();
            System.out.println("ENTER \"Y\" TO CONTINUE:\nENTER \"EXIT\" TO EXIT: ");
            System.out.println();
            String menu_command = sc.next();
            boolean c = menu_command.equalsIgnoreCase("exit");
            if (menu_command.equalsIgnoreCase("exit")) {
                System.out.println("<<<<<<<<<<THANKYOU FOR USING AJ CALCULATOR>>>>>>>>>>");
                break;
            } else {
                System.out.println();
                System.out.print("ENTER FIRST NUMBER: ");
                float a = sc.nextFloat();
                System.out.print("ENTER SECOND NUMBER: ");
                float b = sc.nextFloat();
                // OPERATION MENU
                System.out.println();
                System.out.println("SELECT OPERATION: ");
                System.out.println();
                System.out.println("ENTER \"1\" FOR ADDITION: \nENTER \"2\" FOR SUBSTRACTION: \nENTER \"3\" FOR MULTIPLICATION: \nENTER \"4\" FOR DIVISION: ");
                System.out.println();
                int o = sc.nextInt();
                //OPERATION WORKING
                if (o == 1) {
                    System.out.println("YOUR ANSWER IS: " + a + b);
                }
                if (o == 2) {
                    float s = a - b;
                    System.out.println("YOUR ANSWER IS: " + s);
                }
                if (o == 3) {
                    System.out.println("YOUR ANSWER IS: " + a * b);
                }
                if (o == 4) {
                    System.out.println("YOUR ANSWER IS: " + a / b);
                }else{
                    System.out.println("!!!!!!!!!! INVALID INPUT !!!!!!!!!!");
                }


            }




        }
    }
}