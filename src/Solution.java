import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        TreeSet<RowWeight> weights = new TreeSet<>(Comparator.comparing(RowWeight::weight)
                .thenComparing(RowWeight::idx));

        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];

            int weight = Arrays.stream(row).sum();

            RowWeight rowWeight = new RowWeight(i, weight);
            weights.add(rowWeight);
        }

        return weights.stream()
                .limit(k)
                .mapToInt(RowWeight::idx).toArray();

    }


    private record RowWeight(int idx, int weight) {}
}