package com.test.proxypattern.book.force;

public interface IForceGamePlayer {
    //登陆
    public void login(String user,String password);
    //杀怪
    public void killBoss();
    //升级
    public void upgrade();
    //每个人都可以找一下自己的代理
    public IForceGamePlayer getProxy();
}
