package L01.InterfaceInJava;

public class Iphone implements Phone, IOS{

	@Override
	public String processor() {
		return "A15";
	}

	@Override
	public int spaceInGb() {
		return 256;
	}

	@Override
	public String airdrop() {
		return "copy and paste anywhere";
	} 
}
