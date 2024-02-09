public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] == color) {
            return image;
        }

        dfsFill(image, sr, sc, image[sr][sc], color);

        return image;
    }

    private static void dfsFill(int[][]image, int i, int j, int color, int newColor) {

        // return if sr or sc is out of bounds
        if (i < 0 || i >= image.length || j < 0 || j >=image[0].length) {
            return;
        }

        if (image[i][j] != color) {
            return;
        }

        image[i][j] = newColor;

        dfsFill(image, i + 1, j, color, newColor);
        dfsFill(image, i - 1, j, color, newColor);
        dfsFill(image, i, j + 1, color, newColor);
        dfsFill(image, i, j - 1, color, newColor);
    }


}
