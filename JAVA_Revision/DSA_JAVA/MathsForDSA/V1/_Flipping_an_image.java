package MathsForDSA.V1;
//Q).   [1  1  0],         [0  1  1],        [1  0  0],
//      [1  0  1],   ==>   [1  0  1],   ==>  [0  1  0],
//      [0  0  0]          [0  0  0]         [1  1  1]
//       matrix      matrix image     inverse of the numbers
// LeetCode Question Link : https://leetcode.com/problems/flipping-an-image/description/
public class _Flipping_an_image {
    public static void main(String[] args) {

    }
    public static int[][] flipAndInvertImage(int[][] image){
        for (int[] row : image){
    //  reverse this array
    //  we will do swap operations
            for (int i=0; i<(image[0].length + 1)/2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[(image[0].length-1)-i] ^ 1;
                row[(image[0].length-1)-i] = temp;
            }
        }
        return image;
    }
}
