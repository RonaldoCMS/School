package Library.srcLibrary.Libreria;

public class Book {

	private String title;
	private boolean isBusy;
	
	public Book(String title) {
		this.title = title;
		isBusy = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isBusy() {
		return isBusy;
	}

	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}
	
}
