public class Book{

	private static Book book_inst; //this is the only instance of this class
	private static boolean initialized = false;

	private Book(){} //this is a private constructor which can only be instantiated from within the class

	private void init(){
		//code to initialize the print spooler  goes here

	}

	public static synchronized Book getInstance(){ // synchronization prevent multiple treading creating seperate instances. 
												   // when a thread access this method, second thread cant access it while first thread unlocks the method
		if (initialized) return book_inst;
		book_inst = new Book();
		book_inst.init();
		initialized = True
		return book_inst
	}
}