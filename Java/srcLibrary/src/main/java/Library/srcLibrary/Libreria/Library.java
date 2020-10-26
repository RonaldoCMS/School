package Library.srcLibrary.Libreria;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * 
• Un costruttore senza argomenti che crea una biblioteca vuota.

• Il metodo addBook aggiunge un libro alla biblioteca. Se il libro era già stato aggiunto,
restituisce false.

• Il metodo loanBook prende un libro come argomento e lo dà in prestito, a patto che sia
disponibile. Se quel libro è già in prestito, restituisce false. Se quel libro non è mai stato
inserito nella biblioteca, lancia un'eccezione.

• Il metodo returnBook prende un libro come argomento e restituisce quel libro alla biblioteca.
Se quel libro non era stato prestato col metodo loanBook, il metodo returnBook lancia
un'eccezione.

• Il metodo printLoans stampa la lista dei libri attualmente in prestito, in ordine temporale
(a partire dal libro in prestito da più tempo).
 */

public class Library {

	private List<Book> books;
	
	public Library() {
		books = new LinkedList<Book>();
	}
	
	public void addBook(Book book) {
		
	}
	
}
