package model.exceptions;

public class DomainException extends RuntimeException //ou Exception // 
 // porem o exception te obriga a propagar ou tratar e o Runtime n.
{
	private static final long serialVersionUID = 1L;

	public DomainException (String msg) {
		super(msg);
	}
	
}
