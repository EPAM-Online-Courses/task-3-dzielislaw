package efs.task.oop;

public abstract class Monster implements Fighter {
    private int health;
    private int damage;

    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return damage;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public Monster(int health, int damage){
        this.damage = damage;
        this.health = health;
    }
}
