class Product1{
	int pcode;
	String pname;
	double price;
	
	
	Product1(int pcode, String pname,double price)
	{
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
		
		System.out.println("pcode="+pcode);
		System.out.println("pname="+pname);
		System.out.println("price="+price);
		System.out.println("\n");
		
	}
	
	double lowestprice(double p1, double p2,double p3) 
	{
		
		double temp=p1<p2?p1:p2;
		double low=p3<temp?p3:temp;
		
		return low;
	}
}


public class Program1 {
	public static void main(String[] args) {
		
		
		Product1 p1=new Product1(1001, "pulsar", 15000);
		Product1 p2=new Product1(1002, "avenger", 27000);
		Product1 p3=new Product1(1003, "dominor", 35000);
		
		
		double lowest=p1.lowestprice(p1.price,p2.price,p3.price);
		
		System.out.println("Lowest price="+lowest);
		
	}

}