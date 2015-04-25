public class TableTest
{
	public static void main(String[] args)
	{   
		for (int row = 2; row <= 5; row++) {
            System.out.println(row);
            	int gorilla;
            for (int column = 2; column <= 5; column++) {
                while (row < column ) {
                gorilla = column - row;
                }
                System.out.println(gorilla);
            }

        }
	}
}