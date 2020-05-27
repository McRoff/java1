public class lesson1 {
}
/* Задача 1 */
public static void main(String[] args) {

}

/* Задача 2 */
    public static void main(String[] args) {
        int = 1;
        byte = 2;
        short = 3;
        long = 4;
        float = 5.1f;
        double = 6.2d;
        char = 'abc';
        boolean = true/faulse;
    }

    /* Задача 3, здесь почему-то имя метода Идея не подсвечивает, и кнопки запуска метода нет */
    public static float main(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /* Задача 4, здесь непонятно, как записывать возвращение бул. результата, в шпаргалке написали вывод через sout, но в условии ведь вернуть */
    public static boolean main(int a, int b) {
        boolean bool = true;
        bool = 10<=a+b && a+b<=20;
        if (bool){
            return true;
        } else {
            return false;
        }
    }

/* Задача 5 */
public static void main(int a) {
if (a<0) {
    System.out.println("Число отрицательное");
    } else {
    System.out.println("Число положительное");
}
}

/* Задача 6 */
public static boolean main(int a) {
    boolean bool = a < 0;
    if (bool) {
        return true;
    } else {
        return false;
    }
}

    /* Задача 7, не понял условие, как в параметр метода вставлять переменную, которой еще нет? */
    public static void main(String name) {
        String name = "Petya";
        System.out.println("ПРивет, " + name + "!");
    }

   /* Задача 8, не силён в коду, как правильно это записать */
   public static void main(String[] args) {
       int a;
       int b=a%4; /*считаем остаток от деления на 4*/
       if (b==0 || a!=100){
           System.out.println("Год високосный");
       }
       /*else {
           System.out.println("Год невисокосный");
       }*/ // а про невисокосный не просили выводить

   }