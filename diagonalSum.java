public class diagonalSum {

public static int DiagonalSum(int matrix[][]){
    int sum =0;
    // for(int i=0; i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length; j++){
    //         if(i==j){
    //             sum = matrix[i][j];
    //         }
    //     else if
    //         (i+j==matrix.length-1){
    //             sum=sum+matrix[i][j];
    //         }
    //     }
        
    
    // }

    //optimaze method
    for(int i=0; i<matrix.length; i++){
        sum = sum + matrix[i][i];
        if( i!= matrix.length-1-i){
            sum = sum + matrix[i][matrix.length-i-1];
        }

    }
  return sum;
} 

public static void main(String args[]){
    int matrix[][]= { {1,2,3,7},
                      {4,5,6,5},
                      {7,8,9,1},
                      {2,3,6,4}};
    System.out.println(DiagonalSum(matrix));
}
    
}
