package com.springmvc.test.btree;


import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class TestForEach {

    private Btree root;

    @Before
    public void createBtree(){
        root = createBtree(2);
        root.setLeft(createBtree(4));
        root.setRight(createBtree(7));
        root.getLeft().setLeft(createBtree(6));
        root.getLeft().setRight(createBtree(9));
    }
    private Btree createBtree(Integer value){
        Btree b = new Btree();
        b.setValue(value);
        b.setLeft(null);
        b.setRight(null);
        return b;
    }

    @Test
    public void midOrderForEach(){
        LinkedList<Btree> stack = new LinkedList<>();
        Btree p = root;
        while(!(stack.size() == 0 && p == null)) {
            while (p != null) {
                stack.push(p);
                p = p.getLeft();
            }
            Btree pop = stack.pop();
            System.out.println(pop.getValue());
            p = pop.getRight();
        }
    }
}
