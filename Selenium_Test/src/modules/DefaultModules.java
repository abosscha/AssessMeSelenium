package modules;

public class DefaultModules {

	public static void waitForLoad(int miliSeconds) {
		try {
			Thread.sleep(miliSeconds);
		} catch (InterruptedException ie) {
		}
	}
}
