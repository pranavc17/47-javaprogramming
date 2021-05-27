

public class Size {
	public static void main(String[] args) {
		
		int num=42;
		String size;
		
		switch(num)
		{
		case 29:size="Small";
		        break;
		case 42:size="Medium";
				break;
		case 44:size="Large";
				break;
		case 48:size="Extra Large";
				break;
		default:size="Unknown";
		}
		
		System.out.println(num+"-"+size);
		
    
	}

}
