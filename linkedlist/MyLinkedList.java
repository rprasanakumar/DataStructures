import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Created by prasanna Kumar on 2/24/2017.
 * This is the implementation of LinkList
 *  Node is a class which holds the entities of the List nodes.
 */
public class MyLinkedList {



        Node head;
        Node tail;

         Node getNode(int n){

            Node node = new Node(n);

            return node;
        }

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
                tail=nd;
                head = nd;
            }
            else{
                tail.setNextNode(nd);
                nd.setNextNode(null);
                tail = nd;
            }
        }

        public void addAfter(int source,int target){
           Node n= getNode(source);

           Node tmp = head;
           while(tmp!= null ){
               if(tmp.getKey()==target){
                   tmp.setNextNode(n);
                   break;
               }

               tmp =tmp.nextNode;
           }
            if(tmp==tail){
               tail=tmp.getNextNode();
            }


        }

        public void printList(){
            Node curr = head;
            while(curr!=null){
                System.out.println(curr.getKey());
                curr = curr.getNextNode();
            }

        }

        public void deleteThisElement(int key){

            Node tmp = head;
            if(tmp==null){
                return;
            }
            else if(tmp.getKey()==key){
                head = head.nextNode;
            }

            while(tmp!=null && tmp.getNextNode()!=null ){

                if(tmp.getNextNode().getKey()==key){
                    tmp.nextNode = tmp.getNextNode().nextNode;

                    break;
                }

                 tmp =tmp.nextNode;
            }

            if(tmp!=null && tmp.getNextNode()==null){
                tail =tmp;
            }



        }

        public Iterator Iterator(){

            return  new Iterator();
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

    class Iterator implements java.util.Iterator<Node>{

        Node curr;

        Iterator(){
            curr =head;
        }

        @Override
        public boolean hasNext() {

            if(curr!=null ){
                return true;
            }
            return false;
        }

        @Override
        public Node next() {
            if(curr!=null){
                Node r_node =curr;
                curr = curr.nextNode;
                return r_node;
            }
            return curr;
        }

        @Override
        public void remove() {

            Node tmp = head;
            if(curr==tmp){
                head = curr.getNextNode();
                curr=null;
            }
            while(tmp!=null ){

                if(curr!=null && tmp.getNextNode()==curr){
                    tmp.nextNode=curr.nextNode;
                    break;
                }

                tmp = tmp.nextNode;
            }

            if(curr==tail){
                tail = tmp.nextNode;
            }

        }

        @Override
        public void forEachRemaining(Consumer<? super Node> action) {

        }
    }




}