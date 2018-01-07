
public class LinkedList<E> {
    
    /* The Node class is used to store an element and two references or links
     * to the previous and next nodes.
     */
    private class Node {
        /* Declare the previous, element and next properties. */
        public E element;
        public Node next;
        public Node previous;
        
        public Node(Node previous, E element, Node next) {
        this.element = element;
        this.next = next;
        this.previous = previous;
        }// end Node()
    }// end Node
    
    /* Declare the head, tail and size properties. */
    private Node head;
    private Node tail;
    private int size;
    
    private void addDummyNodes() {
        /* A dummy node is a regular node, but its element is never used. Its purpose
         * is to allow head/tail to always point to a node, thus it never has to change.
         */ 
       head = new Node(null, null, null);
       head.next = new Node(head, null, null);
       tail = head.next;
        
    }// end addDummyNodes()
   
    private void removeNode(Node del, Node before) {
        /* To remove the node referenced by del, the node before it, is linked to
         * the node after it.
         */
        Node after = del.next;
         size -= 1;
        before.next = after;
    }// end removeNode()
    
    private void addNode(Node before, E element, Node after) {
        /* To add a new node after the node referenced by before, the before
         * node is linked to the new node.
         */
        
        //why is the addnode void
        
        
        before.next = new Node(before, element, after);
        after.previous = new Node(before, element, after);
        size += 1;
        
      
        
        
    }// end addNode()
   
    public LinkedList() {
        /* Creates an empty list with two dummy nodes (head/tail) and sets the size to 0. */
        addDummyNodes();
        size = 0;
    }// end LinkedList()

    public void addFirst(E element) {
        /* Calls the insertAt() method to insert the element as the first node. */
        insertAt(0, element);
    }// end addFirst()
    
    public void addLast(E element) {
        /* Calls the insertAt() method to insert the element as the last node. */
        insertAt(size, element);
    }// end addLast()
    
    public void insertAt(int index, E element) {
        /* If the index is < 0 set the index to 0, if greater than size set the index to size. */
        index = (index < 0)? 0: (index > size)? size : index;
        
        Node before = head;
        
        for (int beforeIndex = 0; beforeIndex < index; beforeIndex++) {
            before = before.next;
        }
        
        Node after = before.next;
        addNode(before, element, after);
        
    }// end insertAt()
    
    public void removeFirst() {  
        /* Calls the removeAt() method to remove the first node. */
        removeAt(0);
    }// end removeFirst()
    
    public void removeLast() {
        /* Calls the removeAt() method to remove the last node. */
        removeAt(size - 1);
    }// end removeLast()
    
    public void removeAt(int index) {  
        /* Removes only if list is not empty. 
         * If index is < 0 then sets the index to 0. If index >= size, then the index is set
         * to size - 1.
         */
        if ( !isEmpty() ) {
            index = (index < 0)? 0: (index >= size)? size - 1 : index; 
            
            Node before = head;
            
            for (int beforeIndex = 0; beforeIndex < index; beforeIndex++) {
                before = before.next; 
        }
        
        Node del = before.next;
        removeNode(del, before);
        
  
        
        // end removeAt()
      }
    }
    public boolean isEmpty() {
        return size == 0;
    }// end isEmpty()
    
    public String reversed() {
        /* Displays the linked list in reverse order, from tail to head. */
        /* display linked list from tail to head, get the iter to go from tail to head, and whenever iter isnt at the head, the iter should go from tail to head */
            String str = "[\n\t";
         Node iter = tail.previous;
         //use previous instead of next//
         while ( iter != head) {
             str += String.valueOf(iter.element) + " \n\t ";
             iter = iter.previous;
             
            }
            
            return str.trim() + "\n]\n";
        
    }// end reversed()
    
    @Override
    public String toString() {
        /* Returns the elements on the list, one per line, from head to tail. */
        
            String str = "[\n\t";
         Node iter = head.next;
        
         while ( iter != tail) {
         str += String.valueOf(iter.element) + "[\n\t";
         iter = iter.next;
         }// end while()
        
         return str.trim() + "[\n\t"; 
    }// end toString()

}// end LinkedList
