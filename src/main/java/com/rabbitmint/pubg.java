package com.rabbitmint;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import static com.rabbitmint.info.*;

public final class pubg extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info( "["+ Name + "] "+ Name + "가 활성화 되었습니다.");
        Bukkit.getLogger().info("["+ Name + "] "+ Version + " 버전을 사용중 입니다.");
        Bukkit.getLogger().warning("[경고] " + "플러그인은 항상 최신 버전으로 사용하는것을 추천드립니다.");
        Bukkit.getLogger().info("["+ Name + "] "+ Developer + "가 " + BuildDate + "에 빌드함.");
        Bukkit.getLogger().info("["+ Name + "] 이 플러그인은 " + API + "를 사용합니다.");
        Bukkit.getLogger().warning("[경고] " + "서버를 열떄 Paper 1.20을 사용 하시는걸 권장합니다.");
        Bukkit.getLogger().info("["+ Name + "] "+ "------- 컴퓨터 정보 -------");
        Bukkit.getLogger().info("["+ Name + "] CPU : "+ CPU);
        Bukkit.getLogger().info("["+ Name + "] RAM : "+ RAM);
        Bukkit.getLogger().info("["+ Name + "] OS : "+ OS);
        Bukkit.getLogger().info("["+ Name + "] JAVA : "+ JAVA);
        Bukkit.getLogger().warning("[경고] " + "서버 컴퓨터의 성능이 부족할 경우 서버가 불안정 할수 있습니다.");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().warning("["+ Name + "] 서버 종료가 감지 되었습니다.");
        Bukkit.getLogger().info(""+ Name + "] 저장하고 서버를 종료합니다.");
        Bukkit.savePlayers();
        Bukkit.shutdown();
    }
}
