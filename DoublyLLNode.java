public class DoublyLLNode {
    int data;
    Node next,prev;
    public DoublyLLNode (int val){
        data = val;
        next=null;
        prev =null;

    }


    public static  Node push(Node head,int data ){
        Node newNode=new Node(data);
        newNode.next= head;
        newNode.prev = null;
        if (head!=null){
            head.prev=newNode;
            head=newNode;
            return head;
        }


    }
}
