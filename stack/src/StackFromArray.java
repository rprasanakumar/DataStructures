/**
 * Created by prass on 3/9/2017.
 */
public class StackFromArray {

    public static void main(String[] args){

        StackMe<Integer> stack = new StackMe<Integer>();
        stack.push(new Integer(10));
        stack.push(new Integer(20));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));
        stack.push(new Integer(30));stack.push(new Integer(30));stack.push(new Integer(300));
        stack.push(new Integer(300));
        stack.push(new Integer(300));
        stack.push(new Integer(300));
        stack.push(new Integer(300));
        stack.push(new Integer(300));
        stack.push(new Integer(30000));


        System.out.print(stack.peek());
        System.out.print(stack.isEmpty());
    }
}

class StackMe<T extends Integer> implements StackInterface{

    Integer[] arr ;
    int top =-1;
    int capacity =0;

      StackMe(){
        arr = new Integer[10];
        top =-1;
        capacity =arr.length;

    }

    @Override
    public void push(Object e) {

        if(top!=capacity-1) {
            arr[++top] = (Integer) e;
        }
        else{
            Integer[] dynamic = new Integer[capacity*2];
            capacity = dynamic.length;
            System.arraycopy(arr,0,dynamic,0,top);
            arr =dynamic;
            arr[++top] = (Integer) e;
        }

    }

    @Override
    public Integer pop() {
        int ele =0;
        if(isEmpty()){

            ele = arr[top];
            arr[top] =null;
            top--;
        }
        else
        {
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ele;
    }

    @Override
    public Integer peek() {
        int ele =0;
        if(isEmpty()){

            ele = arr[top];
        }
        else {

            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ele;
    }

    @Override
    public boolean isEmpty() {
        if(arr!=null && top>-1){

           return false;
        }
        return true;
    }
}