package com.test.compositepattern.transparent;

import java.util.ArrayList;

public class Leaf extends Component{
    @Deprecated
    public void add(Component component) throws UnsupportedOperationException{
    //空实现,直接抛弃一个"不支持请求"异常
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void remove(Component component) throws UnsupportedOperationException{
    //空实现,直接抛弃一个"不支持请求"异常
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ArrayList<Component> getChildren() throws UnsupportedOperationException{
        //空实现,直接抛弃一个"不支持请求"异常
        throw new UnsupportedOperationException();
    }
}
