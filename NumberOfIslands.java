class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean flag[][] = new boolean[rows][cols];

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                if(grid[i][j] == '1' && !flag[i][j])
                {
                    ++islands;
                    flag[i][j] = true;
                    dfs(grid, i, j, rows, cols, flag);
                }
            }

        }
     return islands;
    }

        private void dfs(char[][] grid, int i, int j, int rows, int cols, boolean[][] flag)
        {
            Queue<int[]> q = new LinkedList<>();
            int[] currentCoordinates = {i,j};
            q.add(currentCoordinates);
            int[] coordinates;
            while(!(q.isEmpty()))
            {
                coordinates = q.poll();
                int x = coordinates[0];
                int y = coordinates[1];
                    if(x < rows-1 && y < cols && grid[x+1][y] == '1' && !flag[x+1][y])
                    {
                        q.add(IntStream.of(x+1,y).toArray());
                        flag[x+1][y] = true;
                    }
                    if(x < rows && y < cols-1 && grid[x][y+1] == '1' && !flag[x][y+1])
                    {
                        q.add(IntStream.of(x,y+1).toArray());
                        flag[x][y+1] = true;
                    }
                    if(y > 0 && grid[x][y-1] == '1' && !flag[x][y-1])
                    {
                        q.add(IntStream.of(x,y-1).toArray());
                        flag[x][y-1] = true;
                    }
                    if(x > 0 && grid[x-1][y] == '1' && !flag[x-1][y])
                    {
                        q.add(IntStream.of(x-1,y).toArray());
                        flag[x-1][y] = true;
                    }
            }
        }


    }




// class Solution {
//     public int numIslands(char[][] grid) {
        
//         Set<int[]> visited = new HashSet<>();
//         int numOfIslands = 0;
//         for(int i=0; i<grid.length; i++){
//             for(int j=0; j<grid[0].length; j++){
//                 int[] temp = {i,j};
//                 if(grid[i][j] == '1' && !visited.contains(temp)){
//                     ++numOfIslands;
//                     visited.add(temp);
//                     bfs(i, j, visited, grid);
//                 }
                
//             }
//         }
//         return numOfIslands;
//     }
    
//     public void bfs(int i, int j, Set<int[]> visited, char[][] grid){
        
//         Queue<int[]> queue = new LinkedList<>();
//         int[] coordinates = {i,j};
        
//         queue.add(coordinates);
        
//         while(!queue.isEmpty()){
//             coordinates = queue.poll();
//             int x =coordinates[0];
//             int y =coordinates[1];
//             if(x+1<grid.length && y<grid[0].length && grid[x+1][y] == '1' && !visited.contains(IntStream.of(x+1,y).toArray())){
//                 queue.add(IntStream.of(x+1,y).toArray());
//                 visited.add(IntStream.of(x+1,y).toArray());
//             }
//             if(y+1<grid[0].length && x<grid.length && grid[x][y+1] == '1' && !visited.contains(IntStream.of(x,y+1).toArray())){
//                 queue.add(IntStream.of(x,y+1).toArray());
//                 visited.add(IntStream.of(x,y+1).toArray());
//             }
//             if(x > 0 && grid[x-1][y] == '1' && !visited.contains(IntStream.of(x-1,y).toArray())){
//                 queue.add(IntStream.of(x-1,y).toArray());
//                 visited.add(IntStream.of(x-1,y).toArray());
//             }
//             if(y > 0 && grid[x][y-1] == '1' && !visited.contains(IntStream.of(x,y-1).toArray())){
//                 queue.add(IntStream.of(x,y-1).toArray());
//                 visited.add(IntStream.of(x,y-1).toArray());
//             }
//         }
        
//     }
    
// }
