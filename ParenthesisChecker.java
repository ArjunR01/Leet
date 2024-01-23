public class ParenthesisChecker {
    public static void main(String[] args){
        String s="([";
        char n[]=new char[s.length()];
        int i=0,count=0;
        if(s.length()==1){
            System.out.println("false");
        }
        else{
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='('||s.charAt(j)=='{'||s.charAt(j)=='['){
                n[i]=s.charAt(j);
                count++;
                i++;
            }
            else if(count>0){
                if(s.charAt(j)==')'&&n[i-1]=='('){
                    count--;
                }
                else if(s.charAt(j)=='}' && n[i-1]=='{'){
                    count--;
                }
                else if(s.charAt(j)==']' && n[i-1]=='['){
                    count--;
                }
                else{
                    count=1;
                    break;
                }
                i--;
                }
                else{
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.println(true);
            }
            else
            System.out.println(false);}
        }
        // int count1=0,count2=0,count3=0;
        // for(char i: s.toCharArray()){
        // if(i=='(')
        // count1++;
        // else if(i=='{')
        // count2++;
        // else if(i=='[')
        // count3++;
        // else if(i==')')
        // count1--;
        // else if(i=='}')
        // count2--;
        // else
        // count3--;}
        // if(count1==0 && count2==0 &&count3==0){
        // System.out.println(true);;}
        // else{
        // System.out.println(false);;}
       
}
    
