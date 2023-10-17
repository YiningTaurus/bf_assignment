package week1day2;

/*
* (Print a table) Write a program that displays the following table:
* a b pow(a, b)
* 1 2 1
* 2 3 8
* 3 4 81
* 4 5 1024
* 5 6 15625
*
* */
public class P4PrintPowTable {
    public static void main(String[] args) {
        System.out.println("a b pow(a, b)");
        for (int i = 1; i <= 5; i++) {
            int num = i + 1;
            System.out.println(i + " " + num + " " + (int)Math.pow(i, num));
        }
    }
}
