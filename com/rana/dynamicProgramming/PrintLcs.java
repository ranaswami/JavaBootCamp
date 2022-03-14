package com.rana.dynamicProgramming;

public class PrintLcs {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        String s3 = "abaaa";
        String s4 = "baabaca";

        //System.out.println(printLcs(s1, s2));
        System.out.println(printLcs(s3, s4));
        System.out.println(printLcs(s3, s4));
        System.out.println(printLcs(s3, s4));


    }
    static String printLcs(String x, String y){
        int m = x.length();
        int n = y.length();

        int[][] t = new int[m+1][n+1];

        for (int i = 0; i < t[0].length; i++) {// Initialize 1st row with zero
            t[0][i] = 0;
        }

        for (int i = 1; i < t.length; i++) {// Initialize 1st column with zero
            t[i][0] = 0;
        }

        for (int i = 1; i < t.length; i++) {// try to visualize the matrix. At any particular row and column, the value of t[i][j] will be our output
            for (int j = 1; j < t[0].length; j++) {// for that particular row and column (i & j).
                if (x.charAt(i-1) == y.charAt(j-1))
                    t[i][j] = 1 + t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (m > 0 && n > 0){
            if (x.charAt(m-1) == y.charAt(n-1)){
                sb.append(x.charAt(m-1));
                m--;
                n--;
            }
            else {
                if (t[m][n-1] > t[m-1][n])
                    n--;
                else if (t[m][n-1] > t[m-1][n]){

                } else{
                    m--;
                }
            }
        }

        String res = sb.reverse().toString();
        return res;
    }
}
