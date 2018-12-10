
package hellospring;

public class Rectangle extends Shape2D
{
    @Override
    public int getPerimeter()
    {
        return 2 * (height + width); 
    }
    
    @Override
    public int getArea()
    {
        return height * width;
    }
    
    @Override
    public void setWidth(int w)
    {
        width = w;
    }
    
    @Override
    public void setHeight(int h)
    {
        height = h;
    }
}
