
import java.util.ArrayList;

public class ex5point1 {

    
    public static void main(String[] args) {
		BreadthFirstSearch.Node nodeA =new BreadthFirstSearch.Node("A");
		BreadthFirstSearch.Node nodeB =new BreadthFirstSearch.Node("B");
		BreadthFirstSearch.Node nodeC =new BreadthFirstSearch.Node("C");
		BreadthFirstSearch.Node nodeD =new BreadthFirstSearch.Node("D");
		BreadthFirstSearch.Node nodeE =new BreadthFirstSearch.Node("E");

 
		nodeA.addOutgoingEdges(nodeB, 1);
		nodeB.addOutgoingEdges(nodeA, 1);
        
		nodeA.addOutgoingEdges(nodeC, 3);
		nodeC.addOutgoingEdges(nodeA, 3);
        
		nodeA.addOutgoingEdges(nodeD, 2);
		nodeD.addOutgoingEdges(nodeA, 2);
        
		nodeB.addOutgoingEdges(nodeD, 1);
		nodeD.addOutgoingEdges(nodeB, 1);
        
		nodeC.addOutgoingEdges(nodeD, 1);
		nodeD.addOutgoingEdges(nodeC, 1);
        
        nodeD.addOutgoingEdges(nodeE, 5);
		nodeE.addOutgoingEdges(nodeD, 5);
        
        ArrayList<BreadthFirstSearch.Node> graph1Nodes = new ArrayList<BreadthFirstSearch.Node>();
        
        graph1Nodes.add(nodeA);
        graph1Nodes.add(nodeB);
        graph1Nodes.add(nodeC);
        graph1Nodes.add(nodeD);
        graph1Nodes.add(nodeE);
		BreadthFirstSearch testGraph1 = new BreadthFirstSearch(graph1Nodes);

        //graph 1 test1
        boolean res1 = testGraph1.BFSIsThereMSTWithE(nodeA, nodeB, 1);
		System.out.println("Is there in the first graph a MST containing the edge A-B ? (Expected: true, Found: "+res1+")");
        //System.out.println(""+res1+"\n\n");
        
        //Graph 1 test2
        boolean res2 = testGraph1.BFSIsThereMSTWithE(nodeA, nodeC, 3);
        System.out.println("Is there in the first graph a MST containing the edge A-C ? (Expected: false, Found: "+res2+")");
        //System.out.println(""+res2+"\n\n");
        
        //Graph 1 test3
		boolean res3 = testGraph1.BFSIsThereMSTWithE(nodeA, nodeD, 2);
        System.out.println("Is there in the first graph a MST containing the edge A-D ? (Expected: false, Found: "+res3+")");
        //System.out.println(""+res3+"\n\n");
        
        		
		BreadthFirstSearch.Node nodeA1 =new BreadthFirstSearch.Node("A1");
		BreadthFirstSearch.Node nodeB1 =new BreadthFirstSearch.Node("B1");
		BreadthFirstSearch.Node nodeC1 =new BreadthFirstSearch.Node("C1");
		BreadthFirstSearch.Node nodeD1 =new BreadthFirstSearch.Node("D1");
		BreadthFirstSearch.Node nodeE1 =new BreadthFirstSearch.Node("E1");
		BreadthFirstSearch.Node nodeF1 =new BreadthFirstSearch.Node("F1");
		BreadthFirstSearch.Node nodeG1 =new BreadthFirstSearch.Node("G1");
		BreadthFirstSearch.Node nodeH1 =new BreadthFirstSearch.Node("H1");
        
        nodeA1.addOutgoingEdges(nodeB1, 1);
        nodeB1.addOutgoingEdges(nodeA1, 1);
        
        nodeA1.addOutgoingEdges(nodeC1, 1);
        nodeC1.addOutgoingEdges(nodeA1, 1);
        
        nodeC1.addOutgoingEdges(nodeE1, 2);
        nodeE1.addOutgoingEdges(nodeC1, 2);
        
        nodeE1.addOutgoingEdges(nodeF1, 1);
        nodeF1.addOutgoingEdges(nodeE1, 1);
        
        nodeC1.addOutgoingEdges(nodeF1, 2);
        nodeF1.addOutgoingEdges(nodeC1, 2);
        
        nodeC1.addOutgoingEdges(nodeD1, 3);
        nodeD1.addOutgoingEdges(nodeC1, 3);
        
        nodeF1.addOutgoingEdges(nodeG1, 1);
        nodeG1.addOutgoingEdges(nodeF1, 1);
        
        nodeG1.addOutgoingEdges(nodeH1, 1);
        nodeH1.addOutgoingEdges(nodeG1, 1);
        
        nodeG1.addOutgoingEdges(nodeD1, 2);
        nodeD1.addOutgoingEdges(nodeG1, 2);
 
        nodeD1.addOutgoingEdges(nodeH1, 1);
        nodeH1.addOutgoingEdges(nodeD1, 1);
        
        ArrayList<BreadthFirstSearch.Node> graph2Nodes = new ArrayList<BreadthFirstSearch.Node>();
        graph2Nodes.add(nodeA1);
        graph2Nodes.add(nodeB1);
        graph2Nodes.add(nodeC1);
        graph2Nodes.add(nodeD1);
        graph2Nodes.add(nodeE1);
        graph2Nodes.add(nodeF1);
        graph2Nodes.add(nodeG1);
        graph2Nodes.add(nodeH1);

		BreadthFirstSearch testGraph2 = new BreadthFirstSearch(graph2Nodes);

		//graph 2, test 1
		boolean res4 = testGraph2.BFSIsThereMSTWithE(nodeA1, nodeF1, 2);
        System.out.println("Is there in the second graph a MST containing the edge A-F ? (Expected: true, Found: "+res4+")");
        //System.out.println(""+res4+"\n\n");
        
		//graph 2, test 2
		boolean res5 = testGraph2.BFSIsThereMSTWithE(nodeA1, nodeE1, 2);
        System.out.println("Is there in the second graph a MST containing the edge A-E ? (Expected: true, Found: "+res5+")");
        //System.out.println(""+res5+"\n\n");
        
		//graph 2, test 3
		boolean res6 = testGraph2.BFSIsThereMSTWithE(nodeA1, nodeD1, 3);
        System.out.println("Is there in the second graph a MST containing the edge A-F ? (Expected: false, Found: "+res6+")");
        //System.out.println(""+res6+"\n\n");
        
    }  
}
