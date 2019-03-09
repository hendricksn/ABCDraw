package com.group.abcdraw.ui.shapes;

import com.badlogic.gdx.graphics.Color;

public class Line {
    float x1;
    float y1;
    float x2;
    float y2;
    Color color = Color.BLUE;

    public Line(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public float getY1() {
        return y1;
    }

    public float getX2() {
        return x2;
    }

    public float getY2() {
        return y2;
    }
}
