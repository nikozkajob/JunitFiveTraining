package com.leetcode.arrays_and_hashing.encodeanddecodestring;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strs) {
            stringBuilder
                    .append(str.length())
                    .append("#")
                    .append(str);

        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {

        ArrayList<String> strings = new ArrayList<>();

        extracted(str, strings);

        return strings;
    }

    private void extracted(String str, List<String> strings) {

        while (!Objects.equals(str, "")) {

            int indexOfHashTag = str.indexOf('#');

            int length = Integer.parseInt(str.substring(0, indexOfHashTag));

            String decodedString = str.substring(indexOfHashTag + 1, indexOfHashTag + length + 1);

            strings.add(decodedString);

            str = str.substring(indexOfHashTag + length + 1);
        }
    }

    // #2 attempt
//    }  private void extracted(String str, List<String> strings) {
//
//        if (!Objects.equals(str, "")) {
//
//
//            int indexOfHashTag = str.indexOf('#');
//            int length = Integer.valueOf(str.substring(0, indexOfHashTag));
//            String decodedString = str.substring(indexOfHashTag + 1, indexOfHashTag + length + 1);
//
//            strings.add(decodedString);
//
//            extracted(str.substring(indexOfHashTag + length + 1), strings);
//        }
//    }

// #1 attempt
//    private void extracted(String str, List<String> strings) {
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '#') {
//                int length = Integer.valueOf(str.substring(0, i));
//                String decodedString = str.substring(i + 1, i + length + 1);
//
//                i = i + length + 1;
//
//                strings.add(decodedString);
//
//                extracted(str.substring(i), strings);
//
//                i = str.length();
//
//            }
//        }
//    }
}
