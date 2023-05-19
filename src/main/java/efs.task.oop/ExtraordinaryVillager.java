package efs.task.oop;

public class ExtraordinaryVillager extends Villager {
    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    Skill skill;

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + super.getName() + " and I'm " + super.getAge() + " years old. " + skill.getSkillDescription());
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);
    }

    @Override
    public void takeHit(int damage){
         setHealth(0);
    }
    public enum Skill{
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");
        private String skillDescription;

        Skill(String s) {
            this.skillDescription = s;
        }

        public String getSkillDescription(){
            return this.skillDescription;
        }
    }
}
