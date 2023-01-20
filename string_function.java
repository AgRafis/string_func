public class string_function {
    public static void main(String[] args) {
        String abc = "I like Java!!!";
        // Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith()
        System.out.println(abc.startsWith("I like"));
        // Найти позицию подстроки “Java” в строке “I like Java!!!”
        System.out.println(abc.indexOf("Java"));
        // Заменить все символы “а” на “о”
        System.out.println(abc.replace("a", "o"));
        // Преобразуйте строку к верхнему регистру
        System.out.println(abc.toUpperCase());
        // Преобразуйте строку к нижнему регистру
        System.out.println(abc.toLowerCase());
        // Вырезать строку Java c помощью метода String.substring()
        String newString = abc.substring(abc.indexOf("Java"));
        System.out.println(newString.substring(0, newString.indexOf("!!!")));
    }
}

