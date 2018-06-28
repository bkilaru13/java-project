public class Rectangulator{
	public static void main(string[] args) {
		int length=integer.parseInt(args[0]);
		int width=integer.parseInt(args[1]);

		Rectangle myRectangle = new Rectangle(length, width);

		string output = string.format (“*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n”,myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());

system.out.println(output);

}

}
