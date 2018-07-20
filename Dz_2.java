package ru.geekbrains.java1.dz_Enver_Eskendarov.dz2;

  public class Dz_2 {

    public static void main(String args[]) {
          task1();
          task2();
          task3();
          task4();
          task5();
    }

      private static void task1() {
          int[] arr1 = new int[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0};
          for (int i : arr1) {
              System.out.print(i + "\t");
              if (i == 0)
                  i = 1;
              else i = 0;
              System.out.println(i);
          }
          System.out.println();

      }  // Вывод инвертированых значений

      private static void task2() {

          int[] arr = new int[8];

          for (int j = 0, i = 0; i < arr.length; i++, j++) {

              System.out.print((arr[i] = j * 3) + " |");
          }
          System.out.println("\n");
      }  // Вывод массива с возрастанием значения на 3

      private static void task3() {

          int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

          for (int i : arr) {

              System.out.print(i + "\t");
              if (i < 6) {
                  i *= 2;
              }
              System.out.println(i);
          }
      }  // Умножение значений меньше 6, на 2

      private static void task4() {

          int[][] arr = new int[7][7];

          for (int j = 0; j<7; j++) {
              System.out.println();
              for (int i=0; i<7; i++) {
                  arr[j][i]=0;
                  if ((j==i)||(j+i==6)) {
                      arr[j][i]=1;
                  }
                  System.out.print(arr[j][i] + " ");
              }
          }
      }  // Квадратный массив с единицами по диагоналям
                                         // полдня потратил на решение, воображение плохо развито.
      private static void task5() {

          int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            int min = arr[0], max = arr[0];
          for (int i : arr) {
              if (min>i) {
                  min=i;
              }
              if (max<i){
                  max=i;
              }
              }
          System.out.println("\nMin of array = " + min + "\nMax of array = " + max);
      }  // Вычислить мин. и макс. значения массива
  }