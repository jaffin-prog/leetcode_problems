class Solution {
    public int findNumbers(int[] a) {
       int b=0;
      for(int i=0;i<a.length;i++){
        int c=0;
        while(a[i]!=0){
            a[i]=a[i]/10;
            c++;}
        if(c%2==0){
            b++;
        
        }
      } return b;
    }
}