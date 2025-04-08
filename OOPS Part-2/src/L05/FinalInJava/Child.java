package L05.FinalInJava;

public class Child extends Parent{
	
	public final int x;
	
	public Child() {
		this.x = 10;
	}

	public Child(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}
	
	@Override
	public void USA() {
		super.USA();
		System.out.println("USA is Fantastic!! with nice people");
	}

}
