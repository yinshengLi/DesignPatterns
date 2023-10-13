package com.test.proxypattern.book.common;

import com.test.proxypattern.book.GamePlayerProxy;
import com.test.proxypattern.book.IGamePlayer;

/**
 * 普通代理 ：客户端只能访问代理角色， 而不能访问真实角色
 */
public class Client {
    public static void main(String[] args){
        IGamePlayer gamePlayer = new com.test.proxypattern.book.common.GamePlayerProxy("张三");
        com.test.proxypattern.book.GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(gamePlayer);

        gamePlayerProxy.login("zhangsan","1222");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
