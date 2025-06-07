import com.sun.source.doctree.SeeTree;

import java.util.*;

public class FourSumBetter {
    public static List<List<Integer>> produceFourSum(int arr[], int target){
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 Set<Long> hashset = new HashSet<>();
                 for(int k=j+1;k<n;k++){
                     long sum = arr[i]+arr[j];
                     sum += arr[k];
                     long fourth = target - sum;
                     if(hashset.contains(fourth)){
                         List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (int) fourth);
                         temp.sort(null);
                         set.add(temp);
                     }
                     hashset.add((long) arr[k]);

                 }
             }
         }
         List<List<Integer>> ans = new ArrayList<>(set);
         return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        System.out.println(produceFourSum(arr,0));
    }
}
