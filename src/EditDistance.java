public class EditDistance {
    public static void main(String[] args) {
        String word1="horse";
        String word2="ros";
        System.out.println(minDistance(word1,word2));
    }
    public static int minDistance(String word1, String word2) {

        int[][] temp=new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i < temp.length; i++) {
            temp[i][0]=i;
        }
        for (int i = 0; i < temp[0].length; i++) {
            temp[0][i]=i;
        }
        for (int i = 1; i < temp.length; i++) {
            for (int j = 1; j < temp[0].length; j++) {
                if (word1.charAt(i-1)==word2.charAt(j-1))
                    temp[i][j]=temp[i-1][j-1];
                else{
                    temp[i][j]=1+Math.min(temp[i-1][j-1],Math.min(temp[i-1][j],temp[i][j-1]));
                }
            }
        }
        return temp[word1.length()][word2.length()];
    }
}
