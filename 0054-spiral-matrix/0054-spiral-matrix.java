class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans= new ArrayList<> ();
        int m = arr.length , n = arr[0].length;
        int firstRow = 0;
        int lastRow = m - 1;
        int firstCol = 0;
        int lastCol = n - 1;
        int totalele=m*n;
        while(ans.size()<totalele ){
            for (int j=firstCol;j<=lastCol;j++) //right
             ans.add(arr[firstRow][j]);
            firstRow++;
            if(ans.size()==totalele) break;
            
            for (int i=firstRow;i<=lastRow;i++) //down
             ans.add(arr[i][lastCol]);
            lastCol--;
            if(ans.size()==totalele) break;
            

            for (int j=lastCol;j>=firstCol;j--) //left
             ans.add(arr[lastRow][j]);
            lastRow--;
            if(ans.size()==totalele) break;
            

            for (int i=lastRow;i>=firstRow;i--) //up
             ans.add(arr[i][firstCol]);
            firstCol++;
            if(ans.size()==totalele) break;
            


        }
        return ans;
    }
}