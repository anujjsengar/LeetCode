class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor != color) {
            fill(image, sr, sc, color, originalColor);
        }
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int color, int originalColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) return;
        if (image[sr][sc] != originalColor) return;

        image[sr][sc] = color;

        fill(image, sr + 1, sc, color, originalColor);
        fill(image, sr - 1, sc, color, originalColor);
        fill(image, sr, sc + 1, color, originalColor);
        fill(image, sr, sc - 1, color, originalColor);
    }
}
