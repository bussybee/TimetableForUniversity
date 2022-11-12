import java.util.Scanner;

public class Menu {
    private void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.println("Выберите пункт меню: ");
    }

    private void start() {
        String[] options = {"Нажмите 1, если хотите узнать расписание на понедельник",
                            "Нажмите 2, если хотите узнать расписание на вторник",
                            "Нажмите 3, если хотите узнать расписание на среду",
                            "Нажмите 4, если хотите узнать расписание на четверг",
                            "Нажмите 5, если хотите узнать расписание на пятницу",
                            "Нажмите 6, если хотите узнать расписание на субботу"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер группы, расписание который вы хотите узнать: ");
        int group = scanner.nextInt();

        int option = 1;
        while (option != 4) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1: option1(); break;
                    case 2: option2(); break;
                    case 3: option3(); break;
                    case 4: option4(); break;
                    case 5: option5(); break;
                    case 6: option6(); break;
                }
            }
            catch (Exception ex){
                System.out.println("Пожалуйста, введите целочисленное значение от 1 до " + options.length);
                scanner.nextInt();
            }
        }
    }

}
