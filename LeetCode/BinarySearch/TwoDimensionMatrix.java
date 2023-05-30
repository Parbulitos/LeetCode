package LeetCode.BinarySearch;

public class TwoDimensionMatrix {
    public boolean searchMatrix(int[][] matrix, int target){
        if(matrix.length == 0){return false;}
        //Matrix dimensions
        int rows = matrix.length -1;
        int cols = matrix[0].length -1;
        //Indexes
        int low = 0;
        int high = rows;
        int targetRow = 0;
        while(low < high){
            int midRows = (high+low)/2;
            if(target < matrix[midRows][cols]){
                high = midRows;
            }
            if(target > matrix[midRows][cols]){
                low = midRows;
            }
            if(target > matrix[midRows][cols] && target <= matrix[midRows + 1][cols]){
                targetRow = midRows +1;
                break;
            }  
            if(target < matrix[0][0] || target > matrix[rows][cols]){
                return false;
            }          
        }
        low = 0;
        high = cols;
        while(low <= high){
            int mid = (high + low)/2;
            if(matrix[targetRow][mid] < target){
                low = mid + 1;
            }if(matrix[targetRow][mid] > target){
                high = mid - 1;
            }if(matrix[targetRow][mid] == target){
                return true;
            }
        }
        return false;
    }
    
}
