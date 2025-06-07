import java.util.List;

public class SubArrayXORSumBrute {
    public static int subArrayWithKSum(int arr[],int s){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int XOR = 0;
                 for(int k=i;k<=j;k++) {
                     XOR = XOR ^ arr[k];
                 }
                     if(XOR==s){
                     count++;
                 }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        System.out.println(subArrayWithKSum(arr,6));
    }
}
