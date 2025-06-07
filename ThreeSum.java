import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> produceThreeSum(int arr[],int n){
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer>triplet = Arrays.asList(arr[i],arr[j],arr[k]);
                        triplet.sort(null);//or Comparator.naturalOrder()
                        result.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(result);

    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int n = arr.length;
        System.out.println( produceThreeSum(arr,n));
    }
}
