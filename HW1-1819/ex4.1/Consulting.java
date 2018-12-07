import java.util.*;


public class Consulting
{
	private static int endService=1;
	private static int HIRE=0;
	private static int FIRE=1;
	private static int HIRED_USAGE=2;
	private static int FREELANCE_USAGE=3;
	int n;
	private int[] T;
	private int[] c;
	private int S;
	private int s;
	private int C;
	private int[][] solution;
	private String strategy;
	
	public Consulting(Task[] tasks, int hiringCost, int servance, int salary)
	{
		n=0;
		for(Task t: tasks) if(t.getTime()>n) n=t.getTime();
		T=new int[n];
		c=new int[n];
		for(Task t: tasks)
		{
			int i=t.getTime();
			T[i-1]++;
			c[i-1]+=t.getCost();
		}
		strategy ="";
		solution = new int[4][n];
		S=servance;
		s=salary;
		C=hiringCost;
	}
	
	int min(int x, int y)
	{
		return x < y ? x : y;
	}
	
	
	public int costOfHiring(int i)
	{
		return C+s+min(solution[FIRE][i+1],solution[HIRED_USAGE][i+1]);
	}
	
	public int costOfFiring(int i)
	{
		return S+c[i]+min(solution[HIRE][i+1],solution[FREELANCE_USAGE][i+1]);
	}
	
	public int costOfHired(int i)
	{
		return s+min(solution[HIRED_USAGE][i+1],solution[FIRE][i+1]);
	}
	
	public int costOfFreelance(int i)
	{
		return c[i]+min(solution[FREELANCE_USAGE][i+1],solution[HIRE][i+1]);
	}
	
	
	/*Initialize solution, with begin and end special values: */
	public void initialization()
	{
		// All 0 in the matrix 
		for(int i=0; i<n; i++)
		{
			solution[HIRE][i]=0;
			solution[FIRE][i]=0;
			solution[HIRED_USAGE][i]=0;
			solution[FREELANCE_USAGE][i]=0;
		}
		// Special case of the first tuple: value -1 means "NOT OPTIMAL BY DEFAULT"
		solution[FIRE][0]=-1; // No hired personnel 
		solution[HIRED_USAGE][0]=-1; // No hired personnel => not possible to use hired personnel
		
		// Special case of the last tuple: value -1 means "NOT OPTIMAL BY DEFAULT"
		// Hiring here means cost of hiring + salary for one day, trivial case
		solution[HIRE][n-1]=C+s+S*endService;
		// Firing here means cost of firing + freelance of time n-1 if some task
		solution[FIRE][n-1]=S+c[n-1];
		// Hired usage means ONLY the salary of the day + the cost of the service (if needed!)
		solution[HIRED_USAGE][n-1]=s+S*endService;
		// freelancelance usage is only paying the freelance for 1 day
		solution[FREELANCE_USAGE][n-1]=c[n-1]; 
		
	}
	/* Computes and returns the cost, filling the array "solution": */
	public int computeOptimalSolution()
	{
		initialization();
		for(int i=n-2; i>=0; i--)
		{
			solution[HIRE][i]=costOfHiring(i);
			if(solution[FIRE][i]>=0) solution[FIRE][i]=costOfFiring(i);
			if(solution[FIRE][i]>=0) solution[HIRED_USAGE][i]=costOfHired(i);
			solution[FREELANCE_USAGE][i]=costOfFreelance(i);
		}
		return min(solution[HIRE][0],solution[FREELANCE_USAGE][0]);
	}
	
	public String computeOptimalStrategy()
	{
		boolean hired=false;
		for(int i=0; i<n; i++)
		{
			if(hired)
			{
				if(solution[FIRE][i]<solution[HIRED_USAGE][i])
				{
					strategy+="["+(i+1)+",FIRE the worker "+(S+c[i])+"$ - "+T[i]+" tasks]\n";
					hired=false;
				}else{
					if(T[i]>0) strategy+="["+(i+1)+",USE the hired worker "+s+"$ - "+T[i]+" tasks]\n";
					else strategy+="["+(i+1)+",PAY the hired worker "+s+"$ - "+T[i]+" tasks]\n";
				}
			}else{
				if(solution[HIRE][i]<solution[FREELANCE_USAGE][i])
				{
					strategy+="["+(i+1)+",HIRE a worker "+(C+s)+"$ - "+T[i]+" tasks]\n";
					hired=true;
				}else{
					if(T[i]>0) strategy+="["+(i+1)+",USE freelance work "+c[i]+"$ - "+T[i]+" tasks]\n";
					else strategy+="["+(i+1)+" - "+T[i]+" tasks]\n";
				}
			}
		}
		return strategy;
	}
	
	
}
