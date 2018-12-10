
package hellospring;

abstract class Shape2D 
{
    int height;
    int width;
    
    public abstract int getPerimeter();
    public abstract int getArea();
    public abstract void setWidth(int w);
    public abstract void setHeight(int h);
}