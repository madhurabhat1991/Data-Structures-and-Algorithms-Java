// https://visualgo.net/en/graphds
// 0: [1,2], 1: [0,2,3], 2: [0,1,4], 3: [1,4], 4: [2,3,5], 5: [4,6], 6: [5]

import java.util.*;

class _01_graph_implementation {
  public static void main(String[] args) {
    Graph myGraph = new Graph();
    myGraph.addVertex(0);
    myGraph.addVertex(1);
    myGraph.addVertex(2);
    myGraph.addVertex(3);
    myGraph.addVertex(4);
    myGraph.addVertex(5);
    myGraph.addVertex(6);
    myGraph.addEdge(3, 1);
    myGraph.addEdge(3, 4);
    myGraph.addEdge(4, 2);
    myGraph.addEdge(4, 5);
    myGraph.addEdge(1, 2);
    myGraph.addEdge(1, 0);
    myGraph.addEdge(0, 2);
    myGraph.addEdge(6, 5);
    myGraph.showConnections();
  }
}

public class Graph {
  int numberOfNodes;
  Hashtable<Integer, ArrayList<Integer>> adjacentList;

  public Graph() {
    numberOfNodes = 0;
    adjacentList = new Hashtable<>();
  }

  public void addVertex(int node) {
    adjacentList.put(node, new ArrayList<>());
    numberOfNodes++;
  }

  // undirected graph
  public void addEdge(int node1, int node2) {
    adjacentList.get(node1).add(node2);
    adjacentList.get(node2).add(node1);
  }

  public void showConnections() {
    adjacentList.forEach((key, value) -> System.out.println(key + "\t-->\t" + Arrays.toString(value.toArray())));
  }
}