package com.leetcode.arrays_and_hashing.groupanagrams;

import com.leetcode.arrays_and_hashing.groupanagrams.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> expected = Arrays.asList(
                Arrays.asList("bat"),
                Arrays.asList("nat","tan"),
                Arrays.asList("ate","eat","tea")
        );

        assertEquals(
                convertToSet(expected),
                convertToSet(groupAnagrams.groupAnagrams(strs))
        );
    }

    private Set<Set<String>> convertToSet(List<List<String>> list) {
        Set<Set<String>> set = new HashSet<>();
        for (List<String> sublist : list) {
            set.add(new HashSet<>(sublist));
        }
        return set;
    }
}