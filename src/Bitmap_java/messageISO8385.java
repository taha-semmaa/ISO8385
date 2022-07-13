package Bitmap_java;

import java.util.Scanner;

public class messageISO8385 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dataElementName="";
		String format="";
		String attribute="";
		String source="";
		String code="";
		int mti;
		typeMessage TM;
		MessageTypeDescription MTD;
		AttributesLength ATL;
		Attribute A;
		Scanner src1=new Scanner(System.in);
		Scanner src2=new Scanner(System.in);
		Scanner src3=new Scanner(System.in);
		Scanner src4=new Scanner(System.in);
		Scanner src5=new Scanner(System.in);
		Scanner src6=new Scanner(System.in);
		System.out.println("***********************************************");
		System.out.print(" enter the name of the data elemnt :");
		dataElementName=src1.nextLine();
		System.out.println("***********************************************");
		System.out.print("enter the format of the data element :");
		format=src2.nextLine();
		System.out.println("***********************************************");
		System.out.print("enter the attribute of the data element :");
		attribute=src3.nextLine();
		System.out.println("***********************************************");
		System.out.print("enter the MTI :");
		mti=src4.nextInt();
		System.out.println("***********************************************");
		System.out.print("enter the source of the data element :");
		source=src5.nextLine();
		System.out.println("***********************************************");
		System.out.print("enter the code :");
		code=src6.nextLine();
		System.out.println("***********************************************");
		TM=new typeMessage(mti,source);
		ATL=new AttributesLength(format);
		A=new Attribute(attribute);
		MTD=new MessageTypeDescription (code);
		System.out.println("***********************************************");
		System.out.println(dataElementName);
		System.out.println(ATL.toString());
		System.out.println(A.toString());
		System.out.println(TM.toString());


	}

}
