package javax.ejb;

/**
 * This exception indicates that the transaction associated with processing
 * of the request has been rolled back, or marked to roll back. Thus the
 * requested operation either could not be performed or was not performed
 * because further computation on behalf of the transaction would be fruitless.
 * 
 * @version $Revision$
 */
public class EJBTransactionRolledbackException extends EJBException {

  /**
   * Constructs a TransactionRolledbackLocalException with no detail message.
   */
  public EJBTransactionRolledbackException() {
    super();
  }

  /**
   * Constructs a TransactionRolledbackLocalException with the specified detailed message.
   *
   * @param message - The detailed message.
   */
  public EJBTransactionRolledbackException(String message) {
    super(message);
  }

  /**
   * Constructs a TransactionRolledbackLocalException with the specified detail
   * message and a nested exception.
   *
   * @param message - The detailed message.
   * @param ex - The originally thrown exception.
   */
  public EJBTransactionRolledbackException(String message,Exception ex) {
    super(message,ex);
  }
}
