/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */


    /**
      @return the number of elements in this list
     */
    public int size() {
      Node check = headReference;
      int count = 0;
      if (headReference != null){
        while (check.getReferenceToNextNode() != null){
          count++;
          check = check.getReferenceToNextNode();
        }
      }
      return count;
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
      Node currentNode = headReference;
      String ans = "";
      ans += "# elements: " + size() + " ";
      ans += " [";

      for (int i = 0; i < size(); i++){
        ans += currentNode.toString() + ", ";
        currentNode = currentNode.getReferenceToNextNode();
      }
      return ans + "]";
    }


    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
       if (size() > 0){
         Node head = new Node(val, headReference.getReferenceToNextNode());
         System.out.println(head);
         headReference.setReferenceToNextNode(head);
       }else{
         Node head = new Node(val);
         System.out.println(head == null);
         this.headReference.setReferenceToNextNode(head);
       }

       return true;
     }
}
