package CustomInterface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited								//Now it will be available to subclass also  
@Retention(RetentionPolicy.RUNTIME) 	//used to specify to what level annotation will be available.
@Target(ElementType.METHOD) 			//used to specify at which type, the annotation is used.
@interface CustomInterface {
	
	int size() default 0;
	String name();

}
