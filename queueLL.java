public class queueLL {

    public class Node{
        int data;
        Node next;}

        public  Node(int data){
        this.data=data;
        this.next=null;}


    private  Node front;
    private Node rear;
    private int size;


    public LLqueue(){
        front=null;
        rear=null;
        size=0;}

    public void enqueue(int data){
        Node newNode= newNode (data);
        if (isEmpty()){return (front==newNode); }
        else{ rear.next=newNode;
        size++;}



    public void dequeue(){
            if (isEmpty()){throw new RuntimeException("queue is empty");}
            else{
                front=front.next;
                size--;
            }



     public boolean isEmpty(){
                return size==0;
            }

            }
        }




    }








        }


