package Linked_List;

public class CircularLinkList {

    public static class CLL{

        public Node head;
        public Node tail;
        public CLL()
        {
            this.head=null;
            this.tail=null;
        }

        public void insert(int val)
        {
            Node node = new Node(val);

            if(head==null)
            {
                head=node;
                tail=node;
                return;
            }
            tail.next=node;
            node.next=head;
            tail=node;
        }

        public void display(){
            Node node=head;
            if(head!=null)
            {
                do{
                    System.out.print(node.val + "->");
                    node = node.next;
                }while(node!=head);
            }
            System.out.println("HEAD");
        }

        public void delete(int val)
        {
            Node node=head;
            if(node==null)
            {
                return;
            }
            if(node.val==val)
            {
                head=head.next;
                tail.next=head;
                return;
            }
            do{
                Node n=node.next;
                if(n.val==val)
                {
                    node.next=n.next;
                    break;
                }
            node=node.next;
            }while(node!=head);
        }

        public class Node{
            int val;
            Node next;
            public Node(int val)
            {
                this.val=val;
            }
        }
    }
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(88);
        list.insert(54);
        list.insert(32);
        list.insert(23);
        list.insert(13);
        list.delete(32);
        list.display();
    }
}
