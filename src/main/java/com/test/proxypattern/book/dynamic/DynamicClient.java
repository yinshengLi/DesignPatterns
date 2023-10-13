package com.test.proxypattern.book.dynamic;

import com.test.proxypattern.book.GamePlayer;
import com.test.proxypattern.book.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理是在实现阶段不用关心代理谁， 而在运行阶段才指定代理哪一个对象
 *
 */
public class DynamicClient {
    public static void main(String[] args){
        //定义一个玩家
        IGamePlayer gamePlayer = new GamePlayer("张三");
        //定义一个handler
        InvocationHandler handler = new GamePlayIH(gamePlayer);
        //获得类的class loader
        ClassLoader cl = gamePlayer.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,gamePlayer.getClass().getInterfaces(),handler);

        proxy.login("zhangsan","1222");
        proxy.killBoss();
        proxy.upgrade();
    }
}
