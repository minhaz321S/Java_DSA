package Array;

public class Prifix_Sum {
    public static void prifixsum(int num[]){
    int currentsum = 0;
    int Max_Sum = Integer.MIN_VALUE;
    int prifix[] = new int[num.length];
    prifix[0] = num[0];
       for(int i=1;i<num.length;i++){
        prifix[i] = prifix[i-1]+num[i];
       }
       for(int i=0;i<num.length;i++){
           int start = i;
           for(int j=i;j<num.length;j++){
              int end = j;
              currentsum = start==0?prifix[end]:prifix[end] - prifix[start - 1];
              if(Max_Sum < currentsum){
                  Max_Sum = currentsum;
              }
           }
       }
        System.out.println("Max Sum ="+Max_Sum);    
}
    
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        prifixsum(num);
    }
    
 
}
