 import java.util.*;
 
 public class Algorithm 
{
  public static boolean[] visited;
  public static int[] colors;
  public static ArrayList<Integer> ady = new ArrayList<Integer>();
  public static DigraphAM graph;
  public static LinkedList<Integer> tails= new LinkedList<Integer>();

    public static boolean DFSColorFC(DigraphAM tree) 
    {
        graph = tree;
        visited = new boolean[graph.size()];
        colors = new int[graph.size()];
        for(int i=0; i<graph.size();i++) colors[i]=-1;
        
        return DFSColorFCAux(graph.getFirst());
    }

    private static boolean DFSColorFCAux(int n) 
    {
     visited[n]=true;
     colors[n]=1;
     tails.add(n);
     ady = graph.getSuccessors(n);

        while(tails.size() != 0)
        {
          int u = tails.poll();

            for(int i=0; i<ady.size()-1;i++)
            {
              
              int next = ady.get(i);
              
                  if (colors[n]==colors[next] && visited[next])
                  {
                    return false;
                  }
                  else if(!visited[next])
                  {
                    DFSColorFCAux(next);
                  }
            }
        }
       return true;
    }
}