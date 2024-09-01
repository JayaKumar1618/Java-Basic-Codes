package jaya;

public class jk46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1=new String ("WELCOME");
int L,i;
char ch1;
String ch2;
L=S1.length();
for(i=0;i<L;i++)
{
	ch1=S1.charAt(i);
	ch2=S1.substring(0,i+1);
	System.out.println("cH1="+ch1+"ch2="+ch2);
}
System.out.println("");
for(i=L-1;i>=0L;i--)
{
	ch1=S1.charAt(i);
	ch2=S1.substring(0,i);
	System.out.println("cH1="+ch1+"ch2="+ch2);
}

}
	}


