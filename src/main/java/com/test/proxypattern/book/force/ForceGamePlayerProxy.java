package com.test.proxypattern.book.force;

/**
 * 强制代理
 */
public class ForceGamePlayerProxy implements IForceGamePlayer{
    private IForceGamePlayer iGamePlayer;

    public ForceGamePlayerProxy(IForceGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.iGamePlayer.login(user,password);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }
    //代理的代理暂时还没有， 就是自己
    @Override
    public IForceGamePlayer getProxy() {
        return this;
    }
}
