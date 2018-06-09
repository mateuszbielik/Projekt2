import java.util.LinkedList;
import java.util.List;

public class Buying {

    String nazwa;
    double suma;


    public Buying(String nazwa, double suma) {
        this.nazwa = nazwa;
        this.suma = suma;
    }

    List<String> checkoutName = new LinkedList<String>();
    List<Double> checkoutPrice = new LinkedList<Double>();


    public void  addToCheckout(){

        checkoutName.add(list.get(choice-1));
        checkoutPrice.add(count*price.get(choice-1));

    }
}
