package comp;


/*

Задача "Компьютер"

Что будете использовать: интерфейсы + ассоциация

#### Текст задачи:

Реализовать работу компьютера и монитора.

Сущности:

1) Computer:
    - свойство "name": название - String
    - свойство "Monitor": подключенный монитор (переменная-ссылка на Monitor)
    - метод "on": включить компьютер
    - метод "off": выключить компьютер

2) Monitor:
    - свойство "name": название

Под сущностью подразумевается важный смысловой объект, который участвует в задаче (интерфейс + классы-реализации, либо просто отдельный класс без интерфейса).


#### Условия

При включении или выключении компьютера:
- выводить в консоль: "Компьютер включился(выключился) *name*, используется монитор *name* "
- для Computer и Monitor должны быть созданы интерфейсы, т.к. это основные объекты бизнес-процессов

#### Запуск

В методе main создаем объекты:
- монитор Monitor, name = "Samsung"
- компьютер Computer, name = "MacBook"
- добавляем монитор в компьютер (с помощью сеттера или через конструктор) - таким образом MacBook будет содержать в себе MonitorSamsung
- вызываем метод включить и выключить у компьютера (должна вывестись информация в консоль согласно условиям задачи)

Для запуска проекта - правой кнопкой на файле, где есть метод main, затем Run

Пример вывода в консоль после выполнения программы:
```
Компьютер включился MacBook, используется монитор Samsung
Компьютер выключился MacBook, используется монитор Samsung
```




 */

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

    public static void main(String[] args) {

        // т.к. это JavaSE, а не веб приложение, приходится создавать контейнер вручную
        Weld weld = new Weld();

        // старутем контейнер
        WeldContainer container = weld.initialize(); // будет пытаться найти файл beans.xml и считать оттуда настройки, где искать классы - в итоге создаст контейнер
//        WeldContainer container = weld.beanClasses(Monitor.class, Computer.class).initialize(); // НЕ будет пытаться найти файл beans.xml, а создаст контейнер на основе переданных классов

        // получаем из контейнера объекты - для проверки
//        IMonitor monitor = container.select(Monitor.class).get();
//        IComputer comp = container.select(Computer.class).get();
        IComputer computer = container.select(Computer.class).get();
        IComputer computer1 = container.select(ComputerNew.class).get();

        System.out.println("computer1 = " + computer1.getMonitor());
        System.out.println("computer = " + computer.getMonitor());

        // проверяем, что они не пустые
//        System.out.println("monitor = " + monitor);
//        System.out.println("comp = " + comp.getMonitor()); // монитор внедряется с помощью DI

//        System.out.println("monitor = " + computer.getMonitor().getName());
//        System.out.println("monitor = " + computer1.getMonitor().getName()); // монитор внедряется с помощью DI

//        System.out.println("monitor = " + computer.getMouse());

        container.shutdown(); // завершаем контейнер


    }

}
