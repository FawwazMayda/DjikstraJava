import java.util.ArrayList;

class Edge{
  public Node source,destination;
  public int weight;
  //This Case is directed Graph
  //If is undirected just add Double edge
  Edge(Node from,Node to, int length){
    this.source=from;
    this.destination=t;
    this.weight=length;
  }
  @Override
  public String toString() {
    return source + " " + destination;
  }
}

class Node {
  public distFromSource;
  public ArrayList<Node> neighbors = new ArrayList<>();

  public void addNeighbors(Node k){
    this.neighbors.add(k);
  }
}

class Graph {
  public ArrayList<Node> nodes = new ArrayList<>();
  public ArrayList<Edge> edges = new ArrayList<>();

  Graph(){
  }

  public void addNode(Node k){
    this.nodes.add(k);
  }
  public void addEdge(Edge k){
    Node s = k.source;
    Node d = k.destination;
    //Adding to the neighbors List
    s.addNeighbors(d);
    //Adding to EdgeList
    this.edges.add(k);
  }

}


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //System.out.pri
  }
}