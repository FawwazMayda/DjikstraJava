import java.util.ArrayList;
import java.util.HashSet;

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
  public int distFromSource;
  public Node prev;
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

  public void shortestPath(Node s){
    HashSet<Node> unvisited = new HashSet<>();
    for( Node v : this.nodes){
      v.distFromSource=Integer.MAX_VALUE;
      v.prev=null;
      unvisited.add(v);
    }
    s.distFromSource = 0;
    
    while(unvisited.isEmpty()==false){
      Node k = this.getMinDistFromSource(unvisited);
      unvisited.remove(k);

      for(Node a : k.neighbors){
        int alt = 
      }
      
    }
  }

  public Node getMinDistFromSource(HashSet<Node> q){
    Node k;
    int min = Integer.MAX_VALUE;
    for(Node a : q){
      if(a.distFromSource < min){
        min = a.distFromSource;
        k=a;
      }
    }
    return k;
  }

  public int getWeight(Node source, Node destination){
    for(Edge e : this.edges){
      if(e.source==source && e.destination==destination){
        return e.weight;

      }
    }
    return 0;
  }

}


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //System.out.pri
  }
}