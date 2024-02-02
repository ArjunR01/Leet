public class ReverseInteger {
    public static void main(String[] args){
        int n=1534123478,temp=n,r=0,ans=0;
        if(n>(int)Math.pow(2, 31)-1||n<-(int)Math.pow(2, 31))
        System.out.println(0);
        else{
        while(n!=0){
            r=n%10;
            ans=(ans*10)+r;
            n/=10;
        }
        if(temp<0){
            ans*=-1;}
            System.out.println(ans);}
    }
}
