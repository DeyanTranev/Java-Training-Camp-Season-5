package hw10;

import java.util.Arrays;

public class SimpleNotepad implements INotepad{
	private Page[] pages;
	private int currentPageNum;
	private int freePages;
	
	public SimpleNotepad(int numberOfPages) {
		if (numberOfPages > 0) {
			this.pages = new Page[numberOfPages];
			for (int currentPageNum = 0; currentPageNum < pages.length; currentPageNum++) {
				this.pages[currentPageNum] = new Page("Page"+currentPageNum, (""));
				this.pages[currentPageNum].setTitle("Page"+currentPageNum);
				this.pages[currentPageNum].addText("");
			}
			this.freePages = pages.length;
		}
	}

	@Override
	public void addTextToPage(String text, int pagenum) {
		if (pagenum < this.pages.length) {
			if (text != null) {
				this.pages[pagenum].addText(text);
			}
		}
		
	}

	protected Page[] getPages() {
		return Arrays.copyOf(pages, pages.length);
	}

	@Override
	public void replacePageText(String newText, int pagenum) {
		// TODO Auto-generated method stub
		if(pagenum<this.pages.length) {
			this.pages[pagenum].clearPage();
			if (newText != null) {
				this.pages[pagenum].addText(newText);
			}
		}
		
	}

	@Override
	public void deletePageText(int pagenum) {
		if(pagenum < this.pages.length) {
			this.pages[pagenum].clearPage();
		}
		
	}

	@Override
	public void showAllPages() {
		for (int currentPageNum = 0; currentPageNum < pages.length; currentPageNum++) {
			this.pages[currentPageNum].viewPage();
		}
		
	}
}
