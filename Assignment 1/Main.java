
public class Main {
	static final int Max = Integer.MAX_VALUE;
	
	public static void main(String[] args){
		
		int[][] matrix = new int[][]
			{{0, 3, 3, 3, 0}, 
            {3, 0, 0, 0, 3},
            {3, 0, 0, 3, 3},
            {3, 0, 3, 0, 4},
            {0, 3, 3, 4, 0}
           }; // this has 5 vertices. The numbers are the weights from edge to edge in the following way:
           // [0][0] == 0 is the edge from vertex0 to vertex0 and is therefore 0. 0 is thus used as infinite-like.
           // [0][1] == 3 is the edge from vertex0 to vertex1 and is 3.
           // This is the same as [1][0] as it is the same edge.
			/*{
				{0, 2, 0, 6, 0, 6, 4, 0, 5, 0},
				{2, 0, 3, 8, 5, 7, 0, 2, 1, 9},
	            {0, 3, 0, 0, 7, 8, 4, 8, 6, 4},
	            {6, 8, 0, 0, 9, 4, 7, 1, 5, 0},
	            {0, 5, 7, 9, 0, 8, 1, 8, 7, 6},
	            {6, 7, 8, 4, 8, 0, 2, 2, 0, 1},
	            {4, 0, 4, 7, 1, 2, 0, 0, 2, 5},
	            {0, 2, 8 ,1, 8, 2, 0, 0, 3, 3},
	            {5, 1, 6, 5, 7, 0, 2, 3, 0, 5},
	            {0, 9, 4, 0 ,6, 1, 5, 3, 5, 0} //intermediate
	           };
	           */
           System.out.println("Graph considered:");
           for (int[] x: matrix){
        	   for (int y: x){
        		   System.out.print(y + " ");
        	   }
        	   System.out.println();
           }
	    int matrixDimensions = matrix.length;
		int[] visited = new int[matrixDimensions];
		int u = 0, v = 0;
		int total = 0;
		int edgeCounter = 0;
		
		//Initialize the array with visited edges and set all non-existent edges in the array (all 0's) to max int
		for(int i = 0; i < matrixDimensions; i++){
			visited[i] = 0;
			for(int j = 0; j < matrixDimensions; j++){
				if(matrix[i][j]==0){
					matrix[i][j] = Max;	
				}	
			}
		}
		
		//Declare our initial vertex
		visited[0] = 1;
		
		//For the outer for-loop the counter has to be one smaller than matrixDimensions, since there are V-1 edges in a MSP 
		for(int counter = 0; counter < matrixDimensions - 1 ; counter++){
			
			int min = Max;
			//The edges that are to be connected are found here
			for(int i = 0; i < matrixDimensions; i++){
				if(visited[i]==1){
					edgeCounter++;
					for(int j = 0; j < matrixDimensions; j++){
						if(visited[j]==0){
							if(min > matrix[i][j]){ // if true then an edge to connect is found
								min = matrix[i][j];
								u = i;
								v = j;	
							}	
						}	
					}		
				}
			}
			visited[v] = 1;
			total += min;

			System.out.println("Edge connected: "+u+" -> "+v+" : "+min);
			
			
		
		}
		System.out.println("The total weight of the spanning tree is "+ total);
		System.out.println(edgeCounter + " Edges were considered");
	}
	
	
}
