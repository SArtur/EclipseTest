package eclipsetest;

public class BackgroundClass {

	public void startBGThread() {
Thread thread = new Thread (() -> {System.out.println("yo");});
	}
	
	public void coronaInfection (boolean infected) {
		if (infected) {
			Thread thread = new Thread(() -> {System.out.println("infection has started.");});
		} else {
			Thread thread = new Thread(() -> {System.out.println("No treatment needed.");});
		}
	}
	
	String conflictFunction (String s) {
		return s + "conf";
	}
	
	String conflictFunctionNoTwo (String s) {
		return s + "conf";
	}
}
