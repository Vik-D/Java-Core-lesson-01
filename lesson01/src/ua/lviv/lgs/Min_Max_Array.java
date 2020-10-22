package ua.lviv.lgs;

public class Min_Max_Array {
	public static void main(String args[]) {
		
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4;
		float e = 5.5F;
		double f = 6.6;
		char g = 'a';
		boolean h = true;
		
		System.out.println("����������� �������� byte = " + Byte.MAX_VALUE);
		System.out.println("̳������� �������� byte = " + Byte.MIN_VALUE);
		System.out.println("����������� �������� short = " + Short.MAX_VALUE);
		System.out.println("̳������� �������� short = " + Short.MIN_VALUE);
		System.out.println("����������� �������� int = " + Integer.MAX_VALUE);
		System.out.println("̳������� �������� int = " + Integer.MIN_VALUE);
		System.out.println("����������� �������� long = " + Long.MAX_VALUE);
		System.out.println("̳������� �������� long = " + Long.MIN_VALUE);
		System.out.println("����������� �������� float = " + Float.MAX_VALUE);
		System.out.println("̳������� �������� float = " + Float.MIN_VALUE);
		System.out.println("����������� �������� double = " + Double.MAX_VALUE);
		System.out.println("̳������� �������� double = " + Double.MIN_VALUE);
		
		System.out.println(" ");
		

		int MyArray[] = { 2, 34, 5, 18, 40, 543, 3, 98, 37, 20 };
		int max = MyArray[0];
		for (int i = 1; i < MyArray.length; i++) {
			if (max < MyArray[i]) {
				max = MyArray[i];
			}
		}
		System.out.println("����������� �������� � ����� � " + max);
		{
			int min = MyArray[0];
			for (int i = 1; i < MyArray.length; i++) {
				if (min > MyArray[i]) {
					min = MyArray[i];
				}
			}
			System.out.println("̳������� �������� � ����� � " + min);
		}
	}

}
