import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by prass on 3/9/2017.
 */
public class StackImplementationFromList<T> implements StackInterfacing2<T> {

    Node head = null;
    Node tail =null;
    Node<T> node = null;
    class Node<T>{

        private T key;
        private Node nextNode;

        public T getKey(){

            return this.key;
        }

        public void setKey(T key){

            this.key =key;
        }

        public Node getNextNode(){

            return this.nextNode;
        }

        public void setNextNode(Node n){

            this.nextNode =n;
        }
    }
    StackImplementationFromList(){

        node= new Node<T>();
    }

    @Override
    public boolean isEmpty() {

        return (head==null);
    }

    @Override
    public T peek() throws StackingException {
        Node returnNode =null;
        if(head==null && tail==null){
            throw new StackingException("Stack is empty");
        }
        else{
            Node tmp =head;
            while(tmp.nextNode!=tail){
                tmp = tmp.nextNode;
            }
            returnNode= tmp.nextNode;
        }
        return (T) returnNode.getKey();
    }

    @Override
    public T pop() throws StackingException {
        Node returnNode =null;
        if(head==null && tail==null){
            throw new StackingException("Stack is empty");
        }
        else if(head==tail){
            returnNode = head;
            head =null;
            tail =null;
        }
        else{
            Node tmp =head;
            while(tmp.nextNode!=tail ){
                tmp = tmp.nextNode;
            }
            returnNode= tmp.nextNode;
            tail = tmp;
            tmp.nextNode =null;
        }
        return (T) returnNode.getKey();
    }

    @Override
    public void push(T t) {

    if(head==null){
        node.setKey(t);
        head= node;
        tail = node;
        node.nextNode =null;
    }
    else{
        Node<T> newNode = new Node<T>();
        newNode.setKey(t);
        tail.nextNode = newNode;
        tail = newNode;
        newNode.nextNode = null;
    }

    }

    public static void main(String[] args){

        StackImplementationFromList<Integer> stack = new StackImplementationFromList<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());System.out.println(stack.pop());
    }
}



interface StackInterfacing2<T> {

    public void push(T t);
    public T pop() throws StackingException;
    public T peek()throws StackingException;
    public boolean isEmpty();

}

class StackingException extends RuntimeException{

    public StackingException(String mess){
        super(mess);
    }

    public StackingException(){
        super();
    }

}

