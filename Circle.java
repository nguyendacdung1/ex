public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public  Circle(double r){
        radius = r;
        color = "red";
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The Circle has radius of " + c1.getRadius() + "and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The Circle has radius of " + c2.getRadius() + "and area of " + c2.getArea());
        Circle c3 = new Circle();
        c3.setRadius(5.0);
        System.out.println("radius is: " + c3.getRadius());
        c3.setColor("blue");
        System.out.println("color is: " + c3.getColor());
    }
}
