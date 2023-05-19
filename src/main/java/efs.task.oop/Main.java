package efs.task.oop;

import java.util.concurrent.TimeUnit;

import static efs.task.oop.Monsters.monstersHealth;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);
        Villager seventh = new Villager("Seventh", 32);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();
        seventh.sayHello();

        Object objectAkara = akara;
        Object objectDeckardCain = deckardCain;

        String currentFighterName = "";
        while (monstersHealth > 0){
            Monsters.andariel.attack(deckardCain);
            System.out.println("Potwory posiadaja jeszcze " + monstersHealth + " punkty zycia");
            if(kashya.getHealth() > 0 && Monsters.andariel.getHealth() > 0) {
                currentFighterName = kashya.getName();
                kashya.attack(Monsters.andariel);
                if (Monsters.andariel.getHealth() > 0) {
                    Monsters.andariel.attack(kashya);
                }
            }
            else if(kashya.getHealth() > 0){
                currentFighterName = kashya.getName();
                kashya.attack(Monsters.blacksmith);
                if (Monsters.blacksmith.getHealth() > 0){
                    Monsters.blacksmith.attack(kashya);
                }
            }
            else if(gheed.getHealth() > 0 && Monsters.andariel.getHealth() > 0){
                currentFighterName = gheed.getName();
                gheed.attack(Monsters.andariel);
                if(Monsters.andariel.getHealth() > 0){
                    Monsters.andariel.attack(gheed);
                }
            }
            else if (gheed.getHealth() > 0){
                currentFighterName = gheed.getName();
                gheed.attack(Monsters.blacksmith);
                if(Monsters.blacksmith.getHealth() > 0){
                    Monsters.blacksmith.attack(gheed);
                }
            }
            else if(warriv.getHealth() > 0 && Monsters.andariel.getHealth() > 0){
                currentFighterName = warriv.getName();
                warriv.attack(Monsters.andariel);
                if(Monsters.andariel.getHealth() > 0){
                    Monsters.andariel.attack(warriv);
                }
            }
            else if (warriv.getHealth() > 0) {
                currentFighterName = warriv.getName();
                warriv.attack(Monsters.blacksmith);
                if (Monsters.blacksmith.getHealth() > 0) {
                    Monsters.blacksmith.attack(warriv);
                }
            }
            else if(seventh.getHealth() > 0 && Monsters.andariel.getHealth() > 0){
                currentFighterName = seventh.getName();
                seventh.attack(Monsters.andariel);
                if(Monsters.andariel.getHealth() > 0){
                    Monsters.andariel.attack(seventh);
                }
            }
            else if (seventh.getHealth() > 0) {
                currentFighterName = seventh.getName();
                seventh.attack(Monsters.blacksmith);
                if (Monsters.blacksmith.getHealth() > 0) {
                    Monsters.blacksmith.attack(seventh);
                }
            }
            System.out.println("Aktualnie walczacy osadnik to " + currentFighterName);
        }

        System.out.println("Obozowisko ocalone!");

        akara = (ExtraordinaryVillager) akara;
        deckardCain = (ExtraordinaryVillager) objectDeckardCain;
        akara.sayHello();
        deckardCain.sayHello();
    }
}
