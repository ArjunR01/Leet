public class Pow {
    public static void main(String[] args){
        Pow o=new Pow();
       System.out.println(String.format("%4f", o.Powe(1,2147483647)));

    }

    double Powe(double x,int n){
        double ans=1;
        if(n<0){
            for(int i=n;i<0;i++){
                ans*=x;
            }
            return (double)1/ans;
        }
        else{
            for(int i=0;i<n;i++){
                ans*=x;
            }
            return ans;
        }
    }
}

