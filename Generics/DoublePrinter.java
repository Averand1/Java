package Generics;

public class DoublePrinter {

    Double thingToPrint; 

    public void DPrinter(Double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
    
}
