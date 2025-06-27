package com.leetcode.arrays_and_hashing.productofarrayexceptself;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        // create prefixes array
        // calculate prefixes
        //create result array
        // calculate suffixes
        int[] prefixes = new int[nums.length];
        int[] results = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            prefixes[i] = prefix;
            prefix *= nums[i];

        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            results[i] = suffix * prefixes[i];
            suffix *= nums[i];

        }
        return results;
    }


    // FIRST Approach Time out limit
//    public int[] productExceptSelf(int[] nums) {
//        int[] results = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (i == 0) {
//                results[i] = multiply(i + 1, nums.length, nums);
//
//            } else if ( i == nums.length - 1){
//                results[i] = multiply(0, i, nums);
//            } else {
//                results[i] =
//                        multiply(0, i, nums)
//                                *
//                                multiply(i + 1, nums.length, nums);
//            }
//
//        }
//        return results;
//    }
//
//    private int multiply(int start, int end, int[] nums) {
//        Integer result = null;
//        for (int j = start; j < end ; j++) {
//            if (result == null) {
//                result = nums[j];
//            } else {
//                result = result * nums[j];
//            }
//        }
//        return result;
//    }

    // FIRST Approach Time out limit
//    public int[] productExceptSelf(int[] nums) {
//        int[] results = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            Integer result = null;
//            for (int j = 0; j < nums.length; j++) {
//                if (i != j) {
//                    if ( result == null) {
//                        result = nums[j];
//                    } else {
//                        result = result * nums[j];
//                    }
//                }
//            }
//            results[i] = result.intValue();
//        }
//        return results;
//    }
}
