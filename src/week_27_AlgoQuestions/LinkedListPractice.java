package week_27_AlgoQuestions;

public class LinkedListPractice {

    Node head;


    public void add(int data){

        //create a new node with given data
        Node newNode=new Node(data);

        //if the linked list is empty, then make the new node as head
        if (this.head==null){
            this.head = newNode;
        }else {
            //else traverse till the last node and insert the new_node there

            Node last=this.head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }

    }

        public void printList() {
            Node currentNode = this.head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " -> ");
                currentNode = currentNode.next;
            }
            System.out.println("null");
        }


    public static void main(String[] args) {

        LinkedListPractice list=new LinkedListPractice();

        list.add(1);
        list.add(2);
        list.add(3);

        list.printList(); // Output will be: 1 -> 2 -> 3 -> null


    }



}
