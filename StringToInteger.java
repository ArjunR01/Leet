import java.util.regex.*;

class StringToInteger{
    public static void main(String[] args){
        String s="4193 with words";
        String re="";
        int t=0,res,temp=0;
        for(int i=0;i<s.length();i++){
            if(temp==0&&Pattern.matches("[a-zA-z]",Character.toString(s.charAt(i)))){
                re+='0';
                break;
            }
            else if(s.charAt(i)=='-'){
                t=1;
            }
            else if(s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||
            s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||
            s.charAt(i)=='8'||s.charAt(i)=='9'){
                    re+=s.charAt(i);
                }
            else if(s.charAt(i)=='0'&&temp>0){
                re+=s.charAt(i);
            }
            }
            if(t==1){
            res=Integer.parseInt(re);
            System.out.println(-res);}
            else{
                System.out.println(Integer.parseInt(re));
            }
        // class Solution {
        //     public int myAtoi(String s) {
        //        int start = 0, sign = 1;
        //         long res = 0;
        //         while(start < s.length() && s.charAt(start) == ' ') {
        //             start++;
        //         }
                
        //         if(start < s.length() && s.charAt(start) == '+') {
        //             start++;
        //         } else if(start < s.length() && s.charAt(start) == '-') {
        //             sign = -1;
        //             start++;
        //         }
                
        //         while(start < s.length()) {
        //             if(!Character.isDigit(s.charAt(start))) break;
        //             res *= 10;
        //             res += s.charAt(start) - '0';
        //             if(res > Integer.MAX_VALUE) {
        //                 if(sign == 1) return Integer.MAX_VALUE;
        //                 return Integer.MIN_VALUE;
        //             }
        //             start++;
        //         }
                
        //         return (int) res * sign;
        //     }
        // }
    }
}