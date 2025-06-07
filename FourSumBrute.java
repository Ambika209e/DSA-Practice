import java.util.*;

public class FourSumBrute {
    public static List<List<Integer>> produceFourSum(int arr[], int target){
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum = (long)arr[i]+arr[j];
                        sum += arr[k];
                        sum += arr[l];

                        if(sum==target){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        Collections.sort(temp);
                        set.add(temp);
                        }
                    }
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
