package ex1;

import java.util.Scanner;

public class ex2work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        counter(s,c);
    }
    public static void counter (int s, int c){
        int counter = 1;
        int[][] table = new int[s][c];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < c; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void printArr (int [][] arr){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
