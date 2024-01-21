public class Climbing_Stairs {
    public static void main(String[] args){
        System.out.println(climb(4));
    }
    static int climb(int n){
        int result,r=2;
        result=(fact(n))/(fact(n-r)*fact(r));
        return result;
    }
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
