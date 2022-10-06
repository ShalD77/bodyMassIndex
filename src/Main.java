public class Main {
    public static void main(String[] args) {
        double weight = 96;
        double height = 2.07;

        double bodyMassIndex;

        bodyMassIndex = weight / (height * height);
        System.out.println("Рассчет индекса массы тела для веса" + weight + "кг");
        System.out.println("При росте" + height + 'м');
        System.out.println("Равен" + bodyMassIndex);
    }
}