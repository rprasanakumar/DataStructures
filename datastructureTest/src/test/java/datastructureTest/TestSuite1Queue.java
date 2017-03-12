package datastructureTest;
import org.junit.*;
import queues.src.QueuesfromArrays;

/**
 * Unit test for testing the Array implemetation of the Queue
 */
public class TestSuite1Queue
{
/*
    * This is the testcase used for the checking the positive cases.
    * Module tested: queues
    * Class Name: QueuesfromArrays
    * Method Name:enQueue
    * Input: enqueue(10)
    * output: print the queue to see 10
    *
    *
 */

   static QueuesfromArrays arrays;
    @BeforeClass
    public static void createQueue(){


        arrays = new QueuesfromArrays(6);




    }

 /*
 * This is the testcase used for the checking the positive cases.
 * Module tested: queues
 * Class Name: QueuesfromArrays
 * Method Name:enQueue
 * Input: enqueue(1)
 * output: print the queue to see 1
 *
 *
*/

 @Test
 public void testCase1(){

  String str = "1";
  arrays.enQueue(1);

  Assert.assertEquals(str,arrays.toString());




 }


 /*
 * This is the testcase used for the checking the positive cases.
 * Module tested: queues
 * Class Name: QueuesfromArrays
 * Method Name:enQueue, deQueues
 * Input: enqueue(1),enQueue(2),enQueue(3),enQueue(4),enQueue(5),deQueue(),deQueue(),enQueue(6),enQueue(7)
 * output: print the queue to see 3 4 5 6 7
 *
 *
*/
 @Test
    public void testCase2(){

       String str = "2 3 4 5 6 7";
       arrays.enQueue(1);
        arrays.enQueue(2);
        arrays.enQueue(3);
        arrays.enQueue(4);
        arrays.enQueue(5);
        arrays.deQueue();
        arrays.deQueue();
        arrays.enQueue(6);
        arrays.enQueue(7);
        Assert.assertEquals(str,arrays.toString());




    }



}
