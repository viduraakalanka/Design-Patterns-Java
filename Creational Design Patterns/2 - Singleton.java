public class PrintSpooler{

	private static PrintSpooler spooler_inst; //this is the only instance of this class
	private static boolean initialized = false;

	private PrintSpooler(){} //this is a private constructor which can only be instantiated from within the class

	private void init(){
		//code to initialize the print spooler  goes here

	}

	public static PrintSpooler getInstance(){
		if (initialized) return spooler_inst;
		spooler_inst = new PrintSpooler();
		spooler_inst.init();
		initialized = True
		return spooler_inst
	}
}