
public class ex5point2 {

    public static void main(String[] args) {
        System.out.println("Test with the first graph:\n");
        int V = 4;
        int E = 5; 
        Graph graph = new Graph(V, E); 
  
        // add edge 0-1 
        graph.edge[0].src = 0; 
        graph.edge[0].dest = 1; 
        graph.edge[0].weight = 10; 
  
        // add edge 0-2 
        graph.edge[1].src = 0; 
        graph.edge[1].dest = 2; 
        graph.edge[1].weight = 6; 
  
        // add edge 0-3 
        graph.edge[2].src = 0; 
        graph.edge[2].dest = 3; 
        graph.edge[2].weight = 5; 
  
        // add edge 1-3 
        graph.edge[3].src = 1; 
        graph.edge[3].dest = 3; 
        graph.edge[3].weight = 15; 
  
        // add edge 2-3 
        graph.edge[4].src = 2; 
        graph.edge[4].dest = 3; 
        graph.edge[4].weight = 4; 
  
        System.out.println("\nCalling the algorithm with e= 0-3\n");
        graph.SpecialKruskalMST(2);
        System.out.println("\nCalling the algorithm with e= 0-2\n");
        graph.SpecialKruskalMST(1);
        
        
        //second example
        System.out.println("\n\nTest with the second graph:\n");
        int V2 = 9;
        int E2 = 15; 
        Graph graph2 = new Graph(V2, E2); 
  
        // add edge 0-1 
        graph2.edge[0].src = 0; 
        graph2.edge[0].dest = 1; 
        graph2.edge[0].weight = 10; 
  
        // add edge 0-2 
        graph2.edge[1].src = 0; 
        graph2.edge[1].dest = 2; 
        graph2.edge[1].weight = 12; 
  
        // add edge 1-2 
        graph2.edge[2].src = 1; 
        graph2.edge[2].dest = 2; 
        graph2.edge[2].weight = 9; 
  
        // add edge 1-3 
        graph2.edge[3].src = 1; 
        graph2.edge[3].dest = 3; 
        graph2.edge[3].weight = 8; 
  
        // add edge 3-4
        graph2.edge[4].src = 3; 
        graph2.edge[4].dest = 4; 
        graph2.edge[4].weight = 7; 
        
        // add edge 2-4
        graph2.edge[5].src = 2; 
        graph2.edge[5].dest = 4; 
        graph2.edge[5].weight = 3; 
        
        // add edge 4-5
        graph2.edge[6].src = 4; 
        graph2.edge[6].dest = 5; 
        graph2.edge[6].weight = 3; 
        
        // add edge 2-5
        graph2.edge[7].src = 2; 
        graph2.edge[7].dest = 5; 
        graph2.edge[7].weight = 1; 
        
        // add edge 3-5
        graph2.edge[8].src = 3; 
        graph2.edge[8].dest = 5; 
        graph2.edge[8].weight = 21;
        
        // add edge 3-6
        graph2.edge[9].src = 3; 
        graph2.edge[9].dest = 6; 
        graph2.edge[9].weight = 8;
        
        // add edge 3-7
        graph2.edge[10].src = 3; 
        graph2.edge[10].dest = 7; 
        graph2.edge[10].weight = 5;
        
        // add edge 5-7
        graph2.edge[11].src = 5; 
        graph2.edge[11].dest = 7; 
        graph2.edge[11].weight = 6;
        
        // add edge 6-7
        graph2.edge[12].src = 6; 
        graph2.edge[12].dest = 7; 
        graph2.edge[12].weight = 9;
        
        // add edge 6-8
        graph2.edge[13].src = 6; 
        graph2.edge[13].dest = 8; 
        graph2.edge[13].weight = 2;
        
        // add edge 7-8
        graph2.edge[14].src = 7; 
        graph2.edge[14].dest = 8; 
        graph2.edge[14].weight = 11;
  
        System.out.println("\nCalling the algorithm with e= 4-5\n");
        graph2.SpecialKruskalMST(6);
        System.out.println("\nCalling the algorithm with e= 3-5\n");
        graph2.SpecialKruskalMST(8);
        System.out.println("\nCalling the algorithm with e= 2-4\n");
        graph2.SpecialKruskalMST(5);
        System.out.println("\nCalling the algorithm with e= 3-4\n");
        graph2.SpecialKruskalMST(4);
        
        
        //third example
        System.out.println("\n\nTest with the third graph:\n");
        int V3 = 7;
        int E3 = 9; 
        Graph graph3 = new Graph(V3, E3); 
  
        // add edge 0-1 
        graph3.edge[0].src = 0; 
        graph3.edge[0].dest = 1; 
        graph3.edge[0].weight = 5; 
  
        // add edge 0-2 
        graph3.edge[1].src = 0; 
        graph3.edge[1].dest = 2; 
        graph3.edge[1].weight = 1; 
  
        // add edge 0-3 
        graph3.edge[2].src = 0; 
        graph3.edge[2].dest = 3; 
        graph3.edge[2].weight = 3; 
  
        // add edge 2-3 
        graph3.edge[3].src = 2; 
        graph3.edge[3].dest = 3; 
        graph3.edge[3].weight = 3; 
  
        // add edge 1-5
        graph3.edge[4].src = 1; 
        graph3.edge[4].dest = 5; 
        graph3.edge[4].weight = 6; 
        
        // add edge 3-5
        graph3.edge[5].src = 3; 
        graph3.edge[5].dest = 5; 
        graph3.edge[5].weight = 3; 
        
        // add edge 4-5
        graph3.edge[6].src = 4; 
        graph3.edge[6].dest = 5; 
        graph3.edge[6].weight = 7; 
        
        // add edge 2-4
        graph3.edge[7].src = 2; 
        graph3.edge[7].dest = 4; 
        graph3.edge[7].weight = 2; 
        
        // add edge 4-6
        graph3.edge[8].src = 4; 
        graph3.edge[8].dest = 6; 
        graph3.edge[8].weight = 9;
  
        System.out.println("\nCalling the algorithm with e= 1-5\n");
        graph3.SpecialKruskalMST(4);
        System.out.println("\nCalling the algorithm with e= 0-3\n");
        graph3.SpecialKruskalMST(2);
        System.out.println("\nCalling the algorithm with e= 2-3\n");
        graph3.SpecialKruskalMST(3);
        System.out.println("\nCalling the algorithm with e= 4-5\n");
        graph3.SpecialKruskalMST(6);
        System.out.println("\nCalling the algorithm with e= 3-5\n");
        graph3.SpecialKruskalMST(5);
    }
    
}
