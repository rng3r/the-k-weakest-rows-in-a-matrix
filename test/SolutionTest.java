import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test203() {
        int[][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };

        assertArrayEquals(new int[] {2, 0, 3}, new Solution().kWeakestRows(mat, 3));

    }

    @Test
    public void test02() {
        int[][] mat = {
                {1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0},
        };

        assertArrayEquals(new int[] {0, 2}, new Solution().kWeakestRows(mat, 2));
    }


}