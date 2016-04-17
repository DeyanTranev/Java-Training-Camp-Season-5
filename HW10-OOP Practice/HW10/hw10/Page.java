package hw10;

public class Page {
	private String title;
	private String textOnPage;
	private StringBuilder buffer;
	
	public Page(String title, String text) {
		// TODO Auto-generated constructor stub
		if (title != null) {
			this.title = title;
		}
		if (text!= null) {
			this.textOnPage = text;
			this.buffer = new StringBuilder(text);
		}
	}
	
	protected void addText(String text) {
		if (text != null) {
			this.buffer.append(text);
			this.textOnPage = buffer.toString();
		}
	}
	
	protected void clearPage() {
		this.textOnPage="";
		this.buffer.delete(0, buffer.length());
	}
	
	protected void viewPage() {
		System.out.println(this.title+"\n"+this.textOnPage);
	}

	protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		if (title != null) {
			this.title = title;
		}
	}

	protected String getTextOnPage() {
		return textOnPage;
	}

	protected void setTextOnPage(String newTextOnPage) {
		this.textOnPage+=newTextOnPage;
	}
}
