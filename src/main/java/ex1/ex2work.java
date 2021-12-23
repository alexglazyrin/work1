package ex1;

public class ex2work {
    public static void main(String[] args) {
        counter(4,4);
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
}
