// Octagon Class made by Umar Habib, 27100021

package com.example.daemon;

public class Octagon extends Shape {
    private int sideLength;

    public Octagon(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public int getPerimeter() {
        return 8 * sideLength;
    }

    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * (sideLength * sideLength);
    }
}
