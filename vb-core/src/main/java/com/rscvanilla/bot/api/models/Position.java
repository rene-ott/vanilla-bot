package com.rscvanilla.bot.api.models;

import java.util.Objects;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Position position) {
        var yDifference = position.getY() - getY();
        var xDifference = position.getX() - getX();

        return Math.sqrt(Math.pow(yDifference, 2) + Math.pow(xDifference, 2));
    }

    @Override
    public String toString() {
        return "("+x +", "+y+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Position position = (Position) o;
        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
