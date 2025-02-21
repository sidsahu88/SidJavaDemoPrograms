package com.demo;

public class StaticVarStaticBlockDemo {

    static String str = "This is a Static String";

    static {
        System.out.println("Printing inside 1st static block");
        System.out.println(str);
    }

    private static void printInStaticMethod() {
        System.out.println("Printing inside static method");
    }

    public static void main(String[] args) {

        StaticVarStaticBlockDemo sts = new StaticVarStaticBlockDemo();

        System.out.println("Printing inside main method");
        System.out.println(str);
        printInStaticMethod();
    }

    static {
        System.out.println("Printing inside 2nd static block");
        System.out.println(str);
    }
}
