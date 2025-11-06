public class queue {
    int capacity ;
    int [] array;
    int front , rear, size;


    public queue(int capacity){
        capacity = capacity;
        front= 0;
        size =0;
        rear=capacity-1;  // liner array olsaydı rear-1
        array= new int[capacity];}


    boolean isFull() {return (size==capacity);}

    boolean isEmpty() {return size==0;}

    public int dequeue(){
        if (isEmpty()){throw... ;}

        int item = queue[front];
        front= (front+1)%capacity;            // linear için front= front+1;
        size--;
        return item;
    }


    public int enqueue(){
        int item=queue[rear];
        rear = (rear+1)%capacity;               // if linear rear=rear+1
        size++;
        return item;
    }

    public int peek(){
        return queue[front];}

    public int size(){return size;}


}


