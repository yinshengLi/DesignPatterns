package com.test.prototypepattern.book;

/**
 * 实现Cloneable 标示Mail 是可以拷贝的
 */
public class Mail implements Cloneable{
    //收件人
    private String receiver;
    //邮件名称
    private String subject;
    //称谓
    private String appellation;
    //邮件内容
    private String contxt;
    //邮件的尾部， 一般都是加上"XXX版权所有"等信息
    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.subject = advTemplate.getAdvSubject();
        this.contxt = advTemplate.getAdvContext();
    }

    /**
     * 这里只是浅拷贝，对象和数组是无法拷贝的还指向原对象的内部元素地址
     * @return
     */
    @Override
    public Mail clone(){
        Mail mail = null;
        try{
            mail = (Mail) super.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContxt() {
        return contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
