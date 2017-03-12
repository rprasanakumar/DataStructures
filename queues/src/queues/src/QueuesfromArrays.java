package queues.src;
import java.lang.reflect.Array;

/**
 * Created by prass on 3/9/2017.
 * This class is the implementation of the basic Queue data structure
 */
public class QueuesfromArrays<T extends Object> implements QueueInterface<T> {
    T[] queueArray = null;
    int totalNumberofElements =0;
    int front=0;
    int back =-1;

    public  QueuesfromArrays(int size){

        queueArray = (T[]) new Object[size];
    }
    @Override
    public void enQueue(T t) throws QueueException {

        int size = queueArray.length;
        if(totalNumberofElements == queueArray.length){
            throw new QueueException("Queue is FULLL!");

        }
        else{

            if(back<queueArray.length-1){

                queueArray[++back] = t;
                totalNumberofElements++;

            }
            else if(totalNumberofElements<size){
                 back = (back%(size-1));
                queueArray[ back] = t;
                totalNumberofElements++;
            }


        }

    }

    @Override
    public T deQueue() throws QueueException {

        T elementDequeued = null;
        if(totalNumberofElements==0){
            throw new QueueException("Queue is Empty!");
        }
        else if(front<queueArray.length-1){

            elementDequeued = queueArray[front++];
            totalNumberofElements--;
            T[] newArray = (T[]) new Object[queueArray.length];
            if(back>=front)
                System.arraycopy(queueArray,front,newArray,front,totalNumberofElements);
            else{
                System.arraycopy(queueArray,0,newArray,0,(back+1));
                System.arraycopy(queueArray,front,newArray,front,(back+1)-queueArray.length);

            }

            queueArray = newArray;


        }

        return elementDequeued;





    }



    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    public static void main(String[] args){

        QueuesfromArrays queue = new QueuesfromArrays(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.print(queue.deQueue());
        queue.enQueue(60);

    }


    public String toString() {

        StringBuffer sb = new StringBuffer();
        if (queueArray != null && totalNumberofElements != 0) {
            int count = 0;
            int headptr = front;
            while (totalNumberofElements != count) {
                if (headptr < queueArray.length ) {
                    sb.append(queueArray[headptr++]).append(" ");
                } else {
                    headptr = 0;
                    sb.append(queueArray[headptr++]).append(" ");

                }
                count++;
            }

        }
        return sb.toString().trim();

    }
}

interface QueueInterface<T>{

    public void enQueue(T t) throws QueueException;
    public T deQueue()throws QueueException;
    public boolean isEmpty();
    public void clear();
}

class  QueueException extends RuntimeException{

    QueueException(String message){
        super(message);
    }

    QueueException(){
        super();
    }
}