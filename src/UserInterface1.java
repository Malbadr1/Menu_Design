
import java.util.Scanner;

public class UserInterface1 {


    public void printHeader() {
        System.out.println("+----------------+");
        System.out.println("|     Welcome    |");
        System.out.println("|                |");
        System.out.println("|                |");
        System.out.println("+----------------+");
    }

    public boolean printMenu() {
        System.out.println("Make a selection :  ");
        int n=0 ;
        String menu[] = {"1.Perform action 1.", "2.Perform action 2.", "3.Perform action 3.", "4.Perform action 4.", "0.Exit"};

        for (String i : menu) {
            System.out.println(i);

        }
        try {

            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println(" Enter your choice ");

                int x = scanner.nextInt();


                if (x >= 0 && x <= 4) {
                    switch (x) {

                        case 0:
                            n=2;
                            break;
                        case 1:
                            System.out.println(" Selection 1  ");

                            break;
                        case 2:
                            System.out.println(" Selection 2  ");
                            break;
                        case 3:
                            System.out.println(" Selection 3 ");
                            break;
                        case 4:
                            System.out.println(" Selection 4  ");
                            break;
                        default:
                            System.out.println("error");
                    }
                } else {
                    System.out.println("giv me number from 0 to 4");
                }




            } while (n == 0);
            System.out.println("exit"+"\n"+"bye");



        } catch (Exception e) {
            System.out.println( "give me number please");
        }
        return true;
    }
}
class s{


    public static void main(String[] args) {
        UserInterface1 us=new UserInterface1();
        us.printHeader();
        us.printMenu();
    }
}


