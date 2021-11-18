# Students
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> boysAndGirls = new ArrayList<String>();
        boysAndGirls.add("Иван");
        boysAndGirls.add("Никита");
        boysAndGirls.add("Петя");
        boysAndGirls.add("Егор");
        boysAndGirls.add("Кирилл");
        boysAndGirls.add("Артем");
        boysAndGirls.add("Антон");
        boysAndGirls.add("Денис");
        boysAndGirls.add("Настя");
        boysAndGirls.add("Матвей");
        Scanner sc = new Scanner(System.in);
        Collections.shuffle(boysAndGirls);
        int index;
        String imput = "print";
        while (!imput.equals("exit")) {
            index = (int)Math.floor(Math.random() * boysAndGirls.size());
            System.out.println(boysAndGirls.get(index));
            System.out.print("как оценим? : ");
            imput = sc.next();
            if (imput.equals("print")) {
                System.out.println(boysAndGirls.toString());
            } else {
                boysAndGirls.set(index, boysAndGirls.get(index) + " " + imput);
            }
        }

    }
}
