import java.util.Arrays;

public class IndexOfFirstOccurenceString {
    public static void main(String[] args){
        String haystack="aabaaabaaac";
        String needle="aabaaac";
        int temp[]=new int[needle.length()];
        int a=0,count=0;
        for(int i=0;i<haystack.length();i++){
            if(a<needle.length()&&(needle.charAt(a)==haystack.charAt(i))){
                System.out.println("found "+haystack.charAt(i));
                temp[a]=i;
                count++;
                a++;
                System.out.println("First if and Count is "+count);
            }
            else if(a<needle.length()&&(count>0 && (needle.charAt(a)!=haystack.charAt(i)))){
                count=0;
                i=temp[0];
                a=0;
                // System.out.println("Value of i is "+i);
                System.out.println("Second else if and Count is "+count);
            }
            else if(count<0&&(needle.charAt(a)!=haystack.charAt(i))){
                System.out.println("Last else if and count is "+count);
                i=temp[0];
            }
            
        }
        if(count==needle.length()){
            System.out.println(temp[0]);
            System.out.println(needle);
        }
        System.out.println(count);
        // System.out.println(needle.length());

        // System.out.println(haystack.indexOf(needle.charAt(0)));

        
        
        }
    }
