import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
public class CopyCatEx {
    public static void main(String[] agrs){
        Scanner s=new Scanner(System.in);
        TreeSet<Character> t=new TreeSet<>();
        ArrayList<Character>  l=new ArrayList<>();
        String s1=s.next();
        for (int i=0;i<s1.length();i++){
            t.add(s1.charAt(i));
        }
        int r=10;
        int si=t.size();
        for(int i=0;i<si;i++){
            int count=0;
            for(int j=0;j<s1.length();j++){
                if(t.first()==s1.charAt(j)){
                    count++;
                }
            }
            l.add(t.first());
            l.add(Character.forDigit(count,r));
            t.removeFirst();
        }
        int min=(int)l.get(1);
        for(int i=1;i<l.size();i+=2){
            if(min<(int)l.get(i)){
                min=(int)l.get(i);
            }
        }
        int ad=0;
        for(int i=1;i<l.size();i+=2){
            if(min>(int)l.get(i)){
                ad+=(int)l.get(i)-48;
            }
        }
        if(ad==0){
            System.out.println(si);
        }
        else{
        System.out.println((ad*2));
        }
        s.close();
    }
}
