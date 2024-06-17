import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

       // Task 1
      System.out.println("Введите возраст человека:");
      int age = scan.nextInt();
      if(age >= 18){
          System.out.println(String.format("Если возраст человека равен %d, то он совершеннолетний.", age));
      }else{
          System.out.println(String.format("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно немного подождать.", age));
      }

        // Task 2
        System.out.println("Введите температуру воздуха на улице:");
        int temp = scan.nextInt();
        if(temp < 5){
            System.out.println(String.format("На улице %d градусов, нужно надеть шапку.", temp));
        }else{
            System.out.println(String.format("На улице %d градусов, можно идти без шапки.", temp));
        }

        // Task 3
        System.out.println("Введите скорость автомобиля:");
        int speed = scan.nextInt();
        if(speed > 60){
            System.out.println(String.format("Если скорость %d, то придется заплатить штраф.", speed));
        }else{
            System.out.println(String.format("Если скорость %d, то можно ездить спокойно.", speed));
        }

        // Task 4
        System.out.println("Введите возраст человека:");
        int ageOfHuman = scan.nextInt();
        if(ageOfHuman > 0 && ageOfHuman <= 116){
                System.out.print("Если возраст человека равен ");
                if (ageOfHuman < 2) {
                    System.out.print(ageOfHuman + " год(а), то ему пора спать.");
                } else if (ageOfHuman >= 2 && ageOfHuman < 7) {
                    System.out.print(ageOfHuman + " года (лет), то ему нужно ходить в детский сад.");
                } else if (ageOfHuman >= 7 && ageOfHuman < 18) {
                    System.out.print(ageOfHuman + " лет, то ему нужно ходить в школу.");
                } else if (ageOfHuman >= 18 && ageOfHuman < 24) {
                    System.out.print(ageOfHuman + " лет/год(а), то его место в университете.");
                } else if (ageOfHuman >= 24 && ageOfHuman < 60) {
                    System.out.print(ageOfHuman + " лет/год(а), то ему пора ходить на работу.");
                } else if (ageOfHuman >= 60 && ageOfHuman <= 116) {
                    System.out.print(ageOfHuman + " лет/год(а), то он может отдохнуть.");
                }
            }else {
             System.out.print("Возраст введён некорректно.");
            }

        // Task 5
        System.out.println("Введите возраст ребёнка:");
        int ageOfKid = scan.nextInt();
        if(ageOfKid > 0 && ageOfKid < 100){
            System.out.print("Если возраст ребёнка равен ");
            if (ageOfKid < 5) {
                System.out.print(ageOfKid + " год(а), то ему нельзя кататься на аттракционе.");
            } else if (ageOfKid >= 5 && ageOfKid < 14) {
                System.out.print(ageOfKid + " года (лет), то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else if (ageOfKid >= 14) {
                System.out.print(ageOfKid + " лет/год(а), то он может кататься без сопровождения взрослого.");
            }
        }else {
            System.out.print("Возраст введён некорректно.");
        }

        // Task 6

       int capacityOfTrainCarriage = 102;
       int countOfPlacesForSitting = 60;
       System.out.println("Введите количество человек в вагоне:");
       int numberOfPeopleInTheCarriage = scan.nextInt();
         if (numberOfPeopleInTheCarriage > 1) {
             if (numberOfPeopleInTheCarriage > capacityOfTrainCarriage) {
                 System.out.println("В вагоне нет свободных мест.");
             }else if(numberOfPeopleInTheCarriage > countOfPlacesForSitting){
                 System.out.println("В вагоне остались только стоячие места.");
             }else{
                 System.out.println("В вагоне есть сидячие места.");
             }
         }else{
             System.out.print("Количество введено некорректно.");
         }



        // Task 7
        System.out.println("Введите 3 числа: ");
        int one = scan.nextInt();
        int two = scan.nextInt();
        int three = scan.nextInt();
        int max;
        if (one > two && one > three){
                  max = one;
              }else if(two > one && two > three){
                  max = two;
              }else{
                  max = three;
              }
                System.out.println("Максимальное число: " + max);

                }
            }