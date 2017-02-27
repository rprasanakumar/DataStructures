/**
 * Created by prass on 2/24/2017.
 *
 * This is general testing class for all the Data Strctures we will be looking
 */
public class TestingClass {

    public static void main(String[] args){

        MyLinkedList lstNew = new MyLinkedList();

        Node n =  new Node( 3);
        Node n1 =  new Node( 4);
        Node n2 =  new Node( 5);
        Node n3 =  new Node( 6);
        Node n4 =  new Node( 7);
        Node n5 =  new Node( 8);
        lstNew.pushTop(n);
        lstNew.pushTop(n1);
        lstNew.pushTop(n2);
        lstNew.pushTop(n3);
        lstNew.pushTop(n4);
        lstNew.pushTop(n5);

        lstNew.printList();
    }
}
