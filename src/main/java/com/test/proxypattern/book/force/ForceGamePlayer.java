package com.test.proxypattern.book.force;

public class ForceGamePlayer implements IForceGamePlayer{

    private String name  = "";
    private IForceGamePlayer proxy = null;
    public ForceGamePlayer(String _name){
        this.name = _name;
    }
    @Override
    public IForceGamePlayer getProxy() {
        this.proxy = new ForceGamePlayerProxy(this);
        return this.proxy;
    }
    @Override
    public void login(String user, String password) {
        if(this.isProxy()){
            System.out.println("登录名为"+user+"的用户"+this.name+"登录成功");
        }else{
            System.out.println("请使用指定的代理访问");;
        }
    }

    @Override
    public void killBoss() {
        if(this.isProxy()){
            System.out.println(this.name + "在打怪！ ");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(this.isProxy()){
            System.out.println(this.name + " 又升了一级！ ");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    //校验是否是代理访问
    private boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else{
            return true;
        }
    }
}
