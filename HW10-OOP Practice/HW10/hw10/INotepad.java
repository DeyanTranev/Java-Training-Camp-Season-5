package hw10;

public interface INotepad {
	void addTextToPage(String text, int pagenum);
	void replacePageText(String newText, int pagenum);
	void deletePageText(int pagenum);
	void showAllPages();
}
