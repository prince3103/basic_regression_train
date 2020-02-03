package com.example.basic_regression_app;

public class Weights {
    private float w;
    private float b;
    private int iteration;

    Weights(float w, float b, int iteration){
        this.w = w;
        this.b = b;
        this.iteration = iteration;
    }

    public int getIteration() {return iteration;}

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

}
