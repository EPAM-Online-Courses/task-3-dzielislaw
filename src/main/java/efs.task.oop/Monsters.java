package efs.task.oop;

public class Monsters {
   static final Monster andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            setHealth(getHealth() - damage);
            monstersHealth -= damage;
        }
    };
    static final Monster blacksmith = new Monster(100,25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            monstersHealth -= 5 + damage;
            setHealth(getHealth() - 5 - damage);

        }
    };
    static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();
}
