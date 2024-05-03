import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Graveyard graveyard = new Graveyard();
        graveyard.VVodTRupa();

        System.out.print("Введите имя посетителя могилы: ");
        String visitorName = scanner.nextLine();
        graveyard.posetilMogilu(visitorName);

        System.out.print("Введите номер ряда могилы: ");
        int row = scanner.nextInt();
        System.out.print("Введите номер колонки могилы: ");
        int column = scanner.nextInt();
        String graveLocation = graveyard.getGraveLocation(row, column);
        System.out.println(graveLocation);

        scanner.nextLine(); // Чтение символа новой строки после nextInt

        System.out.print("Введите цвет цветов для посадки на могилах: ");
        String flowerColor = scanner.nextLine();
        graveyard.plantFlowers(flowerColor);

        Cemetery cemetery = new Cemetery();
        int numberOfDead = cemetery.getNumberOfDeadLeaving();
        System.out.println("Количество мертвых, выходящих с кладбища: " + numberOfDead);

        String selectedCharacter = "Маг"; // Здесь можно выбрать нужного персонажа
        cemetery.openPortalToAfterlife(selectedCharacter);

        scanner.close();
    }
}

class Graveyard {

    public void VVodTRupa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя трупа:");
        String name = scanner.nextLine();

        System.out.println("Введите фамилию трупа:");
        String surname = scanner.nextLine();

        System.out.println("Введите отчество трупа:");
        String patronymic = scanner.nextLine();

        System.out.println("Выберите тип могилы: 1 - Футбольная могила, 2 - Игровая могила, 3 - Волшебная могила, 4 - Глубокие могилы");
        int graveType = Integer.parseInt(scanner.nextLine());

        switch (graveType) {
            case 1:
                sendToGrave(name, surname, patronymic, "Футбольная могила");
                break;
            case 2:
                sendToGrave(name, surname, patronymic, "Игровая могила");
                break;
            case 3:
                sendToGrave(name, surname, patronymic, "Волшебная могила");
                break;
            case 4:
                sendToGrave(name, surname, patronymic, "Глубокие могилы");
                break;
            default:
                System.out.println("Неверный выбор типа могилы.");
        }
    }

    private void sendToGrave(String name, String surname, String patronymic, String graveType) {
        System.out.println("Отправляем " + name + " " + surname + " " + patronymic + " на " + graveType + "...");
        // Здесь можно добавить дополнительные действия, например, помещение усопшего в выбранную могилу.
        System.out.println("Усопший успешно помещен на " + graveType + ".");
    }

    public void posetilMogilu(String name) {
        System.out.println("Посетил могилу - " + name);
    }

    public String getGraveLocation(int row, int column) {
        return "Ряд " + row + ", Колонка " + column;
    }

    public void plantFlowers(String color) {
        System.out.println("Посадка цветов цвета " + color + " на могилах.");
    }
}

class Cemetery {

    public int getNumberOfDeadLeaving() {
        Random random = new Random();
        return random.nextInt(100); // Генерируем случайное число от 0 до 99
    }

    public void openPortalToAfterlife(String character) {
        System.out.println(character + " открывает портал в загробный мир...");
        // Здесь могут быть дополнительные действия, например, создание эффекта анимации открытия портала.
        System.out.println("Портал открыт! Добро пожаловать в загробный мир!");
    }
}
