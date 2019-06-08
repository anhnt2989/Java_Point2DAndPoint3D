public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point2D() {
        this.x = 1.0f;
        this.y = 1.0f;
    }

    float getX() {
        return this.x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }

    void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float[] getXY() {
        float[] array = {getX(), getY()};
        return array;
    }

    @Override
    public String toString() {
        return "2D point with coordinates X,Y : "
                + "(" + getX()
                + ","
                + getY()
                + ")";
    }


}
