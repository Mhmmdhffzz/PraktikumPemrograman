package praktikum5.soal1;

/**
 *
 * @author User
 */
public class Rectangle extends Shape {
    private double length;
        private double width;
//----------------------------------
// Constructor: Sets up the Rectangle.
//----------------------------------
public Rectangle(double l, double w)
{
super("Rectangle");
this.length  = l;
this.width = w;
}

//-----------------------------------------
// Returns the surface area of the sphere.
//-----------------------------------------
public double area()
{
return length*width;
}

public double getwidth(){
 return width;   
}

public void setWidth(double w){
    this.width=w;
    
}

public double getLength(){
    return length;
}

public void setLength(double l){
    this.length=l;
    
}
//-----------------------------------
// Returns the sphere as a String.
//-----------------------------------
public String toString()
{
return super.toString() + " of length " + length + " and width "+ width;
}
}

