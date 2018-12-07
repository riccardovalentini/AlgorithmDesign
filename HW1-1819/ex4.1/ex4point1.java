import java.util.*;


public class ex4point1
{
	
	public static void main(String[]args)
	{
		Task[] tsk1 = new Task[]{new Task(2,4),new Task(3,1),new Task(3,5),
							     new Task(5,2),new Task(7,5),new Task(7,3),
							     new Task(7,2),new Task(10,2),new Task(10,1),
							     new Task(30,2),new Task(30,3),new Task(31,5),
							     new Task(32,1),new Task(32,1),new Task(32,3),
							     new Task(33,5),new Task(34,5)};
		Consulting p1 = new Consulting(tsk1,7,3,2);
		int min1=p1.computeOptimalSolution();
		String opt1=p1.computeOptimalStrategy();
		System.out.println("Problem 1, optimal price is "+min1);
		
		
		
		Task[] tsk2 = new Task[]{new Task(3,4),new Task(4,9),new Task(5,2),new Task(6,5),
					  new Task(7,1),new Task(8,1),new Task(9,1),new Task(14,4),new Task(15,4)};
		Consulting p2 = new Consulting(tsk2,5,4,2);
		int min2=p2.computeOptimalSolution();
		String opt2=p2.computeOptimalStrategy();
		System.out.println("Problem 2, optimal price is "+min2);
	}
	
}
