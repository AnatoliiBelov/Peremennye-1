public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog - 3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();


        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        System.out.println();
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
        System.out.println();

        var weightFighter1=78.2;
        var weightFighter2=82.7;
        var totalWeight=weightFighter1+weightFighter2;
        System.out.println("Общий вес двух бойцов составляет "+totalWeight+" кг");
        var differenceInWeight=weightFighter2-weightFighter1;
        System.out.println("Разница в весе между 2мя бойцами составляет "+differenceInWeight+ " кг");
        var differenceInWeight2= weightFighter2%weightFighter1;
        System.out.println(differenceInWeight2);
        System.out.println();

        //Решите задачу с помощью функций сложения, вычитания, умножения и деления.
        //
        // 640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов в день, то сколько всего работников в компании?
        //Выведите результат задачи в консоль в формате "Всего работников в компании – … человек".
        //
        // Посчитайте сколько часов работы должно быть поделено между сотрудниками, если в компании работает на 94 человека больше. Выведите результат задачи в консоль в формате "Если в компании работает … человек, то всего … часов работы может быть поделено между сотрудниками".
        //Для решения этой задачи используйте var

        var totalWorkingHours=640;
        var workingHoursOfOneEmployee=8;
        var numberOfEmployees=totalWorkingHours/workingHoursOfOneEmployee;
        System.out.println("Всего работников в компании "+numberOfEmployees+" человек");
        numberOfEmployees=numberOfEmployees+94;
        totalWorkingHours=numberOfEmployees*workingHoursOfOneEmployee;
        System.out.println("Если в компании работает "+numberOfEmployees+" человек, то всего "+ totalWorkingHours+" часов работы может быть поделено между сотрудниками");







    }

}