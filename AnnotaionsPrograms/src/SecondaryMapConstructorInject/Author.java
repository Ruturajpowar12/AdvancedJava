package SecondaryMapConstructorInject;

public class Author {
	Integer authorId;
	String name;
	public Author(int authorId, String name) {
		super();
		this.authorId = authorId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "\nAuthor [authorId=" + authorId + ", name=" + name + "]";
	}
	
	
}
