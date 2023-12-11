public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] == color) {
            return image;
        }

        int prevColor = image[sr][sc];
        image[sr][sc] = color;

        // top
        if (sr - 1 >= 0 && image[sr-1][sc] == prevColor) {
            image =  floodFill(image, sr-1, sc, color);
        }

        // right
        if (sc + 1 <= (image[sr].length -1) && image[sr][sc+1] == prevColor) {
            image =  floodFill(image, sr, sc+1, color);
        }

        // down
        if (sr + 1 <= (image.length -1) && image[sr+1][sc] == prevColor) {
            image =  floodFill(image, sr+1, sc, color);
        }

        // left
        if (sc - 1 >= 0 && image[sr][sc-1] == prevColor) {
            image =  floodFill(image, sr, sc-1, color);
        }

        return image;
    }

}
