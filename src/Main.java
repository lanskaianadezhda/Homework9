public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача 1");

        int[] expenses = {15125, 10123, 5687, 13444, 8936};
        int total = 0;
        for (int totalAll : expenses) {
            total += totalAll;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        //task 2
        System.out.println("Задача 2");

        int[] expenses1 = {10088, 8026, 3000, 12325, 5828};
        int min = expenses1[0];
        int max = expenses1[0];
        for (int totalall1 : expenses1) {
            if (totalall1 < min) {
                min = totalall1;
            }
            if (totalall1 > max) {
                max = totalall1;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max);

        //task3
        System.out.println("Задача 3");

        int[] expenses2 = {1000, 802, 350, 1235, 828};
        int total1 = 0;
        for (int totalAll2 : expenses2) {
            total1 += totalAll2;
        }
        int average = total1 / expenses2.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рубля");

        //task4
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}