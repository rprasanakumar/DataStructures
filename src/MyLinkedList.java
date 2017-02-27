/**
 * Created by prasanna Kumar on 2/24/2017.
 * This is the implementation of LinkList
 *  Node is a class which holds the entities of the List nodes.
 */
public class MyLinkedList {

        Node head;
        Node tail;

        MyLinkedList(){
            // Changing this
            head = null;
            //head.setKey(0);
            tail=null;
            //tail.setKey(0);
        }

        public void pushTop(Node nd){

            if(head==null) {
                head= nd;
                tail = nd;
                nd.setNextNode(null);

            }
            else{
                nd.setNextNode(head);
                head= nd;

            }
        }

        public void pushBack(Node nd){

            if(tail==null){
                nd.setNextNode(null);
                tail.setNextNode(nd);;
            }
            else{
                tail.setNextNode(nd);
                nd.setNextNode(null);
            }
        }

        public void printList(){
            Node curr = head;
            while(curr!=tail){
                System.out.println(curr.getKey());
                curr = curr.getNextNode();
            }

        }




}

 class Node{

    private int key;
     private Node nextNode;

     public void setKey(int key) {
         this.key = key;
     }

     public void setNextNode(Node nextNode) {
         this.nextNode = nextNode;
     }



     public int getKey() {
         return key;
     }

     public Node getNextNode() {
         return nextNode;
     }

     Node(int key){

        this.key =key;
    }


}