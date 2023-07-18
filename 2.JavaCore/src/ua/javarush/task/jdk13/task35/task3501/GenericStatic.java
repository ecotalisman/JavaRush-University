package ua.javarush.task.jdk13.task35.task3501;

    // It was condition:
//    public class GenericStatic {
//      public static Object someStaticMethod(Object genericObject) {
//        System.out.println(genericObject);
//        return genericObject;
//    }
//  }


    // Write code here:
    public class GenericStatic {
    public static <T> T someStaticMethod(T genericObject) {
        System.out.println(genericObject);
        return genericObject;
    }
}
