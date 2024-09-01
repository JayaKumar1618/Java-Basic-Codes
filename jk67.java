package jaya;

public class jk67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int invalid =0;
for(int i=0;1<args.length;i++)
{
	try
	{
		sum+=Integer.parseInt(args[i]);
	}
	catch(NumberFormatException e)
	{
		invalid++;
	}
}
System.out.println("Total no of arguments :"+args.length);
System.out.println("Invalid Integer")

	}

}
