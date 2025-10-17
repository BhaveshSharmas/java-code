package recursion.permutations;

import java.util.Arrays;

public class allPathdirection {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true}, {true, true, true}, {true, true, true}};
        int[][] path = new int[maze.length][maze[0].length];
//        allPaths("", maze, 0, 0);
        allPathsPrints("", maze, 0, 0, path, 1);
    }

    static void allPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPaths(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            allPaths(p + 'R', maze, r, c + 1);
        }

        if (r > 0) {
            allPaths(p + 'U', maze, r - 1, c);
        }

        if (c < 0) {
            allPaths(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = true;
    }

    static void allPathsPrints(String p, boolean[][] maze, int r, int c, int[][] path, int steps) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = steps;
            for (int[] area : path){
                System.out.println(Arrays.toString(area));
            }

            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = steps;

        if (r < maze.length - 1) {
            allPathsPrints(p + 'D', maze, r + 1, c,path,steps+1);
        }

        if (c < maze[0].length - 1) {
            allPathsPrints(p + 'R', maze, r, c + 1,path,steps+1);
        }

        if (r > 0) {
            allPathsPrints(p + 'U', maze, r - 1, c,path,steps+1);
        }

        if (c < 0) {
            allPathsPrints(p + 'L', maze, r, c - 1,path,steps+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
