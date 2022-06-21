package org.livecoding.hackerrank.week3;

public class DrawingBook {

    public static int pageCount(int n, int p) {
        // Write your code here
        boolean evenPageNo = p % 2 == 0;
        boolean evenPages = n % 2 == 0;
        int pageCountFromFront = evenPageNo ? p/2 : (p-1)/2;
        int pageCountFromBack = evenPages ? evenPageNo ? (n-p)/2 : (n+1-p)/2 : evenPageNo ? (n-p-1)/2 : (n-p)/2 ;

        return Math.min(pageCountFromFront, pageCountFromBack);
    }

    public static void main(String[] args) {
        System.out.println(pageCount(83246, 78132));
    }
}
