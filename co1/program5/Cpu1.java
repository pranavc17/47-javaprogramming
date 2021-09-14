class CPU{
	int price=25000;
	
	class Processor{
		int no_of_cores=4;
		String manufacturer="Intel";
	}
	
	static class RAM{
		int memory=16;
		String manufacturer="Corsair";
	}
}

public class Cpu1 {
	
	public static void main(String[] args) {
		
		CPU cpu = new CPU();
        CPU.Processor pro = cpu.new Processor();
        CPU.RAM ram = new CPU.RAM();
        
        System.out.println("CPU price : " + cpu.price);       
        System.out.println("Number of core is  : " + pro.no_of_cores);
        System.out.println("Processor Manufacturer : " + pro.manufacturer);
        System.out.println("RAM Manufacturer : " + ram.manufacturer);
        System.out.println("RAM Size : " + ram.memory + " GB");
        
	}

}