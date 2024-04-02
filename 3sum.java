import java.util.*;
class ThreeSum{
    public static void main(String[] args){
        List<List<Integer>> sample=new ArrayList<>();
        List<List<Integer>> sample1=new ArrayList<>();
        int count=0,t=1,c=0,i=0,j=0;
        int a[]=new int[]{-1,0,1,2,-1,-4};
        for(i=0;i<a.length;i++)
            for(j=i+1;j<a.length;j++)
                for(int k=j+1;k<a.length;k++)
                    if(a[i]+a[j]+a[k]==0){
                    sample.add(new ArrayList<Integer>(Arrays.asList(a[i],a[j],a[k])));
                    count++;}   
        for(i=0;i<count;i++){
            for(j=0;j<3;j++){
                c=0;
                for(int k=0;k<3;k++){
                    if(sample.get(i).get(j)==sample.get(t).get(k)){
                        c++;
                    }
                }
            }
            // t++;
            if(c>3){
                i+=1;
            }
            else{
                t++;
                sample1.add(sample.get(i));
            }
        }
        System.out.println(sample1);
        System.out.println(sample);
        
    }
}