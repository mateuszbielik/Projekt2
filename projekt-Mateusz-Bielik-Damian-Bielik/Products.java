import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Products {

    String name;
    double price;



    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    static public void productsList() throws InterruptedException {


        int choice, count;

        List<String> list = new LinkedList<String>();
        List<Double> price = new LinkedList<Double>();
//
//        List<String> checkoutName = new LinkedList<String>();
//        List<Double> checkoutPrice = new LinkedList<Double>();



        System.out.println("Available products: \n");

        Products butter = new Products ("Butter", 3.00);
        list.add(butter.name);
        price.add(butter.price);

        Products milk = new Products ("Milk", 2.20);
        list.add(milk.name);
        price.add(milk.price);

        Products gouda = new Products ("Gouda cheese", 8.50);
        list.add(gouda.name);
        price.add(gouda.price);

        Products bread = new Products ("Bread", 2.00);
        list.add(bread.name);
        price.add(bread.price);

        Products roll = new Products ("Roll", 0.30);
        list.add(roll.name);
        price.add(roll.price);

        Products eggplant = new Products("Eggplant", 6.00);
        list.add(eggplant.name);
        price.add(eggplant.price);


        for (int i = 0 ; i < list.size(); i++) {
            System.out.print(i+1+") " + list.get(i) +" "+ price.get(i));
            System.out.println();
        }


        System.out.println("Add to basket nr: ");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();



        TimeUnit.SECONDS.sleep(1);
//        System.out.println(gowno.nazwa + " " + gowno.suma);



        switch(choice) {
            case 1: {
                System.out.println("\nGive the quantity: ");
                count = scan.nextInt();
                System.out.println(list.get(choice-1) +" "+ count*price.get(choice-1));
//                checkoutName.add(list.get(choice-1));
//                checkoutPrice.add(count*price.get(choice-1));
//                System.out.println(checkoutName + " " + checkoutPrice);
                break;
            }

            case 2: {
                break;
            }

            case 3: {
                break;
            }

            case 4: {
                break;
            }

            case 5: {
                break;
            }

            case 6: {
                break;
            }

            case 7: {
                break;
            }


        }


    }

}
