import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[][] MyTovar = {{"Апельсин", "20"}, {"Мандарин", "30"}, {"Киви", "50"}};
        System.out.println("Введите день недели");
        Scanner Vvod = new Scanner(System.in);
        String slovo = Vvod.nextLine();
        if (slovo.equals("Понедельник")) {
            Integer i = 0;
            while (i < MyTovar.length) {
                System.out.println(MyTovar[i][0] + " " + MyTovar[i][1]);
                int num = Integer.parseInt(MyTovar[i][1]);
                double newprice = num - num * 0.15;
                String newprice2 = String.valueOf(newprice);
                MyTovar[i][1] = newprice2;
                System.out.println("Цена со скидкой 15% равна  " + MyTovar[i][1]);
                i++;
            }
        }
        else {
            if (slovo.equals("Среда")) {
                Integer i = 0;
                while (i < MyTovar.length) {
                    System.out.println(MyTovar[i][0] + " " + MyTovar[i][1]);
                    int num = Integer.parseInt(MyTovar[i][1]);
                    double newprice = num - num * 0.25;
                    String newprice2 = String.valueOf(newprice);
                    MyTovar[i][1] = newprice2;
                    System.out.println("Цена со скидкой 25% равна " + MyTovar[i][1]);
                    i++;
                }
            } else {
                Integer i = 0;
                while (i < MyTovar.length) {
                    System.out.println("День без скидкок " + MyTovar[i][0] + " " + MyTovar[i][1]);
                    i++;
                }
            }
        }
    }
}













