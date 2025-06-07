import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumOptimal {
    public static List<List<Integer>> produceFourSum(int arr[], int target){
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j-1]) continue;
                  int k = j+1;
                  int l = n-1;
                  while(k<l){
                      long sum = arr[i];
                      sum += arr[j];
                      sum += arr[k];
                      sum += arr[l];
                      if(sum==target){
                     List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                     ans.add(temp);
                     k++;
                     l--;
                     while(k<l && arr[k]==arr[k-1]) k++;
                     while(k<l && arr[l]==arr[l+1]) l--;
                      }else if(sum<target){
                          k++;
                      }else{
                          l--;
                      }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        System.out.println(produceFourSum(arr,9));
    }
}
