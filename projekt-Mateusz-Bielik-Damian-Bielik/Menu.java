import java.util.Scanner;

public class Menu {
    static void showMenu() throws InterruptedException {

        int choice;

        System.out.println("Menu: \n");
        System.out.println("1. Products' list");
        System.out.println("2. Checkout");
        System.out.println("3. Clear checkout");
        System.out.println("4. Exit");

        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

        switch (choice) {
            case 1: {
                Products.productsList();
                break;
            }

            case 2: {
                //Checkout.showCheckout();
                break;
            }

            case 3: {

                break;
            }

            case 4: {

                break;
            }
            default: {
                System.out.println("Witaj");
                break;
            }
        }
    }
}