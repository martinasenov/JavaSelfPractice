package week09_AlgoQuestions.Fighter;

import java.util.Random;

public class Fighter {

    public String name;
    public int health;
    public int damagePerAttack;


    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }


    public String toString() {
        return name;
    }

    public static void startFight(Fighter fighter1, Fighter fighter2) {

        Random random = new Random();

        boolean randomPunch= random.nextBoolean();

        while (fighter1.health > 0 && fighter2.health > 0) {

            if(randomPunch){
                fighter2.health -= fighter1.damagePerAttack;
                System.out.println(fighter1 + " attacks " + fighter2 + "; " + fighter2 + " now has " + fighter2.health);
                if (fighter2.health <= 0) {
                    break;
                }

            }else {

                fighter1.health -= fighter2.damagePerAttack;
                System.out.println(fighter2 + " attacks " + fighter1 + "; " + fighter1 + " now has " + fighter1.health);
                if (fighter1.health <= 0) {
                    break;
                }

            }
          randomPunch=!randomPunch;

        }

        System.out.println("-------------------------------------------------------");

        if (fighter1.health > fighter2.health) {
            System.out.println(fighter1.name + " wins!!!");
        } else {
            System.out.println(fighter2.name + " wins!!!");
        }

    }



    }
/*
Question-1 Two Fighters, One Winner
Create a function (method) that takes two objects of Fighter and the first attacker fighter’s name and returns the name of the winner in a fight between two fighters.
Each fighter takes turns attacking the other and whoever takes the life of the other first is victorious. Victory is defined as decreasing opponent’s health <= 0.
Each fighter will be a custom Fighter object/instance (which contains name, health, damagePerAttack and also setInfo method).
Both health and damagePerAttack will be integers and larger than 0.
Example 1:
input :
Fighter tom = new Fighter(); tom.setInfo("Tom", 10, 2);
Fighter harry = new Fighter(); harry.setInfo("Harry", 5, 4);
declareWinner(tom, harry, "Tom")
output : "Tom wins"
Explanation :
Tom attacks Harry; Harry now has 3 health.
Harry attacks Tom; Tom now has 6 health.
Tom attacks Harry; Harry now has 1 health.
Harry attacks Tom; Tom now has 2 health.
Tom attacks Harry: Harry now has -1 health and is dead. Tom wins.
Example 2:
Fighter jerry = new Fighter(); jerry.setInfo("Jerry", 30, 3);
Fighter harald = new Fighter(); harald.setInfo("Harald", 20, 5);
declareWinner(jerry, harald, "Jerry") => Harald wins*/
