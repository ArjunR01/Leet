import java.util.Scanner;

public class LexStr {
    public static void main(String[] args){
        String s="ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        Scanner s1=new Scanner(System.in);
        int c=s1.nextInt();
        char min=s.charAt(0);
        char max=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(min>s.charAt(i)){
                min=s.charAt(i);
            }
            if(max<s.charAt(i)){
                max=s.charAt(i);
            }
        }
        int ma=s.indexOf(max);
        int mi=s.indexOf(min);
        System.out.println(s.substring(ma,ma+c));
        System.out.println(s.substring(mi,mi+c));

    }
}


// import java.util.Scanner;
// public class LexStr {
// public static String getSmallestAndLargest(String s, int k) {
//         String smallest = "";
//         String largest = "";
//         smallest = s.substring(0,k);
//         largest = s.substring(0,k);
// //         "Compare to" method doesn't turn just the equel case it also turns a value.
//         for(int i=0; i<=s.length()-k; i++ ){
//             String str = s.substring(i,k+i);
//             if (smallest.compareTo(str)>0){
//                 smallest = str;
//             }
//             if(largest.compareTo(str)<0){
//                 largest=str;
//             }
//         }  
//         return smallest + "\n" + largest;
//     }
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String s = scan.next();
//         int k = scan.nextInt();
//         scan.close();
      
//         System.out.println(getSmallestAndLargest(s, k));
//     }
// }