package days10;

public class Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int [][][] m = new int [2][3][4];
		 * 
		 * dispArr(m);
		 */


		int [][][] m = 
			{     
					{ 
						{1,2,3, 4},
				        {5,6,7,8},
				        {9,10,11,12} 
				    }, 
					{
				    	{13,2,3, 4},
				       	{5,6,7,8},
					    {9,10,11,24}  
					}       
				};
		dispArr(m);
	}
	private static void dispArr(int[][][] m) {

		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(m[0][0].length);

		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {

				for(int k = 0; k < m[i][j].length; k++) {

					System.out.printf("m[%d][%d][%d] = %d ", i,j, k, m);
				}

			}
		}

	}

}
