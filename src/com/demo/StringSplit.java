package com.demo;

public class StringSplit {

    public static void main(String[] args) {
        String storeName = "Barnes and Nobles at Boston University, Boston, United States";
        String storeName1 = storeName;
        String storeName2 = "";

        int fulfillStoreName1MaxLen = 50;
        int fulfillStoreName2MaxLen = 50;
        
        if (storeName1.length() > fulfillStoreName1MaxLen) {
            storeName1 = storeName1.substring(0, fulfillStoreName1MaxLen);

            storeName2 = storeName.substring(fulfillStoreName1MaxLen);
            
            if (storeName2.length() > fulfillStoreName2MaxLen)
                storeName2 = storeName2.substring(0, fulfillStoreName2MaxLen);
        }

        System.out.println("Name1 = " + storeName1 + "\nName2 = " + storeName2);
    }
}
