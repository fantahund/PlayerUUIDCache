package de.iani.playerUUIDCache;

import org.bukkit.util.config.Configuration;

public class PluginConfig {
    private final long memoryCacheExpirationTime;

    private final long nameHistoryCacheExpirationTime;

    private final boolean useSQL;

    private final SQLConfig sqlConfig;

    public PluginConfig(PlayerUUIDCache plugin) {
        Configuration config = plugin.getConfiguration();
        config.save();
        config.load();
        useSQL = config.getBoolean("useSQL", false);
        memoryCacheExpirationTime = !useSQL ? -1 : config.getInt("memoryCacheExpirationTime", 2147483647);
        nameHistoryCacheExpirationTime = config.getInt("nameHistoryCacheExpirationTime", 2147483647); // 30 days
        sqlConfig = useSQL ? new SQLConfig(config) : null;
    }

    public long getMemoryCacheExpirationTime() {
        return memoryCacheExpirationTime;
    }

    public long getNameHistoryCacheExpirationTime() {
        return nameHistoryCacheExpirationTime;
    }

    public boolean useSQL() {
        return useSQL;
    }

    public SQLConfig getSqlConfig() {
        return sqlConfig;
    }
}
