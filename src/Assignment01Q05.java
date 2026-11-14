public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int size = m[0].length;
        int[] queue = new int[size];
        int head = 0;
        int tail = 0;
        int[] distances = new int[size];
        for(int x = 0; x<size; x++){
            distances[x] = -1;
        }
        distances[i] = 0;
        queue[tail] = i; tail++;
        while (head<tail) {
            int current = queue[head];
            head++;
            if( current == j){
                return distances[current];
            }
            for (int x = 0; x<size; x++){
                if (m[current][x] == 1 && distances[x]==-1){
                    distances[x] = distances[current] + 1;
                    queue[tail]= x;
                    tail ++;
                }

            }

            
        }

        

        return -1;               

        }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}