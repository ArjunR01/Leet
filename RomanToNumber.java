import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class RomanToNumber {
    public static void main(String args[]){
        Dictionary<Character,Integer>dict=new Hashtable<>();
        Scanner o=new Scanner(System.in);
        int sum=0,count=0,count2=0,count1=0;
        String s=o.nextLine();
        dict.put('I',1);
        dict.put('V',5);
        dict.put('X',10);
        dict.put('L',50);
        dict.put('C',100);
        dict.put('D',500);
        dict.put('M',1000);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                count++;
            }
            if((s.charAt(i)=='V' || s.charAt(i)=='X')&&count==1){
                sum-=2;
            }
            if(s.charAt(i)=='X')
            count1++;
            if((s.charAt(i)=='L'||s.charAt(i)=='C')&&count1==1)
            sum-=20;
            if(s.charAt(i)=='C')
            count2++;
            if((s.charAt(i)=='D'||s.charAt(i)=='M')&&count2==1)
            sum-=200;


            sum+=dict.get(s.charAt(i));
        }
        System.out.println(sum);
        
    }
    
}
