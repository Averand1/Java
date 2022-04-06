package Generics;

public class IntegerPrinter {

    Integer thingToPrint; 

    public void IPrintner(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
    
}
