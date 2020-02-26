package eclipsetest;

public class BackgroundClass {

	public void startBGThread() {
Thread thread = new Thread (() -> {System.out.println("yo");});
	}
}
