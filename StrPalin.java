import java.util.Scanner;
import java.util.TreeSet;
public class StrPalin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.nextLine();
        int end=A.length()-1;
        int count=0;
        for(int i=0;i<A.length()/2;i++){
            if(A.charAt(i)==A.charAt(end)){
                System.out.println(A.charAt(i)+" matched");
                count++;
                end--;
                }
            }
        if(count==A.length()/2){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
