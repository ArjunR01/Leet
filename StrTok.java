import java.util.Scanner;
import java.util.StringTokenizer;
public class StrTok {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringTokenizer s1=new StringTokenizer(s);
        StringTokenizer s2=new StringTokenizer(s);
        String[] n=s.split("[^a-zA-Z]");
        int count=0;
        for(int i=0;i<n.length;i++){
            n[i].trim();
            count++;
        }
        System.out.println(count);
        for(int i=0;i<n.length;i++){
            if(n[i].isEmpty()){
                continue;
            }
            else
            System.out.println(n[i]);
        }
        
    }
}
