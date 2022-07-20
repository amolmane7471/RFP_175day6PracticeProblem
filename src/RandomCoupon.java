/*
 * Given N distinct Coupon Numbers, how many random numbers do you need to generate that distinct coupon number?
 */
public class RandomCoupon 
{
	public static void main(String[] args) 
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int random=(int) (Math.random()*100000000);	
		/*
		 * StringBuffer class creates a empty strings
		 * the append() method concatenates the given arguments with string
		 */
		StringBuffer sb=new StringBuffer();
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);	
	}
}
