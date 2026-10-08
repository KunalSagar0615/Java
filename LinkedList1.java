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
        public static int size = 0;
        
        // ADD FIRST
        public void addFirst(int data){
                Node newNode = new Node(data);
                size++;

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
                size++;

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
                size++;
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

        // REMOVE FIRST
        public void removeFirst(){
                if(head == null){
                        System.out.println("LL IS EMPTY !!");
                        return;
                }

                if(head.next == null){
                        size = 0;
                        head = tail = null;
                        System.out.println("ELEMENT REMOVED SUCCESSFULLY");
                }

                head = head.next;
                size--;
                System.out.println("ELEMENT REMOVED SUCCESSFULLY");           
        }

        // REMOVE LAST
        public void removeLast(){

                if(head == null){
                        System.out.println("LL IS EMPTY !!");
                        return;
                }

                if(head.next == null){
                        head = tail = null;
                        size--;
                        System.out.println("ELEMENT REMOVED SUCCESSFULLY");
                }

                Node temp = head;
                int i = 0;
                while(i < size-2){
                        temp = temp.next;
                        i++;
                }

                temp.next = null; // prev
                tail = temp;
                size--;
                System.out.println("ELEMENT REMOVED SUCCESSFULLY");
        }

        // REMOVE BY INDEX
        public void removeByIndex(int idx){
                if(head == null){
                        System.out.println("LL IS EMPTY !!");
                        return;
                }

                if(idx >= size){
                        System.out.println("INDEX NOT FOUND");
                        return;
                }

                int i = 0;
                size--;
                Node temp = head;
                while(i < idx-1){
                        temp=temp.next;
                        i++;
                }

                if(temp.next.next == null){
                        temp.next = null;
                        System.out.println("ELEMENT REMOVED SUCCESSFULLY");
                        return;
                }
                
                temp.next=temp.next.next;
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

        // SEARCH ELEMENT IN LL
        public int search(int key){
                if(head == null){
                        System.out.println("LL IS EMPTY");
                        return -1;
                }
                        
                Node temp = head;
                int idx = 0;
                while(temp != null){
                        if(temp.data == key)
                                return idx;
                        
                        temp = temp.next;
                        idx++;
                }

                return -1;
        }

        // REVERSE LL
        public void reverseLL(){
                Node prev = null;
                Node curr = head;
                Node next;

                while(curr != null){
                        next = curr.next;
                        curr.next = prev;
                        prev = curr;
                        curr = next;
                }

                head = prev;
        }

        // REMOVE Nth NODE FROM LAST
        public void removeNthNodeByLast(int idx){
                removeByIndex(size-idx);
        }
        
        public static void main(String []args){
                LinkedList ll = new LinkedList();
                ll.addFirst(2);
                ll.addFirst(1);
                ll.addLast(3);
                ll.addLast(4);
                ll.add(2,9);
                ll.printNode();
                // System.out.println("SIZE IS: "+size);
                // ll.removeByIndex(4);
                // ll.printNode();
                // System.out.println(ll.search(9));

                // ll.reverseLL();
                ll.removeNthNodeByLast(2);
                ll.printNode();
                                
        }
}
