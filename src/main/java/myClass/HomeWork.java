package myClass;

import myInterface.Let;
import myInterface.RunJump;

public class HomeWork {
    public static void main(String[] args) {
        RunJump runJump[] = new RunJump[3];
        Let let[] = new Let[10];

        int startWall = 5;
        int startTreadMill = 50;

         runJump[0] = new Cat("Барсик", 250, 30);
         runJump[1] = new Human("Василий", 500, 50);
         runJump[2] = new Robot("РоботПылесос", 1000, 100);


         for(int i = 0; i < let.length; i++ ){
             let[i] = new Wall(startWall);
             startWall+=startWall;
             i++;
             let[i] = new TreadMill(startTreadMill);
             startTreadMill += startTreadMill;
         }

        for(int i = 0; i < runJump.length; i++){
            for (int j = 0; j < let.length; j++){

                if (let[j].overcomingObstacle(runJump[i])) {
                    let[j].overcomingObstacle(runJump[i]);
                }else {
                    break;
                }
            }
        }
    }
}
