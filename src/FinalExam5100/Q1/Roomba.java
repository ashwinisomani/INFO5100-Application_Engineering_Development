package FinalExam5100.Q1;

import FinalExam5100.Q1.iRobot;

public class Roomba implements iRobot {
    static class Points{
        int x,y;
        Points(int x, int y){
            this.x =x;
            this.y =y;
        }
    }

    final static int UNCLEANED = 0;
    final static int BLOCKED = -1;
    final static int CLEANED = 1;
    int [][] matrix ;
    Direction currentDirection;
    Points currentLocation;

    Roomba (Direction c,Points p,int[][] matrix){
        currentDirection =c;
        currentLocation =p;
        this.matrix = matrix;
    }
    @Override
    public boolean move() {
        int x = currentLocation.x;
        int y = currentLocation.y;
        if(currentDirection==Direction.DOWN){
            //   if(currentLocation.x<matrix.length && currentLocation.x>0 && currentLocation.y< matrix[0].length && currentLocation.y>0)
            if(x+1<=matrix.length-1 && matrix[x+1][y]!=-1){
                currentLocation.x= x+1;
                return true;
            }else return false;
        }else if(currentDirection==Direction.UP){
            //   if(currentLocation.x<matrix.length && currentLocation.x>0 && currentLocation.y< matrix[0].length && currentLocation.y>0)
            if(x-1>=0 && matrix[x-1][y]!=-1){
                currentLocation.x= x-1;
                return true;
            }else return false;
        }else if(currentDirection==Direction.RIGHT){
            //   if(currentLocation.x<matrix.length && currentLocation.x>0 && currentLocation.y< matrix[0].length && currentLocation.y>0)
            if(y+1<=matrix[0].length-1 && matrix[x][y+1]!=-1){
                currentLocation.y= y+1;
                return true;
            }else return false;
        }else if(currentDirection==Direction.LEFT){
            //   if(currentLocation.x<matrix.length && currentLocation.x>0 && currentLocation.y< matrix[0].length && currentLocation.y>0)
            if(y-1>=0 && matrix[x][y-1]!=-1){
                currentLocation.y= y-1;
                return true;
            }else return false;
        }
        return false;
    }

    @Override
    public void turnLeft() {
        if(currentDirection==Direction.UP)currentDirection=Direction.LEFT;
        else if(currentDirection==Direction.LEFT)currentDirection=Direction.DOWN;
        else if(currentDirection==Direction.DOWN)currentDirection=Direction.RIGHT;
        else if(currentDirection==Direction.RIGHT)currentDirection=Direction.UP;
    }

    @Override
    public void turnRight() {
        if(currentDirection==Direction.UP)currentDirection=Direction.RIGHT;
        else if(currentDirection==Direction.RIGHT)currentDirection=Direction.DOWN;
        else if(currentDirection==Direction.DOWN)currentDirection=Direction.LEFT;
        else if(currentDirection==Direction.LEFT)currentDirection=Direction.UP;
    }

    @Override
    public void clean() {
        if(matrix!=null){
            matrix[currentLocation.x][currentLocation.y]=1;
        }

    }

    public static void main(String[] args) {
        int [][]inpMatrix ={ { 0, -1, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { -1, 1, 8, 1, 1},
                { 0, 0, 0, 0, 1},
                { 1, 0, 0, 0, 1 } };
        Roomba rm = new Roomba(Direction.DOWN,new Points(0,0),inpMatrix);
        System.out.println(rm.currentLocation.x +" ,"+ rm.currentLocation.y);
        System.out.println(rm.currentDirection);
        System.out.println(rm.move());
        System.out.println(rm.currentLocation.x +" ,"+ rm.currentLocation.y);

        System.out.println(rm.move());
        System.out.println(rm.currentLocation.x +" ,"+ rm.currentLocation.y);
        System.out.println(inpMatrix[2][0]);
        rm.turnLeft();
        System.out.println(rm.currentDirection);
        rm.turnRight();
        System.out.println(rm.currentDirection);

    }
}
