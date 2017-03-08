import java.util.Iterator;

/**
 * Created by prass on 2/24/2017.
 *
 * This is general testing class for all the Data Strctures we will be looking
 */
public class TestingClass {

    public static void main(String[] args){

        MyLinkedList lstNew = new MyLinkedList();

//        Node n =  new Node( 3);
//        Node n1 =  new Node( 4);
//        Node n2 =  new Node( 5);
//        Node n3 =  new Node( 6);
//        Node n4 =  new Node( 7);
//        Node n5 =  new Node( 8);
        lstNew.pushTop(lstNew.getNode(3));
        lstNew.pushTop(lstNew.getNode(4));
        lstNew.pushTop(lstNew.getNode(5));
        lstNew.pushTop(lstNew.getNode(6));
        lstNew.pushTop(lstNew.getNode(7));
        lstNew.pushTop(lstNew.getNode(8));
        lstNew.addAfter(9,3);
      // lstNew.deleteThisElement(9);
        //lstNew.printList();

        MyLinkedList.Iterator it= lstNew.Iterator();

        while(it.hasNext()){
            System.out.print(it.next().getKey());
        }

//        System.out.println(lstNew.head.getKey());
//        System.out.println(lstNew.tail.getKey());

    }
}
