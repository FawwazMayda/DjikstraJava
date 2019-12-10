import java.util.ArrayList;
import java.util.HashSet;

class Edge{
  public Node source,destination;
  public int weight;
  //This Case is directed Graph
  //If is undirected just add Double edge
  Edge(Node from,Node to, int length){
    this.source=from;
    this.destination=to;
    this.weight=length;
  }
  @Override
  public String toString() {
    return source + " " + destination;
  }
}

class Node {
  public int distFromSource;
  public String label;
  public Node prev;
  public ArrayList<Node> neighbors = new ArrayList<>();

  Node(String l){
    this.label = l;
  }
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
  public void connect(Node source, Node dest, int weight){
    Edge e = new Edge(source,dest,weight);
    this.addEdge(e);
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
        int alt = a.distFromSource + this.getWeight(k,a);
        if (alt < a.distFromSource){
          a.distFromSource = alt;
          a.prev = k;
        }
      }
    }
    System.out.println("pendek");
  }

  public Node getMinDistFromSource(HashSet<Node> q){
    Node k=null;
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
    Graph g= new Graph();
    Node A = new Node("A");
    Node B = new Node("B");
    Node C = new Node("C");
    Node D = new Node("D");
    Node E = new Node("E");
    Node F = new Node("F");
    g.addNode(A);
    g.addNode(B);
    g.addNode(C);
    g.addNode(D);
    g.addNode(E);
    g.addNode(F);
    
    g.connect(A,B,10);
    g.connect(A,C,15);
    g.connect(B,D,12);
    g.connect(B,F,15);
    g.connect(F,E,5);
    g.connect(D,F,1);
    g.connect(D,E,2);
    g.connect(C,E,10);
    g.shortestPath(A);
    System.out.println("Ball world!");

  }
}