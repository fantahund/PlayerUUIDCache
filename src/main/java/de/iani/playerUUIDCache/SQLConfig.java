package de.iani.playerUUIDCache;

import org.bukkit.util.config.Configuration;

public class SQLConfig {
    private String host = "localhost";

    private String user = "CHANGETHIS";

    private String password = "CHANGETHIS";

    private String database = "CHANGETHIS";

    private String tablename = "playeruuids";

    private String profilestablename = "playerprofiles";

    private String namehistoriestablename = "namehistories";

    private String namechangestablename = "namechanges";

    public SQLConfig(Configuration section) {
        if (section != null) {
            host = section.getString("database.host", host);
            user = section.getString("database.user", user);
            password = section.getString("database.password", password);
            database = section.getString("database.database", database);
            tablename = section.getString("database.tablename", tablename);
            profilestablename = section.getString("database.profilestablename", profilestablename);
            namehistoriestablename = section.getString("database.namehistoriestablename", namehistoriestablename);
            namechangestablename = section.getString("database.namechangestablename", namechangestablename);
        }
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabase() {
        return database;
    }

    public String getTableName() {
        return tablename;
    }

    public String getProfilesTableName() {
        return profilestablename;
    }

    public String getNameHistoriesTableName() {
        return namehistoriestablename;
    }

    public String getNameChangesTableName() {
        return namechangestablename;
    }
}
