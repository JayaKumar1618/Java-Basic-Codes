package jaya;

public class jk66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total =0;
		float percentage;
		String grade;
		for(int i=2;i<args.length;i++)
		{
			try
			{
				String[] agrs = null;
				total+=Integer.parseInt(agrs[i]);
			}
			catch(NumberFormatException e)
			{
				System.out.println("INCORRECT DATA TYPE \n");
				System.out.println("INCORRECT MARKS:"+args[i]);
				
			}
		}
		percentage=(float)total/6.0f;
		if(percentage>=60.0)
			grade="I";
		else
			grade="II";
		System.out.println("Name :"+args[0]);
		System.out.println("Roll no :"+args[1]);
		System.out.println("Total mark :"+total);
		System.out.println("% :"+percentage);
		System.out.println("class :"+grade);
		
		

	}

}
