package com.test.proxypattern.book;

public class Client {
    public static void main(String[] args){
        IGamePlayer gamePlayer = new GamePlayer("张三");
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);

        gamePlayerProxy.login("zhangsan","1222");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
