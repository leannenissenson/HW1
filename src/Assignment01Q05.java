public class Assignment01Q05 { 
    public static int findShortestPath(int[][] m, int i, int j) {
        if (m.length<=0) {
            return -1; 
        }

        int[] has_been = new int[m.length]; 

        return findShortestPath_rec(m, i, j, has_been); 
    }

    private static int findShortestPath_rec(int[][] m, int i, int j, int[] has_been) {
        if (i==j) {
            return 0; 
        }
        int[] curr_array = m[i]; 
        int index;
        int path_length=-1; 
        int shortest_path = m.length+1; 
        for (int i2 = 0; i2 < curr_array.length; i2++) {
            index = curr_array[i2]; 
            if (index == 1) {
                if (has_been[i2]==0&&i2!=j) {
                    has_been[i2] = -1; /* For loops to show that has_been */
                    has_been[i2] = findShortestPath_rec(m, i2, j, has_been); 
                }

                
                if (has_been[i2] != -1) {
                    path_length = 1 + has_been[i2];
                
                    if (path_length<shortest_path) {
                        shortest_path = path_length;
                    }
                }
            }

        }
        
        if (shortest_path <= m.length) {
            return shortest_path; 
        }
        else {
            return -1; 
        }

    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{1,1,0,1,1}, {0,0,0,0,1}, {0,0,0,0,0}, {0,1,0,0,0}, {0,0,0,0,0}}, 0, 2)); // 2
    }
}