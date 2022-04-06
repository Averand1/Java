package Generics;

public class StringPrinter {

    String thingToPrint; 

    public void SPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
    
}
