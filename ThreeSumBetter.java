import java.util.*;

public class ThreeSumBetter {
    public static List<List<Integer>> productThreeSum(int arr[], int n){
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> hashSet = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(arr[i]+arr[j]);
               if(hashSet.contains(third)){
                   List<Integer> temp = Arrays.asList(arr[i],arr[j],third);
                   temp.sort(null);
                   st.add(temp);
               }
               hashSet.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int n = arr.length;
        System.out.println(productThreeSum(arr,n));
    }
}
