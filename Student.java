import java.util.Scanner;

interface FY
{
	void AcceptFYData();
	void ShowFYData();
}

interface SY
{
	void AcceptSYData();
	void ShowSYData();
}

class Student implements FY, SY
{
	String fyName;
	int fyRollNo;
	float fyResult;

	String syName;
	int syRollNo;
	float syResult;

	Scanner sc = new Scanner(System.in);

	public void AcceptFYData()
	{
		System.out.print("Enter the FY name: ");
		fyName = sc.nextLine();
		System.out.print("Enter the FY roll number: ");
		fyRollNo = sc.nextInt();
		System.out.print("Enter the FY result: ");
		fyResult = sc.nextFloat();
		sc.nextLine();
	}

	public void AcceptSYData()
	{
		System.out.print("Enter the SY name: ");
		syName = sc.nextLine();
		System.out.print("Enter the SY roll number: ");
		syRollNo = sc.nextInt();
		System.out.print("Enter the SY result: ");
		syResult = sc.nextFloat();
		System.out.println();
	}

	public void ShowFYData()
	{
		System.out.println("FY Data: ");
		System.out.println("FY name: %s".formatted(fyName));
		System.out.println("FY roll number: %d".formatted(fyRollNo));
		System.out.println("FY result: %f".formatted(fyResult));
	}

	public void ShowSYData()
	{
		System.out.println("SY Data: ");
		System.out.println("SY name: %s".formatted(syName));
		System.out.println("SY roll number: %d".formatted(syRollNo));
		System.out.println("SY result: %f".formatted(syResult));
	}

	public static void main(String[] args)
	{
		Student s = new Student();

		s.AcceptFYData();
		s.AcceptSYData();

		s.ShowFYData();
		s.ShowSYData();
	}
}
