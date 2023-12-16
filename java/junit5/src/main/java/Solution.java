import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {

    private static int getRowNoFromCoords(String coords) {
        return Integer.parseInt(coords.split(",")[0]);
    }

    private static int getColNoFromCoords(String coords) {
        return Integer.parseInt(coords.split(",")[1]);
    }

    private static boolean isCellZero(int[][] mat, String coords) {
        return mat[getRowNoFromCoords(coords)][getColNoFromCoords(coords)] == 0;
    }

    private static String getNextCoords(String coords, Direction direction) {
        if (direction == Direction.RIGHT) {
            int newCol = getColNoFromCoords(coords) + 1;
            return getRowNoFromCoords(coords) + "," + newCol;
        }
        if (direction == Direction.DOWN) {
            int newRow = getRowNoFromCoords(coords) + 1;
            return getRowNoFromCoords(coords) + "," + newRow;
        }
        if (direction == Direction.LEFT) {
            int newCol = getColNoFromCoords(coords) - 1;
            return getRowNoFromCoords(coords) + "," + newCol;
        }
        if (direction == Direction.UP) {
            int newRow = getRowNoFromCoords(coords) - 1;
            return getRowNoFromCoords(coords) + "," + newRow;
        }
        return "-1,-1";
    }

    private static boolean isCoordsOutOfBounds(int[][] mat, String coords) {
        int rowNo = getRowNoFromCoords(coords);
        int colNo = getColNoFromCoords(coords);

        return (rowNo > (mat.length - 1)) || (colNo > (mat[rowNo].length - 1));
    }

    public int[][] updateMatrix(int[][] mat) {

        int[][] resultMat = mat.clone();

        Set<String> visitedCells = new HashSet<>();

        int noOfRows = mat.length;
        int noOfCols = mat[0].length;

        for (int rowNo = 0; rowNo < noOfRows; rowNo++) {

            for (int colNo = 0; colNo < noOfCols; colNo++) {

                String currCoords = rowNo + "," + colNo;

                visitedCells.add(currCoords);

                Queue<String> q = new LinkedList<>();
                q.add(currCoords);

                int distance  = 0;
                while (!q.isEmpty()) {
                    int qLen = q.size();
                    for (int i = 0; i < qLen; i++) {
                        String coordsFromQ = q.remove();

                        if (isCoordsOutOfBounds(mat, coordsFromQ) || visitedCells.contains(coordsFromQ)) {
                            continue;
                        }

                        if (isCellZero(mat, coordsFromQ)) {
                            resultMat[getRowNoFromCoords(coordsFromQ)][getColNoFromCoords(coordsFromQ)] = distance;
                        }

                        // append right, down, left and up to Q
                        q.add(getNextCoords(coordsFromQ, Direction.RIGHT));
                        q.add(getNextCoords(coordsFromQ, Direction.DOWN));
                        q.add(getNextCoords(coordsFromQ, Direction.LEFT));
                        q.add(getNextCoords(coordsFromQ, Direction.UP));
                    }

                }

            }

        }

        return resultMat;

    }

}
