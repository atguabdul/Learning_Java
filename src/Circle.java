public class Circle {
    private double radius=1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return Math.PI*(radius*radius);
    }
    public double getCircumference(){
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "radius=" + radius;
    }
}
