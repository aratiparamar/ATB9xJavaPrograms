package Nov.ex_List_Set_Collection_Framework;

import java.util.PriorityQueue;

public class Lab216_Queue {
    public static void main(String[] args) {
        //0.001% in automation
        PriorityQueue pq=new PriorityQueue();
        //FIFO
        pq.offer("1"); //add
        pq.offer("2");
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
