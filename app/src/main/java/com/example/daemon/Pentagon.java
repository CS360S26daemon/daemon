package com.example.daemon;

public class Pentagon extends Shape{
    private int length;

    public int getLength() {
        return length;
    }
    public void setLength(int len)
    {
        this.length=len;
    }
    public void description()
    {
        System.out.println("Pentagon with length " + length +
                ", with default shape properties  (" + x + "," + y + ")" +
                ", color: " + color);
    }

}
