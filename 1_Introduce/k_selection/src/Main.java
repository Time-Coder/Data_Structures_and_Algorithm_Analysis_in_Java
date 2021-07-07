import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Double> array = new ArrayList<Double>(Arrays.asList(10.0, 2.9, 3.8, 4.8, 15.3, 3.9, 0.8));

		KSelector selector = new KSelector();
		System.out.println(selector.sort_select2(array, 6));
	}
}