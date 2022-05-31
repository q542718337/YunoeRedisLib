package me.yunoe.yunoeredislib;

import org.bukkit.plugin.java.JavaPlugin;

public final class YunoeRedisLib extends JavaPlugin {
    public static YunoeRedisLib plugin;

    @Override
    public void onEnable() {
        plugin = this;

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
