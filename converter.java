import java.util.Scanner;
// написал программу на российских единицах измерения
public class converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("[1] - масса \n[2] - расстояние \n");
        System.out.println("Введите номер что переводить");
        int mass_distance = sc.nextInt();
        if (mass_distance == 1) {
            System.out.printf("[1] - тонна \n[2] - килограмм \n[3] - грамм \n");
            System.out.println("Введите номер единицы измерения");
            int unit1 = sc.nextInt();
            switch (unit1) {
                case 1:
                    System.out.println("Введите массу в тоннах");
                    double ton = sc.nextInt();
                    double a1 = massCalculation(ton);
                    System.out.println("Тонна: " + a1);
                    System.out.println("Килограмм: " + a1 * 1000);
                    System.out.println("Грамм: " + a1 * 1000000);
                    break;
                case 2:
                    System.out.println("Введите массу в килограммах");
                    int kg = sc.nextInt();
                    double a2 = massCalculation(kg);
                    System.out.println("Тонна: " + a2 / 1000);
                    System.out.println("Килограмм: " + a2);
                    System.out.println("Грамм: " + a2 * 1000);
                    break;
                case 3:
                    System.out.println("Введите массу в граммах");
                    int gr = sc.nextInt();
                    double a3 = massCalculation(gr);
                    System.out.println("Тонна: " + a3 / 1000000);
                    System.out.println("Килограмм: " + a3 / 1000);
                    System.out.println("Грамм: " + a3);
                    break;
                default:
                    System.out.println("Ввели некорректное число");
                    break;
            }
        }
        else if (mass_distance == 2) {
            System.out.printf("[1] - километр \n[2] - метр \n[3] - сантиметр \n");
            System.out.println("Введите номер единицы измерения");
            int unit2 = sc.nextInt();
            switch (unit2) {
                case 1:
                    System.out.println("Введите растояние в километрах");
                    double km = sc.nextInt();
                    double b1 = massCalculation(km);
                    System.out.println("Километр: " + b1);
                    System.out.println("Метр: " + b1 * 1000);
                    System.out.println("Сантиметр: " + b1 * 100000);
                    break;
                case 2:
                    System.out.println("Введите растояние в метрах");
                    double m = sc.nextInt();
                    double b2 = massCalculation(m);
                    System.out.println("Километр: " + b2 / 1000);
                    System.out.println("Метр: " + b2);
                    System.out.println("Сантиметр: " + b2 * 100);
                    break;
                case 3:
                    System.out.println("Введите растояние в сантиметрах");
                    double sm = sc.nextInt();
                    double b3 = massCalculation(sm);
                    System.out.println("Километр: " + b3 / 100000);
                    System.out.println("Метр: " + b3 / 1000);
                    System.out.println("Сантиметр: " + b3);
                    break;
                default:
                    System.out.println("Ввели некорректное число");
                    break;
            }


            sc.close();
        }
        else {
            System.out.println("Вы ввели некорректный номер");
        }
    }
    public static double massCalculation(double mass) {
        return (mass);
    }
}
