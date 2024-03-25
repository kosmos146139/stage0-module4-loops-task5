package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int half = (sideLength + 1) / 2;
        for (int i = 1;i <= sideLength;i++)
        {
            for (int j = 1; j <= sideLength;j++)
            {
                if(i == half || j == half) {System.out.print('8');}
                else {System.out.print(' ');}
                if (j == sideLength) System.out.print('\n');
            }
        }
    }
}
