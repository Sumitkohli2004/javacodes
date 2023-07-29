// package basicarray;

 class rowcol{
    private int row;
    public int col;
    rowcol(int r , int c){
        this.row=r;
        this.col=c;
    }
    public int getRow(){
        return this.row;
    }
    public int getCol(){
        return this.col;
    }
}


public class zeromatrix {
    public static void printmat(int [][] m){
        for(int i=0;i<m.length;i++){
           for(int j=0;j<m[0].length;j++){
            System.out.print(m[i][j]+" ");
        }
        System.out.println();
    }
   }
    public static void main(String[] args) {
       
       int [][] a = new int[][]{{0,2,3,4},{0,6,7,8},{7,1,4,6},{6,6,7,8}};
       int count=0;
       for(int i=0;i<a.length;i++){
       for(int j=0;j<a[0].length;j++){
            if(a[i][j]==0) 
            count++;
        }
      }
      System.out.println("original matrix is - ");
      printmat(a);

       rowcol[] arr = new rowcol[count];

       int index=0;
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++)
        if(a[i][j]==0){
        arr[index]=new rowcol(i,j);
            index++;
        }
       
      }
      System.out.println("after operation - ");
       for (int i = 0; i < arr.length; i++) {
        for(int j=0;j<a[0].length;j++){
            a[arr[i].getRow()][j] = 0;
        }
        for (int k = 0; k < a.length; k++){
            a[k][arr[i].col] = 0;
        }
    }   
        
        printmat(a);
  }
}


