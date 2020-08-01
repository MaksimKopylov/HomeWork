package myClass;

import myInterface.Let;
import myInterface.RunJump;

public class TreadMill implements Let {
    private int lenghtTreadMill;

    public TreadMill( int lenghtTreadMill) {
        this.lenghtTreadMill = lenghtTreadMill;
    }
    public boolean overcomingObstacle(RunJump Player){
        if(Player.getMaxRun() > lenghtTreadMill) {
            Player.Run();
            System.out.println(" расстяние в " + lenghtTreadMill + "км");
            return true;
        }else{
            System.out.println(Player.getName() + " Не может пробежать " + lenghtTreadMill + "км"+" Выбывает из игры ");
            return false;
        }
    }
    public  int getSize(){
        return lenghtTreadMill;
    }
}
