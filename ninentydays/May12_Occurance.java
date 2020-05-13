package selenium.ninentydays;

public class May12_Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="You have no choice other than following me!";
		int len =str.length();
		System.out.println(len);
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)=='o')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
