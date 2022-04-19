public class StringsAddTasks {
    public static void main(String[] args) {
// задание 5
        /*
Написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
         */
        System.out.println("\n*** Задание 5 \n");

        String fullName = "Петроченко Владимир Степанович";
        int a = fullName.indexOf(" ");
        int b = fullName.lastIndexOf(" ");
        char[] arrName = fullName.toCharArray();           // Создаем из строки массив
        for (int i = 0; i <= arrName.length; i++)          // Проходим по его елементам
            if (i == a) {                                  //Если индекс массива равен индексу первого пробела
                String firstName = fullName.substring(0, a);
                System.out.println(firstName);             //то выводим подстроку1
            } else if (i == b) {                           //Если индекс массива равен индексу последнего пробела
                String lastName = fullName.substring(a + 1, b);
                System.out.println(lastName);               //то выводим подстроку1
            } else if (i == arrName.length) {               //Если индекс массива равен его длине
                String middleName = fullName.substring(b + 1, arrName.length);
                System.out.println(middleName);              //то выводим подстроку3
            }

        System.out.println("\n*** Задание 6 \n");

// задание 6
/*
Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
 */
        fullName = "марков петр вахтангович";

        char[] fullNameChars = fullName.toCharArray();                    // создаем массив из строки
        for (int i = 0; i < fullNameChars.length; i++) {                 // проходим по элементам массива
            fullNameChars[0] = Character.toUpperCase(fullNameChars[0]);  // Первый элемент выводим в верхний регистр
            if (fullNameChars[i] == (' ')) {                            // если элемент == пробелу
                fullNameChars[i + 1] = Character.toUpperCase(fullNameChars[i + 1]); // то следующий элемент выводим в верхний
                // регистр

            }

        }
        System.out.println(fullNameChars);

        System.out.println("\n*** Задание 7 \n");
// задание 7
 /*
   Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
  */


        String firstLine = "135";
        String secondLine = "246";
        char[] fl = firstLine.toCharArray();          // создаем массив из строки
        char[] sl = secondLine.toCharArray();         // создаем массив из строки
        StringBuilder numLine = new StringBuilder();  // объявляем переменную  класса
        numLine.append(fl[0]);                        // добавляем в переменную элементы
        numLine.append(sl[0]);
        numLine.append(fl[1]);
        numLine.append(sl[1]);
        numLine.append(fl[2]);
        numLine.append(sl[2]);
        System.out.println(numLine);

        System.out.println("\n*** Задание 8 \n");
// задание 8
 /*
Дана строка из букв английского алфавита "aabccddefgghiijjkk".
Нужно найти и напечатать буквы, которые дублируются в строке.
Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
В итоге в консоль должен быть выведен результат программы: "acdgijk".
  */
        StringBuilder newLine = new StringBuilder();
        String doubleChars = "aabccddefgghiijjkk";
        char[] dCh = doubleChars.toCharArray();
        for (int i = 0; i < dCh.length; i++) {
            for (int j = i +1; j < dCh.length; j++) {

                if (dCh[j] == dCh[i]) {
                    newLine.append(dCh[i]);
                }
            }
        }
        System.out.println(newLine);
    }
}