package com.test.proxypattern.book.common;

import com.test.proxypattern.book.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer iGamePlayer = null;


    public GamePlayerProxy(String name){
       try {
          iGamePlayer = new GamePlayer(this,name);
       }catch (Exception e){
           e.printStackTrace();
       }
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
}
