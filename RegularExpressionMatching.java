import java.util.regex.*;
public class RegularExpressionMatching {
    public static void main(String[] args){
        String s1="abc";
        String s2="a***bc";
        int count=0;
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='*'){
                count++;
                if(count>2){
                    System.out.println(false);
                    break;
                }
            }
        }
        if(count<2){
        boolean b=Pattern.compile(s2).matcher(s1).matches();
        System.out.println(b);}
        if(s2.contains("***")){
            System.out.println("Answer is false");
        }
    }
}
