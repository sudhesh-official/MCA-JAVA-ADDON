package L01.InterfaceInJava;

public class SamsungPhone implements Phone, Android{

	@Override
	public String whatsapp() {
		return "Send messages for free";
	}

	@Override
	public String processor() {
		return "SD1000";
	}

	@Override
	public int spaceInGb() {
		return 512;
	}

}
