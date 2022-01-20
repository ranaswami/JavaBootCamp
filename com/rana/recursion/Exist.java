package com.rana.recursion;
//https://leetcode.com/problems/word-search/
public class Exist {

    public static void main(String[] args) {

        char[][] board ={{'A','B','C','E'},
                        {'S','F','C','S'},
                        {'A','D','E','E'}
                };
        //System.out.println("h");
        String word = "ABCCED";//output true;
        System.out.println(exist(board, word));
    }
    static boolean exist(char[][] board, String word) {//we have to look through the grid and if we ever find the first letter of the word
        //then we have to implement DFS on that particular cell and if are able to find all the characters of the given word, we return true else
        //false.
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j ,0, word)) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean dfs(char[][] board, int i, int j, int count, String word){
        if (count == word.length())//base condition
            return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)){
            return false;//check whether we ever go outside the grid and also check whether the index we are at in our grid is equal
        } // to word.charAt(count) or not.

        /**
         * In the question, it is mentioned that the same letter cell may not be used more than once.
         * If the word contains several 'C's or any letter in it.
         * We can mark the current cell as empty. But we need to also remember the value in that cell because we need it back after our
         * recursive calls.
         */
        char temp = board[i][j];
        board[i][j] = ' ';

        boolean found = dfs(board, i + 1, j, count + 1, word)
                    || dfs(board, i - 1, j, count + 1, word)
                    || dfs(board, i, j + 1, count + 1, word)
                    || dfs(board, i, j - 1, count + 1, word);

        board[i][j] = temp;//restore the value of that cell after the recursive call.
        return found;
    }
}
