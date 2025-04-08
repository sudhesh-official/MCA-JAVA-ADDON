package L03.NonStaticInnerClassInJava;

public class Shop {
	
	Lock lock = new Lock();
	
	public void shopStatus() {
		if(lock.isLocking()) {
			System.out.printf("Shop is closed");
		} else {
			System.out.printf("Shop is open");
		}
	}
	
	private class Lock {
		private boolean locking = false;

		public boolean isLocking() {
			return locking;
		}

		public void setLocking(boolean locking) {
			this.locking = locking;
		}

	}
	
}
