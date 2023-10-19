package week1day4.P1MaxPriorityQueue;

import java.util.PriorityQueue;

/*
* Change Java PriorityQueue to a maximum PriorityQueue.
* */
public class P1MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(3);
        minPQ.add(32);
        minPQ.add(56);
        minPQ.add(6);
        System.out.println("Numbers polling from minPQ: ");
        while(!minPQ.isEmpty()){
            System.out.print(minPQ.poll() + " ");
        }
        System.out.println();
        System.out.println("---------------------------");
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((o1, o2) -> o2 - o1);
        maxPQ.add(3);
        maxPQ.add(32);
        maxPQ.add(56);
        maxPQ.add(6);
        System.out.println("Numbers polling from maxPQ: ");
        while(!maxPQ.isEmpty()){
            System.out.print(maxPQ.poll() + " ");
        }
    }
}
