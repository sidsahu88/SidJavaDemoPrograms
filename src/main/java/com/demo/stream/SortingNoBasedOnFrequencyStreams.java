package com.demo.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SortingNoBasedOnFrequencyStreams {

    public static void main(String[] args) {

        Integer[] num = {2, 3, 3, 2, 1, 6, 2, 1, 3, 16, 3, 4, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : num) {
            map.merge(i, 1, (v1, v2) -> v1 + 1);
//            map.put(i, map.getOrDefault(i,0) + 1);
        }

        List<Integer> inputArrList = Arrays.asList(num);

        inputArrList.sort((Integer num1, Integer num2) -> {
            int result = map.get(num2).compareTo(map.get(num1));

            if (result == 0) {
                result = num1.compareTo(num2);
            }

            return result;
        });

        for (int val : inputArrList)
            System.out.print(val + " ");
    }

}
