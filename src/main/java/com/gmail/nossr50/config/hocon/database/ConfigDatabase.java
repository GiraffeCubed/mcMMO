package com.gmail.nossr50.config.hocon.database;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

@ConfigSerializable
public class ConfigDatabase {

    /*
     * CONFIG NODES
     */

    @Setting(value = "MySQL", comment = "Settings for using MySQL or MariaDB database" +
            "\nI recommend using MariaDB, its completely compatible with MySQL and runs a lot better" +
            "\nI also recommend having the MySQL/MariaDB server in the same datacenter or LAN as your Minecraft server" +
            "\nmcMMO uses ASYNC threaded requests for SQL, so the latency is not really a big deal," +
            " but ideally you want low latency to your SQL server anyways!")
    private ConfigSectionMySQL configSectionMySQL = new ConfigSectionMySQL();

    /*
     * GETTER BOILERPLATE
     */

    public ConfigSectionMySQL getConfigSectionMySQL() {
        return configSectionMySQL;
    }
}