package com.rabbitmint;

public interface info {
    String Name = "example";
    String Developer = "RabbitMint";
    String Version = "0.1";
    String BuildDate = "2024.10.17";
    String API = "SPIGOT 1.20";

    String RAM = SystemInfo.getTotalRAM();
    String CPU = SystemInfo.getCPUName();
    String OS = SystemInfo.getOSName();
    String JAVA = SystemInfo.getJAVAVersion();
}
