//Interface Static

interface Drawable 
{
	void draw();
    static int cube(int x)
	{
		return x*x*x;
	}
}

class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
	static int cube(int x)
	{
		return x*x*x;
	}
}

class StaticInterface
{
	public static void main (String args[])
	{
		Drawable d = new Rectangle();
		d.draw();
		System.out.println(Drawable.cube(3));
		Rectangle r = new Rectangle();
		r.draw();
	}
}