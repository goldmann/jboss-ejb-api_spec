//$Id$
//EJB Specification Copyright 2004 Sun Microsystems, Inc.
package javax.ejb;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;
import static javax.ejb.FetchType.*;

/**
 * @author Emmanuel Bernard
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
public @interface ManyToOne
{
   String targetEntity() default "";

   CascadeType[] cascade() default {};

   FetchType fetch() default EAGER;

   boolean optional() default true;

}
