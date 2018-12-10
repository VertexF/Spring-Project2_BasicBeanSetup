
package hellospring;

public class Square extends Shape2D
{   
    @Override
    public int getPerimeter()
    {
        return 4 * width; 
    }
    
    @Override
    public int getArea()
    {
        return width * width;
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
