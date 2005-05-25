//$Id$
//EJB3 Specification Copyright 2004, 2005 Sun Microsystems, Inc.
package javax.persistence;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * @author Emmanuel Bernard
 */
@Target({TYPE, METHOD, FIELD}) @Retention(RUNTIME)
public @interface JoinColumn {
	String name() default "";
	String referencedColumnName() default "";
	boolean primaryKey() default false;
	boolean unique() default false;
	boolean nullable() default true;
	boolean insertable() default true;
	boolean updatable() default true;
	String columnDefinition() default "";
	String secondaryTable() default "";
}
