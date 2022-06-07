public class Combinatorics{
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        int x = 1;
        for(int i =2; i <= n; i++){
            x = x * i
        }
        return x;
        }
    }
    public static void numCombinations(int n, int r){
        if(r > n){
            return 0;
        }
        else{
            return factorial(n)/factorial(r) * factorial(n-r);
        }
    }
}