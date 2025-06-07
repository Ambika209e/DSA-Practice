public class ArraySubset {
    public static boolean isSubset(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        for(int i=0;i<m;i++){
            boolean found = false;
            for(int j=0;j<n;j++){
                if(b[i]==a[j]){
                    found = true;
                    break;
                }

            }
            if(!found) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {11, 1, 13, 21, 3, 7};
        int[] b = {11, 3, 7, 1};

        if (isSubset(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
