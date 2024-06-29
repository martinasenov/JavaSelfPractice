package DataStructures;

public class MySinglyLinkedList {

    Node head;
    Node tail;
    int size;


    boolean isEmpty(){
        return head==null;
    };

    //add new elements after tail
    void add(int value){

        Node newNode=new Node(value);
        if (isEmpty()) {
            head=tail=newNode;
            size++;

        }else {
            tail.next=newNode;
            tail=newNode;
            size++;
        }


    };


    //delete by the Value of the Node
    void deleteNode(){};

    //method that returns the index
    int indexOf(int value){

        return value;

    };

    //printing node values
    void printNodes(){

        Node current=head;
        while (current!=null){

            if(current.next==null) {
                System.out.print(current.value+"==> null");

            }else {

                System.out.print(current.value+"==>");
            }

            current=current.next;
        }



    };
}
