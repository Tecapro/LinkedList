package collection;

/**
 * Created by truonglx.
 */

class Node{
   int val;
   Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedListEx extends Exception{

    public LinkedListEx(String message) {
        super(message);
    }
}

public class LinkedList {

    private Node head;

    private Node getLastNode() throws LinkedListEx{

        Node tem=head;
        if(tem==null)
            throw new LinkedListEx("List Empty");
        while(tem.next!=null)
            tem=tem.next;
        return tem;
    }


    public void add(int val){
        try {
            Node lastNode=getLastNode();
            lastNode.next=new Node(val,null);
        } catch (LinkedListEx linkedListEx) {
            head=new Node(val,null);
        }
    }


    public void removeLast(){

        if(head==null)
            return;
        if(head.next==null)
            head=null;
        Node tem=head;
        while(tem.next.next!=null)
            tem=tem.next;
        tem.next=null;
    }

    public void removeByTarget(int val){

        Node tem;
        if (head==null)
            return;

        while(head!=null&&head.val>val)
            head=head.next;

        if(head==null)
            return ;

        tem=new Node(val,head);

        while(tem.next.next!=null){
            if (tem.next.val>val)
                tem.next=tem.next.next;
            else
                tem=tem.next;
        }
        if(tem.next.val>val)
            tem.next=null;
    }


    public void  printList(){

        Node node=head;
        while(node!=null) {
            System.out.printf(node.val + ",");
            node=node.next;
        }
        System.out.println();
    }

}
