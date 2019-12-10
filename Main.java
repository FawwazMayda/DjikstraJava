import java.util.ArrayList;

class Edge{
  public int fromNode;
  public int toNode;
  public int length;

  Edge(int from,int to, int length){
    this.fromNode=from;
    this.toNode = to;
    this.length=length;
  }

  public int getNeighbor(int v){
    if(v==this.fromNode){
      return this.fromNode;
    }
    return this.toNode;
  }
}

class Node {
  public boolean visited;
  public int distFromSource=Integer.MAX_VALUE;
  public ArrayList<Edge> edges = new ArrayList<>();
}

class Graph {
  Graph(){
    
  }

}


class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //System.out.pri
  }
}