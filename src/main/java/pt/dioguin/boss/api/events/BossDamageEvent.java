package pt.dioguin.boss.api.events;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import pt.dioguin.boss.boss.Boss;
import pt.dioguin.boss.user.User;

public class BossDamageEvent extends Event {

    @Getter
    private final HandlerList handlers = new HandlerList();
    @Getter
    private final User user;
    @Getter
    private final Boss boss;
    @Getter
    @Setter
    private double damage;

    public BossDamageEvent(User user, Boss boss, double damage) {
        this.user = user;
        this.boss = boss;
        this.damage = damage;
    }

}
