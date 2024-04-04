class LongestPalSubString{
    public static void main(String[] args) {
        String s="\"jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel\"";
        int terminate=0,initial=0;
        int index=0;
        int ind[]=new int[1000000];
        for(int i=0;i<=s.length()/2;i++){
            for(int j=s.length()-1;j>i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    ind[index]=i;
                    index++;
                    ind[index]=j;
                    index++;
                }
            }
        }
        int temp=0;
        int min=0,count=0;
        int start=0,end=0;
        for(int i=0;i<ind.length;i+=2){
            temp=ind[i];
            count=0;
            System.out.println("start values is "+temp+" end values is "+ind[i+1]);
            for(int j=ind[i+1];j>=temp;j--){
                if(s.charAt(temp)==s.charAt(j)){
                    System.out.println(s.charAt(temp)+" and "+s.charAt(j)+" are equal");
                    count++;
                    temp++;
                }
                else{
                    count=0;
                    break;
                }
            }
            System.out.println("\n\n");
            if(min<count){
                // System.out.println(" i is "+i+" and "+temp+" and "+ind[temp+1]+" values is min");
                min=count;
                start=ind[i];
                end=ind[i+1];
                }

            }
        for(int i=start;i<=end;i++){
            System.out.print(s.charAt(i));
        }
        // System.out.println();
        // for(int x:ind){
        //     System.out.print(x+" ");
        // }
    }
}