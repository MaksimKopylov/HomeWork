package myClass;

import myInterface.Let;
import myInterface.RunJump;

public class Wall implements Let {
    private int heighWall;

    public Wall( int heighWall) {
        this.heighWall = heighWall;
    }
   public boolean overcomingObstacle(RunJump Player){
        if(Player.getMaxJump() > heighWall) {
            Player.Jump();
            System.out.println(" через препятствие  " + heighWall + "м" );
            return true;

        }else{
            System.out.println(Player.getName() + " Не может прыгнуть  " + heighWall + "м"+" Выбывает из игры ");
            return false;
        }
    }
    public int getSize(){
        return heighWall;
    }
}
