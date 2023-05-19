package efs.task.oop;

public class Villager implements Fighter {
    private String name;
    private int age;
    private int health = 100;


    public void sayHello(){
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }

    public Villager(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public int getHealth(){
        return health;
    }

    public int getDamage(){
        return (int) ((100 - age * 0.5) / 10);
    }

    public void setHealth(int health){
        this.health = health;
    }
    @Override
    public void attack(Fighter victim) {
        victim.takeHit(getDamage());
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
    }
}
