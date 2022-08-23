public class Rectangle {
    private float length = 1.0f;
    private float width  = 1.0f;
    public  Rectangle(){


    }
    public  Rectangle(float length,float width){
        this.length=length;
        this.width=width;

    }
    public float getLength(){
        return this.length;
    }

    public void setLength(float length){

        this.length=length;
    }
    public float getWidth(){
        return this.width;

    }

    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return 2*(this.length*this.width);
    }

    @Override
    public String toString() {
        return "length=" + length +
                ", width=" + width ;
    }
}
