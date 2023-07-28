package pt.dioguin.boss.api.events;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import pt.dioguin.boss.boss.Boss;
import pt.dioguin.boss.user.User;

public class BossDeathEvent extends Event {

    @Getter
    private final HandlerList handlers = new HandlerList();
    @Getter
    private final User user;
    @Getter
    private final Boss boss;

    public BossDeathEvent(User user, Boss boss) {
        this.user = user;
        this.boss = boss;
    }

}
