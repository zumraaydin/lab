public class LinkedList {
    Node head;
    public LinkedList(){
        this.head=null;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
            current.next = newNode;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteVal(int data ){
        if (head==null){
            return;
        }

        if (head.data==data){
            head=head.next;
            return;
        }
        Node current = head;
        while(current.next!=null && current.next.data!=data){

      current=current.next;}
      if (current.next!=null){
          current.next=current.next.next;
            }

        }


    public void printList(){
        Node current= head;
        while(current!=null){
            System.out.println(current.data+ "--->" );
        }
        System.out.println("null");
    }

        }












