public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18 или больше, он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }


        int temperature = 3;
        if (temperature <= 5) {
            System.out.println("На улице меньше 5 градусов, нужно надеть шапку");
        }
        int temperature1 = 7;
        if (temperature1 > 5) {
            System.out.println("На улице выше 5 градусов, можно идти без шапки");
        }


        int speed = 60;
        if (speed < 61) {
            System.out.println("Если скорость меньше 61, то можно ездить спокойно");
        }
        int speed1 = 160;
        if (speed1 >= 61) {
            System.out.println("Если скорость больше 61, придется заплатить штраф ");
        }


        int humanAge = 24;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + " лет, то ему нужно ходить в детский сад ");
        } else if (humanAge >= 7 && humanAge <= 18) {
            System.out.println("Если возраст человека равен " + humanAge + " то ему пора ходить в школу ");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + " то его место в университете");
        } else if (humanAge > 24) {
            System.out.println(" Если возраст человека равен " + humanAge + " то ему пора ходить на работу ");
        }

        int ageChild = 8;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " то он не может кататься на аттракционе ");
        } else {
            System.out.println("Ребенок может кататься со взрослым ");
        }
        if (ageChild > 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему можно кататься на аттракционе в сопровождении взрослого ");
        } else {
            System.out.println(" Если возраст ребенка равен " + ageChild + " то он не может кататься на аттракционе ");
        }
        if (ageChild > 14) {
            System.out.println(" Если возраст ребенка равен " + ageChild + " то он может кататься без сопровождения ");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }


        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = capacity - seatPlace;
        System.out.println("Стоячих мест в вагоне " + "capacity - seatPlace = " + standingPlace);
        int occupiedStandingPlaces = 33;
        System.out.println("Стоячих мест занято " + occupiedStandingPlaces);
        int occupiedSeat = 48;
        System.out.println("Сидячих мест занято " + occupiedSeat);
        if (standingPlace > occupiedStandingPlaces) {System.out.println("Осталось еще " + ( standingPlace - occupiedStandingPlaces )  + " стоячих мест ");
        } else {System.out.println("Стоячих мест нет ");
        }
        if (seatPlace > occupiedSeat) {System.out.println("Осталось еще " + (seatPlace - occupiedSeat) + " сидячих мест " );
        } else {System.out.println("Сидячих мест нет ");
        }


        int one = 17;
        int two = 54;
        int three = 67;
        if (one > two) {System.out.println("Самое большое число " + one);
        } else {System.out.println("Самое большое число " + two);
        }
        if (one > three) {System.out.println("Самое бльшое число " + one);
        } else {System.out.println("Самое большое число " + three);
        }
        if (two > one) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println("Самое большое число " + one);
        }
        if (two > three) {
            System.out.println("Самое большое число " + two);
        } else {System.out.println("Самое большое число " + three);
        }
        if (three > one) {
            System.out.println("Самое большое число " + three);
        } else {
            System.out.println("Самое большое число " + one);
        }

    }
}
