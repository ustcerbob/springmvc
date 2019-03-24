package com.springmvc.test.btree;

public class Btree {
    private Btree left;
    private Btree right;
    private Integer value;

    public Btree getLeft() {
        return left;
    }

    public void setLeft(Btree left) {
        this.left = left;
    }

    public Btree getRight() {
        return right;
    }

    public void setRight(Btree right) {
        this.right = right;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
