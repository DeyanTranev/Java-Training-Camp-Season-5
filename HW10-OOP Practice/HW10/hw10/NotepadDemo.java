package hw10;

public class NotepadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page page1 = new Page("Page1", "sample text");
		SimpleNotepad n1 = new SimpleNotepad(10);
		n1.addTextToPage("This is the test1 text on the first page", 0);
		n1.replacePageText("This is the test2 replace text", 0);
		n1.getPages()[0].viewPage();
		
		try {
			SecuredNotepad sn = new SecuredNotepad(10, "PasPhrase9");
			sn.showAllPages();
		} 
		catch (SecurityException ex) {
			
		}
		
		
		
	}

}
