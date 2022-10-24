package CW_0310_Annotation;

import java.lang.annotation.Annotation;

@BaseAnno(200)
@BaseAnno(300)
@BaseAnno(400)
@NonRepeatableAnno(999)
@Controller

public class Main {
    public static void main(String[] args) {
        newMethod();
        System.out.print(aBoolean());
    }


    public static void newMethod() {
        Main m = new Main();
        try {
            Annotation[] array = m.getClass().getAnnotations();
            for (Annotation annotation : array
            ) {
                System.out.println(annotation);
            }
        } catch (Exception e) {
        }
    }

    public static boolean aBoolean(){
        return Main.class.isAnnotationPresent(Controller.class);
    }
}
