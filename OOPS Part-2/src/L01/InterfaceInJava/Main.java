package L01.InterfaceInJava;

public class Main {

	public static void main(String[] args) {
		
		Iphone phone = new Iphone();
		String p = phone.processor();
		System.out.println(p);
		System.out.println(phone.spaceInGb());
		System.out.println(phone.airdrop());
	}

}
