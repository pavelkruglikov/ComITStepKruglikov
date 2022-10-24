package CW_0310_Annotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(AnnoWIthRepeat.class)
public @interface BaseAnno {

    int value();
}
