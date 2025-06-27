package com.leetcode.arrays_and_hashing.validsudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        HashMap<Integer, Set<Character>> columns = new HashMap<>();
        HashMap<Integer, Set<Character>> squares = new HashMap<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] != '.') {

                    int squareKey = (row / 3) * 3 + (col / 3);

                    rows.computeIfAbsent(row, v -> new HashSet<>());
                    columns.computeIfAbsent(col, v -> new HashSet<>());
                    squares.computeIfAbsent(squareKey, v -> new HashSet<>());

                    if (rows.get(row).contains(board[row][col])
                            || columns.get(col).contains(board[row][col])
                            || squares.get(squareKey).contains(board[row][col])) {
                        return false;
                    }

                    rows.get(row).add(board[row][col]);
                    columns.get(col).add(board[row][col]);
                    squares.get(squareKey).add(board[row][col]);

                }
            }
        }

        return true;
    }


//First attempt covering only col and rows


//    public boolean isValidSudoku(char[][] board) {
//
//        for (int row = 0; row < board.length; row++) {
//            HashSet<Character> columnsCharacters = new HashSet<>();
//            HashSet<Character> rowsCharacters = new HashSet<>();
//
//            for (int col = 0; col < board[0].length; col++) {
//
//                boolean isNotColDublicate = true ;
//                boolean isNotRowDuplicate = true;
//
//                if (board[row][col] != '.') {
//                    isNotColDublicate = columnsCharacters.add(board[row][col]);
//                }
//                if (board[col][row] != '.') {
//                    isNotRowDuplicate = rowsCharacters.add(board[col][row]);
//                }
//                if(!isNotColDublicate || !isNotRowDuplicate) {
//                    return false;
//                }
//
//            }
//        }
//
//        return true;
//    }

}