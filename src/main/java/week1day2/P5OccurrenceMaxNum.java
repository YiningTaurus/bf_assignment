package week1day2;

import java.util.Scanner;
import java.util.TreeMap;

/*
* (Occurrence of max numbers)
* Write a program that reads integers, finds the largest of them, and counts its occurrences.
* Assume that the input ends with the number 0.
* Suppose that you entered 3 5 2 5 5 5 0;
* the program finds that the largest is 5 and the occurrence count for 5 is 4.
* Enter numbers: 3 5 2 5 5 5 0
* The largest number is 5
* The occurrence count of the largest number is 4
*
* */
public class P5OccurrenceMaxNum {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        int currNum = scanner.nextInt();
        while(currNum != 0){
            map.put(currNum, map.getOrDefault(currNum, 0) + 1);
            currNum = scanner.nextInt();
        }
        System.out.println("The largest number is: " + map.lastKey());
        System.out.println("The occurrence count of the largest number is: " + map.get(map.lastKey()));
    }
}
