class ZigZagConversion{
    public static void main(String[] args){
        String s="A";
        String ans="";
        int num=4,in;
            for(int i=0;i<num;i++){
                in=2*(num-1);
                for(int j=i;j<s.length();j+=in){
                    ans+=s.charAt(j);
                    if(i>0 && i<num-1&&(j+in-(2*i)<s.length())){
                        ans+=s.charAt(j+in-(2*i));
                    }
                }
            }
            System.out.println(ans);
    }
}

// PAYPALISHIRING


// P     I    N
// A   L S  I G
// Y A   H R
// P     I



// P   A   H   N
// A P L S I I G
// Y   I   R