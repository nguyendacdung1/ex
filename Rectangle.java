public class Rectangle {
    float length;
    float width;

    public Rectangle(){
        length=1.0f;
        width=1.0f;
    }
    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(4,5);
        System.out.println("S: " + R1.getArea());
        Rectangle R2 = new Rectangle();
        System.out.println("C: " + R2.getPerimeter());
        Rectangle R3 = new Rectangle();
        System.out.println("Width is: "+R3.getWidth());
    }
}

