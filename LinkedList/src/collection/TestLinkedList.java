package collection;

/**
 * Created by truonglx.
 */
public class TestLinkedList {



    public static void main(String[] args) {

        LinkedList linkedList=new LinkedList();
        linkedList.add(4);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(1);
        linkedList.add(5);
        linkedList.printList();
        linkedList.removeLast();
        linkedList.printList();
        linkedList.removeByTarget(3);
        linkedList.printList();
    }
}
