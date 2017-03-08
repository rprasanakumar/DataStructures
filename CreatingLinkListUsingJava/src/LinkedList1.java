import java.util.LinkedList;

/**
 * Created by prass on 3/7/2017.
 */
public class LinkedList1 {

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(3,8);
       list.remove();

        System.out.println(list.getFirst());
        System.out.println(list.toString());
    }
}
