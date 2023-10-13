package com.test.proxypattern.book.force;

import com.test.proxypattern.book.GamePlayerProxy;
import com.test.proxypattern.book.IGamePlayer;

/**
 * 强制代理 ：访问真是角色，返回代理
 */
public class Client {
    public static void main(String[] args){
        IForceGamePlayer gamePlayer = new ForceGamePlayer("张三");
        //直接访问会报错，提示使用代理
        gamePlayer.login("zhangsan","1222");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
        //获取代理，使用代理访问
        IForceGamePlayer proxy = gamePlayer.getProxy();
        proxy.login("zhangsan","1222");
        proxy.killBoss();
        proxy.upgrade();
    }
}
