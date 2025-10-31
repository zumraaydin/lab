public class MyStack
{
    Node head;
    Node middle ;
    int size;
     public MyStack()
    {
        head = null;
        middle = null;
        size = 0;

    }

    public void push( int data){
         Node newNode = new Node(data);
         newNode.next= head;
         if (head!=null){
             head.prev= newNode;}
         head=newNode;
         size++;


         if(size==1){
         middle= newNode;}
         else if(size %2 !=0){
         middle= middle.prev;}

    }

    public void pop(){
         if (head== null){
         throw  new RuntimeException("Stack Underflow");}
         head=head.prev;
         head.prev.prev=null;

         size--;





    }

}
