package pt.dioguin.boss.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import pt.dioguin.boss.BossPlugin;
import pt.dioguin.boss.boss.Boss;
import pt.dioguin.boss.boss.manager.BossManager;

import java.util.List;

public class BossAPI {

    private final BossManager bossManager = BossPlugin.getInstance().getBossManager();

    /**
     * Checks if the provided block is a boss.
     *
     * @param clickedBlock The block to be checked.
     * @return true if the block is a boss, false otherwise.
     */
    public boolean isBoss(Block clickedBlock){
        return bossManager.isBoss(clickedBlock);
    }

    /**
     * Gets the boss associated with the provided block, if it exists.
     *
     * @param clickedBlock The block associated with the boss to retrieve.
     * @return The Boss instance associated with the block, or null if no boss is associated with the block.
     */
    public Boss getBoss(Block clickedBlock){
        return bossManager.getBoss(clickedBlock);
    }

    /**
     * Checks if there is a boss within the specified area.
     *
     * @param area The area represented as a list of locations to be checked.
     * @return true if there is a boss within the area, false otherwise.
     */
    public boolean hasBossInArea(List<Location> area){
        return bossManager.hasBossInArea(area);
    }

    /**
     * Gets the boss present within the specified area.
     *
     * @param area The area represented as a list of locations.
     * @return The Boss instance present in the area, or null if there is no boss in the area.
     */
    public Boss getBossInArea(List<Location> area){
        return bossManager.getBossInArea(area);
    }

}
