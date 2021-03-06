package bgu.spl.mics.application.passiveObjects;

/**
 * Passive data-object representing a information about a certain book in the inventory.
 * You must not alter any of the given public methods of this class.
 * <p>
 * You may add fields and methods to this class as you see fit (including public methods).
 */
public class BookInventoryInfo {

	private String title;
	private int amount;
	private int price;

	public BookInventoryInfo(String Title, int Amount, int Price)

	{
		this.title = Title;
		this.amount = Amount;
		this.price = Price;
	}

	/**
	 * Retrieves the title of this book.
	 * <p>
	 * @return The title of this book.
	 */
	public String getBookTitle() {
		return this.title;
	}
	/**
	 * Retrieves the amount of books of this type in the inventory.
	 * <p>
	 * @return amount of available books.
	 */
	public int getAmountInInventory() {
		return this.amount;
	}
	/**
	 * Retrieves the price for  book.
	 * <p>
	 * @return the price of the book.
	 */
	public int getPrice() {
		return this.price;
	}

	public void setAmount(int amount){
		this.amount = amount;
	}
}