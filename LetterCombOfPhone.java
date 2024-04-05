import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class LetterCombOfPhone {

    public List<String> letterCombinations(String digits) {
        List<String> l1=new ArrayList<>();
        List<String> ans=new ArrayList<>();
        String[] number=digits.split("");
        l1.add("abc");
        l1.add("def");
        l1.add("ghi");
        l1.add("jkl");
        l1.add("mno");
        l1.add("pqrs");
        l1.add("tuv");
        l1.add("wxyz");

        if(digits.length()>0){
            backTrack(number,l1,ans,0,"");
        }

        return ans;
    }

int backTrack(String[] number,List<String> l,List<String> ans,int i,String Current){
        if(number.length == Current.length()){
            ans.add(Current);
            return 0;
        }
        for(int j=0;j<l.get(Integer.parseInt(number[i])-1).length();j++){
            backTrack(number,l,ans,i+1,l.get(Integer.parseInt(number[i])-1)+Current); 
        }
        return 0;
    }

    

    public static void main(String[] args){
        LetterCombOfPhone o=new LetterCombOfPhone();
        System.out.println(o.letterCombinations("24"));
        
    }
}
