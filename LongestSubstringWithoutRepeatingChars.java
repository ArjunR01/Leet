class LongestSubstringWithoutRepeatingChars{
    public static void main(String[] args){
        String s="auspotauspotzk";
        String temp="";
        int ans=-1;
       String result[]=new String[5];
       int count=0,sample=0;
       if(s.length()==1){
           ans=1;
       }
       else if(!s.isBlank()){
        for(int i=0;i<s.length();i++){
            if(temp.length()==0){
                temp=temp.concat(Character.toString(s.charAt(i)));
            }
            else{
            sample=0;
            for(int j=0;j<temp.length();j++){
                if(s.charAt(i)!=temp.charAt(j))
                    sample++;
            }
            if(sample==temp.length()){
                temp=temp.concat(Character.toString(s.charAt(i)));
            }
            else if(sample!=temp.length()||{
                i-=1;
                System.out.println(temp+" is added");
                result[count++]=temp;
                temp="";
            }
        }
        }
        if(result[0]==null&&sample>0){
            result[0]=temp;
            ans=result[0].length();
        }
        else{
        sample=result[0].length();
        count=0;
       for(int i=1;i<result.length;i++){
        if(result[i]==null){
            break;
        }
        else if(sample<result[i].length()){
            count=i;
        }
       }
       ans=result[count].length();
       }
    }
       else if(s.length()==0){
           ans=0;
       }
       else if(s.isBlank()){
           ans=1;
       }
       System.out.println(ans);
    }
}