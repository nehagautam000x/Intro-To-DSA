package Linked_List;

public class DoublyLinkedList {

    public static class DLL{
        public Node head;
        //To insert the node at Last
        public void insertLast(int val)
        {
            Node node = new Node(val);
            Node temp=head;
            node.next=null;

            if(head==null)
            {
                node.prev=null;
                head=node;
                return;
            }

            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
        }

        // To insert the Node at the First
        public void insertFirst(int val){
            Node node = new Node(val);
            node.next=head;
            node.prev=null;
            if(head!=null)
            {
                head.prev=node;
            }
            head=node;
        }

        // TO display the Doubly Linked List        
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
        
        //Creating a doubly Linked List
        public class Node{
            public int val;
            public Node next;
            public Node prev;
            public Node(int val){
                this.val=val;
            }
            public Node(int val, Node next, Node prev)
            {
                this.val=val;
                this.next=next;
                this.prev=prev;
            }
        }

        // To insert at a particular index
        public void insert(int after, int val)
        {
            Node p=find(after);
            if(p==null)
            {
                System.out.println("Doesn't exist");
                return;
            }
            Node node = new Node(val);
            node.next=p.next;
            p.next=node;
            node.prev=p;
            if(node.next!=null)
                node.next.prev=node;
        }

        public Node find(int val)
        {
            Node node = head;
            while(node!=null)
            {
                if(node.val==val)
                {
                    return node;  
                }
                node=node.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(12);
        list.insertFirst(23);
        list.insertFirst(54);
        list.insertFirst(78);
        list.insertFirst(79);
        list.insertLast(100);
        list.insert(54,65);
        list.display();
    }
}
