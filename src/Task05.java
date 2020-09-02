import java.util.Scanner;

public class Task05 {

    public void playGame(int dragon, int attackDragon, int lanceKnight, int healsLanceKnight, int attackLanceKnight) {
        int count = 1;
        for (int i = 0; i < 5; i++) {


            System.out.println("Итерация " + count);
            count++;
            System.out.println("Копейщики атакуют " + "(" + (lanceKnight * attackLanceKnight) + ") - у дракона осталось "
                    + (dragon - (lanceKnight * attackLanceKnight)) + " жизней.");
            if ((attackDragon - (lanceKnight * healsLanceKnight)) % 10 == 0) {
                System.out.println("Дракон атакует – осталось " + (attackDragon - (lanceKnight * healsLanceKnight)) + " копейщиков ");
            } else System.out.println("Дракон атакует – осталось " + (attackDragon - (lanceKnight * healsLanceKnight)) + " копейщиков один из " +
                    "которых ранен\n" + "(осталось 5 жизней)");
        }

    }

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите здоровье дракона");
//        int dragon = in.nextInt();
//        System.out.println("Введите атаку дракона");
//        int attackDgaron = in.nextInt();
//        System.out.println("Введите здоровье одного копейщика");
//        int lanceKnight = in.nextInt();
//        System.out.println("Введите атаку одного копейщика");
//        int attackLanceKhight = in.nextInt();


        int dragon = 500;
        int attackDragon = 50;
        int lanceKnight = 20;
        int healsLanceKnight = 10;
        int attackLanceKnight = 10;

        Task05 play = new Task05();
        play.playGame(dragon,attackDragon,lanceKnight,healsLanceKnight,attackLanceKnight);

    }
}
