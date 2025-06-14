public class Admatrix{
    public int Admatrix [][];
    public int vertices;


   public Admatrix(int vertices){
       this.vertices = vertices;
       Admatrix = new int[vertices][vertices];
   }

   

   //*unweighted graph construction
   public void adEdge(int src , int dest ,  boolean directed){
       Admatrix[src][dest] = 1;
       if(!directed) Admatrix[dest][src] = 1;
   }


   //*weighted graph construction
   public void adEdge(int src , int dest , int weight , boolean directed){
       Admatrix[src][dest] = weight;
       if(!directed) Admatrix[dest][src] = weight;
   }



    public static void main(String[] args) {
        
    }

}