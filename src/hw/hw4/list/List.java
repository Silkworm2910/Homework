package hw.hw4.list;

public class List {
  private Node first, next;

  public void addNode (int value) {
      Node node = new Node();
      node.nodeValue = value;
      if (first == null) {
          first = node;
          next = node;
      }
      else {
          next.nextNode = node;
          next = node;
      }
  }

  public void remove (int value) {
        Node node = first;
        if (first.getNodeValue() == value) {
            first = node.nextNode;
        }
        else {
        while (node.nextNode != null) {
            if (node.nextNode.getNodeValue() == value) {
                node.nextNode = node.nextNode.nextNode;
            }
            node = node.nextNode;
        }
        }
  }


  public void print() {
      Node node = first;
      while (node != null) {
          System.out.print(node.nodeValue + " ");
          node = node.nextNode;
      }
      System.out.println();
  }
}
