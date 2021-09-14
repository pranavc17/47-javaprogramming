class ComplexNum1{
	
	int real;
	int img;
	
	ComplexNum1(int real, int img)
	{
		this.real=real;
		this.img=img;
	}
	
	void sum(ComplexNum1 c1, ComplexNum1 c2)
	{
		int sum_real=c1.real+c2.real;
		int sum_img=c1.img+c2.img;
		
		System.out.println("Sum of "+c1.real+"+"+c1.img+"i"+" & "+c2.real+"+"+c2.img+"i"+" is:");
		
		System.out.println(sum_real+"+"+sum_img+"i");
	}
}

public class Complx {
	public static void main(String[] args) {
		
		ComplexNum1 c1=new ComplexNum1(3,4);
		ComplexNum1 c2=new ComplexNum1(5,2);
		
		c1.sum(c1, c2);
		
		
	}

}