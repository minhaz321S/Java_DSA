package function_method;


   
public class Prime_in_Range{
     public static boolean prime(int n){
        if(n == 2){
            return true;
        }
//        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(n);i++){   //This is more optimised. 
// for(int i=2;i<=n-1;i++)
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.println(i+" ");
            }
            
        } System.out.println();
    }
    public static void main(String[] args) {
        PrimeInRange(50);
    }
}
