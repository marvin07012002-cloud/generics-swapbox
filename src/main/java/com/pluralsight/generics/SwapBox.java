package com.pluralsight.generics;

public class SwapBox<T> {
    private T leftItem;
    private T rightItem;

    public SwapBox(T leftItem, T rightItem) {
        this.leftItem = leftItem;
        this.rightItem = rightItem;
    }

    public T getLeftItem() {
        return leftItem;
    }

    public T getRightItem() {
        return rightItem;
    }

    public void setLeftItem(T leftItem) {
        this.leftItem = leftItem;
    }

    public void setRightItem(T rightItem) {
        this.rightItem = rightItem;
    }

    public void swap (){
        T tempItem = leftItem;
        rightItem = leftItem;
        leftItem = rightItem;
    }

    public String describe(){
        return "";
    }
}
