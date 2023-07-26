package pt.dioguin.boss.api;

import pt.dioguin.boss.BossPlugin;
import pt.dioguin.boss.user.User;
import pt.dioguin.boss.user.manager.UserManager;

public class UserAPI {

    private final UserManager userManager = BossPlugin.getInstance().getUserManager();

    /**
     * Loads the user associated with the given player name. If the user does not exist,
     * a new user instance is created and returned.
     *
     * @param playerName The name of the player for which to load the user.
     * @return The user instance associated with the player name, or a new user instance if it doesn't exist.
     */
    public User loadUser(String playerName) {
        return userManager.loadUser(playerName);
    }

    /**
     * Retrieves the user associated with the given player name, if it exists.
     *
     * @param playerName The name of the player for which to retrieve the user.
     * @return The user instance associated with the player name, or null if the user doesn't exist.
     */
    public User getUser(String playerName) {
        return userManager.getUser(playerName);
    }

    /**
     * Adds the specified amount of xp to the user.
     *
     * @param playerName The name of the player for which to add xp.
     * @param xp The amount of xp to add.
     */
    public void addXp(String playerName, double xp) {
        User user = getUser(playerName);
        if (user != null) user.addXp(xp);
    }


    /**
     * Removes the specified amount of xp to the user.
     *
     * @param playerName The name of the player for which to remove xp.
     * @param xp The amount of xp to remove.
     */
    public void removeXp(String playerName, double xp) {
        User user = getUser(playerName);
        if (user != null) user.removeXp(xp);
    }


    /**
     * Sets the specified amount of xp to the user.
     *
     * @param playerName The name of the player for which to set xp.
     * @param xp The amount of xp to set.
     */
    public void setXp(String playerName, double xp) {
        User user = getUser(playerName);
        if (user != null) user.setXp(xp);
    }

    /**
     * Checks if the user is at the last boss level.
     *
     * @param user The user to check.
     * @return True if the user is at the last boss level, false otherwise.
     */
    public boolean isLastBossLevel(User user){
        return userManager.isLastBossLevel(user);
    }

    /**
     * Calculates the percentage of progress towards the next boss level for the given user.
     *
     * @param user The user for which to calculate the progress.
     * @return The percentage of progress towards the next boss level (from 0 to 1).
     */
    public double getPercentageToNextLevel(User user){
        return userManager.getPercentageToNextLevel(user);
    }

    /**
     * Increases the boss level of the specified user if they meet the requirements for the next level.
     *
     * @param playerName The name of the player for which to increase the boss level.
     */
    public void upBossLevel(String playerName) {
        User user = getUser(playerName);
        if (user != null) userManager.upBossLevel(user);
    }

}
