import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingArray {
    public static List<List<Integer>> mergeOverlappingArrays(int arr[][]) {
        int n = arr.length;
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0]; // sorting by first column
            }
        });

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(arr[j][0]<=end){
                    end = Math.max(end,arr[j][1]);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] ={{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};
        System.out.println(mergeOverlappingArrays(arr));
    }
}
