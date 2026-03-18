
package Array;

public class Pairs_in_Array {
    public static void printpairs(int num[]){
        int total_pairs = 0;
        for(int i=0;i<num.length;i++){
           int current = num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+current+","+num[j]+") ");
                total_pairs++;
        } System.out.println();
    } System.out.println("Total Pairs = "+total_pairs);  // total pairs  {n*(n-1)/2} ;
 }
   public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14,16,18,20};
        printpairs(num);
    }
    
    
}
