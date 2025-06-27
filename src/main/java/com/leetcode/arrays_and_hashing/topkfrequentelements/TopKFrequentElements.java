package com.leetcode.arrays_and_hashing.topkfrequentelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKFrequentElements {

//    public int[] topKFrequent(int[] nums, int k) {
//        Map<Integer, Long> collect = Arrays.stream(nums).boxed()
//                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
//
//        List<Integer> result = collect.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .limit(k)
//                .map(Map.Entry::getKey)
//                .toList();
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//
//    }
    public int[] topKFrequent(int[] nums, int k) {
        //  create and populate count map
        // create  Frequency
        //  populate Frequency
        // iterate through frequency to get top k elements
        
        Map<Integer, Integer> map = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.summingInt(e -> 1)));

        List<List<Integer>> freq = new ArrayList<>(nums.length + 1);

        for (int i = 0; i <= nums.length; i++) {
            freq.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freq.get(entry.getValue()).add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = freq.size() - 1; (i > 0 && index < k); i--) {
            for (int j = 0; j < freq.get(i).size(); j++) {
                result[index++] = freq.get(i).get(j);
            }
        }

       return result;
    }
}
