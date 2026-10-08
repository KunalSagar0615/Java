class LinkedList{
        public class Node{
                int data;
                Node next;

                Node(int data){
                        this.data=data;
                        this.next=null;
                }
        }

        public static Node head;
        public static Node tail;
        
        // ADD FIRST
        public void addFirst(int data){
                Node newNode = new Node(data);

                if(head == null){
                        head = tail = newNode;
                        return;
                }

                newNode.next = head;
                head = newNode;
        }

        // ADD LAST
        public void addLast(int data){
                Node newNode = new Node(data);

                if(head == null){
                        head = tail = newNode;
                        return;
                }

                tail.next = newNode;
                tail = newNode;
        }

        // ADD AT INDEX
        public void add(int index, int data){
                Node newNode = new Node(data);
                Node temp = head;

                if(head == null || index == 0){
                        head = tail = newNode;
                        return;
                }

                int i = 0;
                while(i < index-1){
                        temp = temp.next;
                        i++;
                }

                newNode.next = temp.next;
                temp.next = newNode;
        }
        
        // DISPLAY LL
        public void printNode(){
                Node temp = head;

                while(temp != null){
                        System.out.print(temp.data + " -> ");
                        temp = temp.next;
                }

                System.out.println("null");
        }
        
        public static void main(String []args){
                LinkedList ll = new LinkedList();
                ll.addFirst(2);
                ll.addFirst(1);
                ll.addLast(3);
                ll.addLast(4);
                ll.add(2,9);
                ll.printNode();
                
        }
}
