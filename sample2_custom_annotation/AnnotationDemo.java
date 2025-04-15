import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// 1. Define a custom annotation
@Retention(RetentionPolicy.RUNTIME) // Make the annotation available at runtime
@Target(ElementType.METHOD)        // Can only be applied to methods
@interface MyCustomAnnotation {
    String value() default "Default Value"; // Annotation element with a default value
    int priority() default 1;             // Another annotation element
}

class MyClass {

    // 2. Use the custom annotation on a method
    @MyCustomAnnotation(value = "Important Task", priority = 3)
    public void doSomethingImportant() {
        System.out.println("Doing something important!");
    }

    public void doSomethingElse() {
        System.out.println("Doing something else.");
    }
}

public class AnnotationDemo {

    public static void main(String[] args) throws NoSuchMethodException {
        MyClass myObject = new MyClass();
        Class<?> clazz = myObject.getClass();
        Method importantMethod = clazz.getMethod("doSomethingImportant");
        Method otherMethod = clazz.getMethod("doSomethingElse");

        // 3. Check if the annotation is present on the method
        if (importantMethod.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = importantMethod.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Found MyCustomAnnotation on doSomethingImportant:");
            System.out.println("  Value: " + annotation.value());
            System.out.println("  Priority: " + annotation.priority());
            // You could now perform specific actions based on the annotation's values
        } else {
            System.out.println("MyCustomAnnotation not found on doSomethingImportant.");
        }

        if (otherMethod.isAnnotationPresent(MyCustomAnnotation.class)) {
            System.out.println("MyCustomAnnotation found on doSomethingElse.");
        } else {
            System.out.println("MyCustomAnnotation not found on doSomethingElse.");
        }
    }
}
