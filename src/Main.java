import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Knight knight = new Knight();
        Monster monster=new Monster();
        Sword sword=new Sword();
        Horse horse=new Horse();
       // System.out.println("введите имя");


        // knight.newName();

        while (true) {
            System.out.println("куда пойдешь? 1-вверх, 2-право,3-вниз,4-лево");
            int w = console.nextInt();
            if (w == 1) {
                knight.goForward();
            } else if (w == 3) {
                knight.goBackward();
            } else if (w == 2) {
                knight.goRight();
            } else if (w == 4) {
                knight.goLeft();
            } else {
                System.out.println("вы ошиблись");
            }
            int xK = knight.getX();
            int yK = knight.getY();
            int pK = knight.getPower();

            int xM =monster.getX();
            int yM=monster.getY();
            int pM = monster.getPower();

            int xS=sword.getX();
            int yS= sword.getY();
            int pS= sword.getPower();

            int xH= horse.getX();
            int yH= horse.getY();
            int pH= horse.getPower();
            System.out.println("вы находитесь х:" + xK + ":y:" + yK);
            if(xK==xH&&yK==yH){
                pK=pK+pH;
                knight.setPower(pK);
                System.out.println("вы нашли лошадь,ваша сила выросла,она составляет:"+pK);

            }
            if(xK==xS&&yK==yS){
                pK=pK+pS;
                knight.setPower(pK);
                System.out.println("вы нашли меч,ваша сила выросла,она составляет:"+pK);
            }
            if(xK==xM&&yK==yM){
                int win=pK-pM;
                if(win>0){
                    System.out.println("Ты нашел монстра и победил! Поздравляем!!!");
                    break;                }
                else{
                    System.out.println("Ты нашел монстра и проиграл,попробуй снова");
                    break;
                }

            }
        }
    }
}
