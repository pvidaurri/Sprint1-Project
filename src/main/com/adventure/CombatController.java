package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;



    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {

        int monstersRemainingHealth = monster.getHealth() - player.getPower();
        int playersRemainingHealth = player.getHealth() - monster.getPower();

        while ((player.getHealth() > 0 && isPlayerDefeated()) && monster.getHealth() > 0) {

            if (monster.getHealth() > 0) {
                monster.setHealth(monstersRemainingHealth);
                if (monster.getHealth() <= 0) {
                    break;
                }
            } else if (player.getHealth() > 0) {
                player.setHealth(playersRemainingHealth);
                if (player.getHealth() <= 0) {
                    break;
                }
            }
//            return isPlayerDefeated();
        }

    }
        public boolean isPlayerDefeated () {
            return false;
        }


    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {

    }
}
