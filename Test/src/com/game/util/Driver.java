package com.game.util;

import com.game.character.Enemy;
import com.game.character.Player;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Battle!\n type 'a' to attack and 'r' to run!");
/*        Enemy enemy = new Enemy(200,20,20,10);
        Player player = new Player(200,10,20,15);
        Scanner input = new Scanner(System.in);

        while(true) {

            if(input.hasNextLine()) {
                String command = input.nextLine();
                if (command.equals("r")) {
                    System.out.println("You ran!");
                    break;
                } else if (command.equals("a")) {
                    if (player.getSpeed() > enemy.getSpeed()) {
                        int damage = enemy.damaged(player.attack());
                        System.out.println("com.game.character.Enemy took " + damage + " damage!");
                        damage = player.damaged(enemy.attack());
                        System.out.println("player took " + damage + " damage!");
                    } else {
                        int damage = player.damaged(enemy.attack());
                        System.out.println("player took " + damage + " damage!");
                        damage = enemy.damaged(player.attack());
                        System.out.println("com.game.character.Enemy took " + damage + " damage!");
                    }
                    if (enemy.getHealth() <= 0) {
                        System.out.println("You won!");
                        break;
                    } else if (player.getHealth() <= 0) {
                        System.out.println("You lost!");
                        break;
                    }
                    System.out.println("com.game.character.Player health: " + player.getHealth() + " | com.game.character.Enemy Health: " + enemy.getHealth());

                } else {
                    System.out.println("Invalid command!");
                }
            }
        }
        System.out.println("Play again? (y)es (n)o");
            if(input.hasNextLine()){
                String command = input.nextLine();
                if(command.equals("y"))
                    main(args);
                else
                    System.exit(0);
            }
    }*/
    }
}
