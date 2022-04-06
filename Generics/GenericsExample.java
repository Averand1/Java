package Generics;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer> Iprinter = new Printer<>(23);
        Iprinter.print();

        Printer<Double> Dprinter = new Printer<>(23.5);
        Dprinter.print();

        Printer<String> Sprinter = new Printer<>("HELLO");
        Sprinter.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
    }

}