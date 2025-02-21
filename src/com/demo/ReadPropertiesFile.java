package com.demo;

import java.util.ResourceBundle;

public class ReadPropertiesFile {

    private static ResourceBundle srb = ResourceBundle.getBundle("application");

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("test");

        System.out.println(srb.getString("read.test.content"));
        System.out.println(rb.getString("testkey"));

    }
}