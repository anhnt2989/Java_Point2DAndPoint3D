public class Point3D extends Point2D {
    float z = 0.0f;

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    Point3D() {
        super.x = 1.0f;
        super.y = 1.0f;
        this.z = 1.0f;
    }

    float getZ() {
        return this.z;
    }

    void setZ(float z) {
        this.z = z;
    }

    void setXYZ(float x, float y, float z) {
        super.x = x;
        super.y = y;
        this.z = z;
    }

    float[] getXYZ() {
        float[] array = {super.getX(), super.getY(), getZ()};
        return array;
    }

    @Override
    public String toString() {
        return "This is a 3D point with coordinates Z: "
                + getZ()
                + "\n which is a subclass of " + super.toString()
                + "\n so standard coordinates of this 3D point is: "
                + "("
                +super.getX()
                +","
                +super.getY()
                +","
                +getZ()
                +")";
    }
}
