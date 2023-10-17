package week1day2;

/*
* Using only the programming techniques you learned in this lesson, write an application that
* calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in
* table format, as shown below. (Build-in functions are not acceptable)
* number square cube
* 0 0 0
* 1 1 1
* 2 4 8
* .
* .
* 10 100 1000
* */
public class P3CalAndPrintSquares {
    public static void main(String[] args) {
        System.out.println("Number Square Cube");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " " + i * i + " " + i * i * i);
        }
    }
}
