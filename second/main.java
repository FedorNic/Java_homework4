package second;

import java.util.*;

import static java.lang.Thread.sleep;

public class main {
    public static void main(String[] args) throws InterruptedException {
        List<Tasks> tasks = new ArrayList<>();
        Tasks passport = new Passport();
        Tasks inn = new Inn();
        Tasks snils = new Snils();
        Tasks driverlicense = new DriversLicense();
        Tasks attestat = new Attestat();
        Tasks registration = new Registration();
        tasks.add(passport);
        tasks.add(inn);
        tasks.add(snils);
        tasks.add(driverlicense);
        tasks.add(attestat);
        tasks.add(registration);

        // System.out.println("____________________________");
        // System.out.println("Список услуг МФЦ: " + tasks);   //

        Integer[] index = new Integer[tasks.size()];   // Создание рандомной очереди без повторов номеров
        for (int i = 0; i < index.length; i++){
             index[i] = i * 1;
        }
        List<Integer> ind = Arrays.asList(index);
        Collections.shuffle(ind);
        // System.out.println("Очередь без приоритета: " + ind);
        // System.out.println("____________________________");

        Queue<Tasks> q = new LinkedList<>();
        for (int i = 0; i < ind.size() - 1; i = i + 2) {      // Сравниваем пары
            if (tasks.get(ind.get(i)).priority() > tasks.get(ind.get(i + 1)).priority()) {
                q.add(tasks.get(ind.get(i)));
                q.add(tasks.get(ind.get(i + 1)));
            } else {
                q.add(tasks.get(ind.get(i + 1)));
                q.add(tasks.get(ind.get(i)));
            }
        }
        // System.out.println("Очередь с приоритетом: " + q);
        System.out.println("Доброе утро! Наш МФЦ начинает работу.");
            sleep(5000);
        Iterator<Tasks> it = q.iterator();  // Обход очереди с паузой между заданиями, пока не опустеет
        while (it.hasNext()) {
            System.out.print("Обрабатывается операция: " + it.next());
            it.remove();
            sleep(4000);
        }
        System.out.println("Что-то мы устали... На сегодня хватит =)");
    }
}