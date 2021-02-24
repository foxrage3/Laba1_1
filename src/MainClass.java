import java.util.Scanner;

class Sotrudnik {
    String fam, im, otch, doljnost;
    int oklad;
}

public class MainClass {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Введите кол-во сотрудников");
       int count = sc.nextInt();
       sc.nextLine();
       Sotrudnik[] sotr = new Sotrudnik[count];

       for ( int i = 0; i < count; i++){
           System.out.println("Введите информацию о " + (i + 1) + "сотруднике");
           sotr[i] = new Sotrudnik();
           System.out.println("Введите фамилию");
           sotr[i].fam = sc.nextLine();
           System.out.println("Введите имя");
           sotr[i].im = sc.nextLine();
           System.out.println("Введите отчество");
           sotr[i].otch = sc.nextLine();
           System.out.println("Введите должность");
           sotr[i].doljnost = sc.nextLine();
           System.out.println("Введите оклад");
           sotr[i].oklad = sc.nextInt();
           sc.nextLine();
       }

       System.out.println("\n Сотрудник фирмы: \n фам \t имя \t отч \t должность \t оклад ");
       for (Sotrudnik s:sotr){
           System.out.print(s.fam+ "\t"+s.im + "\t"+s.otch + "\t"+s.doljnost + "\t"+s.oklad + "\n");
       }
   }
}
