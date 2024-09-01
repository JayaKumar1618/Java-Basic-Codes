package jaya;

class fivetable extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
			System.out.println(i+"fives are"+(i*5));
		
	}
}
	class seventable extends Thread
	{
		public void run()
		{
			for(int i=1;i<=50;i++)
				System.out.println(i+"seven are"+(i*7));
			
		}
	}
		class thirteentable extends Thread
		{
			public void run()
			{
				for(int i=1;i<=50;i++)
					System.out.println(i+"thirteen are"+(i*13));
				
			}
	
}

public class jk69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 fivetable five=new fivetable();
 seventable seven=new seventable();
 thirteentable thirteen=new thirteentable();
  five.start();
  seven.start();
  thirteen.start();
 

	}

}
