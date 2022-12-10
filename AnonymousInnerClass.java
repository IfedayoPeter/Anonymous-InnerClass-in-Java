package anonymousinnerclass;

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Bicycle one = new MountainBike();
		one.applybreak();
		one.speedup();

//		creating an object for Bicycle interface with anonymous inner class
		Bicycle two = new Bicycle() {

			@Override
			public void speedup() {
				System.out.println("mountain bike will speedup");
			}

			@Override
			public void applybreak() {
				System.out.println("mountain bike will applybreak");
			}
		};
		two.applybreak();
		two.speedup();
	}

}
