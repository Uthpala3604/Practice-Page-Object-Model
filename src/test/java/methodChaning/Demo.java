package methodChaning;

import java.io.PrintStream;

public class Demo {
    public static void main(String[] args) {
        System.out.println("My name is Uthpala");

        PrintStream printStream = System.out;   //out is return PrintStream class
        printStream.println("My name is Uthpala01");


    }
}
