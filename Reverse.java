public class Reverse {

    Node reverse(Node Node){
        Node prev =null;
        Node current= Node;
        Node next= null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;}

        Node=prev;
        return Node;


    }
}
