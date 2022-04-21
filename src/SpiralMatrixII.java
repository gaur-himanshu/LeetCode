public class SpiralMatrixII {
    public static void main(String[] args) {
        int n=3;
        int[][] al = generateMatrix(n);
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                System.out.print(al[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int p=1;
        int r=n;
        int c= n;
        int i,k=0,l=0;
        while(k<r && l<c){
            for (i = l; i<c ; i++) {
                matrix[k][i]=p++;
            }
            k++;
            for (i=k;i<r;i++){
                matrix[i][c-1]=p++;
            }
            c--;
            if(k<r){
                for (i=c-1;i>=l;i--){
                    matrix[r-1][i]=p++;
                }
                r--;
            }
            if(l<c){
                for (i=r-1;i>=k;i--){
                    matrix[i][l]=p++;
                }
                l++;
            }
        }
        return matrix;
    }
}
