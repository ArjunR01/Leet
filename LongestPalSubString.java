class LongestPalSubString{
    public static void main(String[] args) {
        // String s="amamabas";
        int terminate=0,initial=0;
        int index=0;
        int ind[]=new int[s.length()*2];
        for(int i=0;i<=s.length()/2;i++){
            for(int j=s.length()-1;j>s.length()/2-1;j--){
                if(s.charAt(i)==s.charAt(j)){
                    ind[index]=i;
                    index++;
                    ind[index]=j;
                    index++;
                }
            }
        }
        int temp=0;
        int min=100,count=0;
        int start=0,end=0;
        for(int i=0;i<ind.length;i+=2){
            for(int j=ind[i+1];j>i;j--){{
                if(s.charAt(temp)==s.charAt(j)){
                    count++;
                    temp++;
                }
            }
            if(min>count){
                min=count;
                start=ind[i];
                end=ind[i+1];
            }

            }
        }
        for(int i=start;i<=end;i++){
            System.out.print(s.charAt(i));
        }
    }
}