package pack1;

public class Test {
	
	public class Selection {
		public static int[] selection(int[] arr) {
			//int result = 0;
			for(int i = 1; i < arr.length; i++) {
				for(int j = i; j > 0; j--) {
					if(arr[j] < arr[j - 1]) {
						int tmp = arr[j];
						arr[j] = arr[j - 1];
						arr[j - 1] = tmp;
					}
				}
			}
			return arr;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {4, 1, 5, 2, 3, 6};
        Selection.selection(arr1);
    }
}
