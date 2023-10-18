package com.test.compositepattern.transparent;

import java.util.ArrayList;

public class Composite extends Component{
    //构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    @Override
    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
