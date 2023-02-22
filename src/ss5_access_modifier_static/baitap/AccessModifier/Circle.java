package ss5_access_modifier_static.baitap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
