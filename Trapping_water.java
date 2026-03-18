
package Array;

public class Trapping_water {
    public static int trapwater(int height[]){
        int n = height.length;
        int lmb[] = new int[n];
        int rmb[] = new int[n];
         lmb[0] = height[0];
         for(int i=1;i<n;i++){
              lmb[i] = Math.max(height[i], lmb[i-1]);
         }
        rmb[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
          rmb[i] = Math.max(height[i], rmb[i+1]);
           }
       int trappedwater = 0;
       for(int i=0;i<n;i++){
          trappedwater = trappedwater + (Math.min(lmb[i], rmb[i]) - height[i]);
       }
      return trappedwater;  
}      
 
    public static void main(String[] args) {
       int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped total water :"+trapwater(height));
      
       
    }
}
