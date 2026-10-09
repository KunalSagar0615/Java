class LinkedList {

    class Node{
        int key;
        Node next;

        Node(int key){
            this.key = key;
            this.next = null;
        }
        
    }

    public static Node head;

    public void detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("Cycle is present");
                 break;
            }
                
        }
    }

    public void removeCycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle = false)
            return;

        slow = head;
        Node prev = null;
        
        while(slow != fast){
            prev=fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
        System.out.println("Cycle is removed");
    }
    
    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = ll.new Node(1);
        ll.head.next = ll.new Node(2);
        ll.head.next.next = ll.new Node(3);
        ll.head.next.next.next = ll.new Node(4);
        ll.head.next.next.next.next= ll.new Node(5);
        ll.head.next.next.next.next.next = ll.head.next;

        ll.detectCycle(head);
        ll.removeCycle(head);
    }
}
