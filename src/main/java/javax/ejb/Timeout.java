package javax.ejb;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Marks an ejbTimeout callback method:
 *    public void <METHOD>(Timer timer)
 * 
 * @author <a href="mailto:kabir.khan@jboss.org">Kabir Khan</a>
 * @version $Revision$
 */
@Target({METHOD}) @Retention(RUNTIME)
public @interface Timeout
{
}
