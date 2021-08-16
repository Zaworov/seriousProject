package pl.zaworov.qualifiers;

import jakarta.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Target({ TYPE, METHOD, PARAMETER, FIELD })
@Retention(RUNTIME)
public @interface Message {

    MessageType type() default MessageType.SIMPLE;

    enum MessageType {
        SIMPLE, FILE;
    }
}