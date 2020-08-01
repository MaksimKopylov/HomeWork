package myClass;

import myInterface.RunJump;

public class Cat implements RunJump {
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump){
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public void Run() {
        System.out.print(getName() + " Пробежал ");
    }

    public void Jump() {
        System.out.print(getName() + " Прыгнул");
    }

    public String getName() {
        return name;
    }
    public int getMaxRun() {
        return maxRun;
    }
    public int getMaxJump(){
        return maxJump;
    }
}
