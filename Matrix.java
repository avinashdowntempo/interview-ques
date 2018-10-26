public class Matrix {
   
  public static void main(String[] args) {
      int a[][]={
          {1,2,3,4,5,6,7,8,9,10},
          {11,12,13,14,15,16,17,18,19,20},
          {21,22,23,24,25,26,27,28,29,30},
          {31,32,33,34,35,36,37,38,39,40},
          {41,42,43,44,45,46,47,48,49,50},
          {51,52,53,54,55,56,57,58,59,60},
          {61,62,63,64,65,66,67,68,69,70},
          {71,72,73,74,75,76,77,78,79,80},
          {81,82,83,84,85,86,87,88,89,90},
          {91,92,93,94,95,96,97,98,99,100},
      };
      int ans[]= new int[a.length*a[0].length];
      int counter=0;
      right(counter,a,ans);
  }
  static void right(int count,int[][] array,int[] ans) {
      int[][] a = new int[array.length-1][array[0].length];
       for(int i=0;i<a[0].length;i++){
           ans[count]=array[0][i];
           count++;
       }
       for(int i=1;i<array.length;i++){
           a[i-1]=array[i];
       }
       if(count==ans.length-1){
           ans[count]=a[0][0];
            print(ans);
       }
       else{
            down(count,a,ans);
       }
  }
    static void down(int count,int[][] array,int[] ans) {
      int[][] a = new int[array.length][array[0].length-1];
      for(int i=0;i<array.length;i++){
          ans[count]=array[i][array.length];
          count++;
      }
      for(int i=0;i<a.length;i++){
          for(int j=0;j<a[0].length;j++){
              a[i][j]=array[i][j];
          }
      }
       if(count==ans.length-1){
           ans[count]=a[0][0];
           print(ans);
       }
       else{
        left(count,a,ans); 
       }
   }
     static void left(int count,int[][] array,int[] ans) {
      int[][] a = new int[array.length-1][array[0].length];
      for(int i=array[0].length;i>0;i--){
           ans[count]=array[array.length-1][i-1];
           count++;
       }
         for(int i=0;i<array.length-1;i++){
           a[i]=array[i];
       }
         if(count==ans.length-1){
           ans[count]=a[0][0];
            print(ans);
       }
       else{
             up(count,a,ans);
       }
   }
      static void up(int count,int[][] array,int[] ans) {
      int[][] a = new int[array.length][array[0].length-1];
        for(int i=array.length-1;i>=0;i--){
          ans[count]=array[i][0];
          count++;
      }
        for(int i=0;i<a[0].length;i++){
          for(int j=0;j<a[0].length;j++){
              a[i][j]=array[i][j+1];
          }
      }
         if(count==ans.length-1){
           ans[count]=a[0][0];
            print(ans);
       }
       else{
            right(count,a,ans);
       }
    }
    static void print(int[] ans) {
        for(int i=0;i<ans.length;i++){
          System.out.print(ans[i]+",");
       }
    }
}
