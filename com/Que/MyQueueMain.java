package com.Que;

public class MyQueueMain {
    public static void main(String[] args) {

    MyQueue myQueue = new MyQueue();
     myQueue.append(56);
        myQueue.append(30);
        myQueue.append(70);
        myQueue.display();

        while(myQueue.head != null) {
            myQueue.pop();
            System.out.println("Updated List: ");
            myQueue.display();
        }

}
}
