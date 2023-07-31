package Linked_List;
// import java.util.*;
public class LinkedListIntro {


    public static class LL{
        public Node head;
        public Node tail;
        public int size;

        public LL()
        {
            this.size=0;
        }

        public class Node{
            public int val;
            public Node next;

            public Node(int val)
            {
                this.val=val;
            }
            public Node(int val, Node next)
            {
                this.val=val;
                this.next=next;
            }
        }
        // To insert the node at the first
        public void insertFirst(int val){
                Node node = new Node(val);
                node.next=head;
                head=node;
                if(tail==null)
                {
                    tail=head;
                }
                size+=1;
        }
        // To insert the node at the last
        public void insertLast(int val){
                if(tail==null)
                {
                    insertFirst(val);
                    return;
                }
                Node node = new Node(val);
                tail.next=node;
                tail=node;
                size+=1;
        }
        //To insert the node at some particular index
        public void insertIndex(int val, int index){
            if(index==0)
            {
                insertFirst(val);
                return;
            }
            if(index==size)
            {
                insertLast(val);
                return;
            }
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp= temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next=node;
            size++;
        }

        //To delete the node from first
        public int deleteFirst()
        {
            int val = head.val;
            if(head==null)
                tail=null;
            else
                head=head.next;
            size--;
            return val;
        }

        // To delete the node from the last
        public int deleteLast()
        {
            if(size<=1)
            {
                return deleteFirst();
            }
            Node secondLast = get(size-2);
            int val= tail.val;
            tail=secondLast;
            tail.next=null;
            return val;
        }

        // To delete node from particular index
        public int delete(int index)
        {
            if(index==0)
            {
                return deleteFirst();
            }
            if(index==size-1)
            {
                return deleteLast();
            }
            Node prev = get(index-1);
            int val = prev.next.val;
            prev.next= prev.next.next;
            return val;
        }

        //To get the reference of any node
        public Node get(int index)
        {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp=temp.next;
            }
            return temp;
        }

        // TO display the nodes of the linked list
        public void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.val + " -> ");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }


    public static void main(String[] args) {
        LL link = new LL();
        link.insertFirst(3);
        link.insertFirst(2);
        link.insertFirst(8);
        link.insertFirst(19);
        link.insertFirst(12);
        link.insertLast(99);
        link.insertIndex(33, 3);
        link.display();
        System.out.println(link.deleteFirst());
        link.display();
        System.out.println(link.deleteLast());
        link.display();
        System.out.println(link.delete(3));
        link.display();
    }
}
