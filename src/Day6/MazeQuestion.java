package Day6;

public class MazeQuestion {

    //Count total paths in a maze to move from (0,0) to (n,m)
    //n=3 m=3

    public static int CountPaths(int i,int j,int n,int m )
    {
        if (i==n || j==m)
        {
            return 0;
        }
        if (i==n-1 && j==m-1)
        {
            return 1;
        }

        //move downwards

        int DownPaths=CountPaths(i+1,j,n,m);

        //move right

        int RightPaths=CountPaths(i,j+1,n,m);

        return DownPaths+RightPaths;

    }
    public static void main(String[] args)
    {


        int n=3;
        int m=3;
        int TotalPath= CountPaths(0,0,n,m);
        System.out.println(TotalPath);

    }

}
