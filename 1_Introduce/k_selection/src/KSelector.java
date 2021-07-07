import java.util.ArrayList;

public class KSelector
{
	@SuppressWarnings("unchecked")
	public static <DataType extends Comparable> DataType sort_select(ArrayList<DataType> array, int k)
	{
		ArrayList<DataType> local_array = (ArrayList<DataType>)(array.clone());
		bubble_sort(local_array, 0, local_array.size());
		return local_array.get(k);
	}

	@SuppressWarnings("unchecked")
	public static <DataType extends Comparable> DataType sort_select2(ArrayList<DataType> array, int k)
	{
		ArrayList<DataType> local_array = (ArrayList<DataType>)(array.clone());
		bubble_sort(local_array, 0, k+1);
		for(int i = k+1; i < local_array.size(); i++)
		{
			for(int j = 0; j <= k; j++)
			{
				if(local_array.get(i).compareTo(local_array.get(j)) > 0)
				{
					for(int l = k; l >= j+1; l--)
					{
						local_array.set(l, local_array.get(l-1));
					}
					local_array.set(j, local_array.get(i));
					break;
				}
			}
		}

		return local_array.get(k);
	}

	@SuppressWarnings("unchecked")
	public static <DataType extends Comparable> void bubble_sort(ArrayList<DataType> array, int begin, int end)
	{
		for(int i = end-2; i >= begin; i--)
		{
			for(int j = begin; j <= i; j++)
			{
				if(array.get(j).compareTo(array.get(j+1)) < 0)
				{
					DataType temp = array.get(j);
					array.set(j, array.get(j+1));
					array.set(j+1, temp);
				}
			}
		}
	}
}