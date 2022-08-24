package Polymorphism;

public class Test {
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.print();
        Printer color = new Color();
        color.print();
        Printer black = new Black_White();
        black.print();
    }
}
