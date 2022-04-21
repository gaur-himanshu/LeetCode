import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] ar= {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> al=spiralOrder(ar);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> al = new ArrayList<>();
        int r= matrix.length;
        int c= matrix[0].length;
        int i,k=0,l=0;
        while(k<r && l<c){
            for (i = l; i<c ; i++) {
                al.add(matrix[k][i]);
            }
            k++;
            for (i=k;i<r;i++){
                al.add(matrix[i][c-1]);
            }
            c--;
            if(k<r){
                for (i=c-1;i>=l;i--){
                    al.add(matrix[r-1][i]);
                }
                r--;
            }
            if(l<c){
                for (i=r-1;i>=k;i--){
                    al.add(matrix[i][l]);
                }
                l++;
            }
        }
        return al;

    }
}
