import java.util.Scanner;
import java.util.Random;
public class program{
  public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Random random = new Random();
        int [][] Matrix = new int [10][10];
        System.out.println("Введите координату X для стартовой точки");
        int x = Sc.nextInt();
        System.out.println("Введите координату Y для стартовой точки");
        int y = Sc.nextInt();
        int start = Matrix[x][y];   
        int d = 1;
        int exit = Matrix[random.nextInt(10)][random.nextInt(10)];
        while(exit == 0){
            for( int i = 0; i<4; i++){
                if(y+1>=0){  //up
                    if(Matrix[y-1][x] == 0){
                        Matrix[y-1][x] = d;
                    }
                }
                if(y+1>=0){  //right
                    if(Matrix[y][x+1] == 0){
                        Matrix[y][x+1] = d;
                        }
                    }   
                if(y+1>=0){  //down
                    if(Matrix[y+1][x] == 0){
                        Matrix[y+1][x] = d;
                    }
                }
                if(y+1>=0){  //left
                    if(Matrix[y][x-1] == 0){
                        Matrix[y][x-1] = d;
                    }
                }
                ++d;
            }
        }
    }
}