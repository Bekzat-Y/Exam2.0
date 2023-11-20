package task1;

import java.util.Scanner;

public class BasicUserAccount2 { ;





        private static int MAX = 100;
        private static String[] names = new String[MAX];
        private static String[] numbers = new String[MAX];
        private static int numContacts = 0;

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            do {
    System.out.println("Выберите что хотите сделать ");
                System.out.println("1:addAccaunt 2:Update 3:deleteAcc");
    int selecteNum = scanner.nextInt();


    switch (selecteNum) {
        case 1:


            System.out.print("name: ");
            String nameLine = scanner.next();
            System.out.print("password");
            String number = scanner.next();

            addContact(nameLine, number);

            break;

        case 2:

            System.out.println("Введите user на который хотите обновить ");
            System.out.print("name: ");
            String nameLine2 = scanner.next();
            System.out.print("nomer: ");
            String number2 = scanner.next();
            viewContacts();
            System.out.println(numContacts);
            System.out.println("Выберите индекс котрый хотите обновить ");
            int indexNum2 = scanner.nextInt();
            updateContact(indexNum2, nameLine2, number2);
            break;
        case 3:
            System.out.println(numContacts);
            System.out.println("Выберите индекс который хотите удалить: ");
            int indexDelete = scanner.nextInt();
            deleteContact(indexDelete);
            System.out.println("Индекс удален ");
            break;

        default:
    }
            }
            while (!quit);

        }





        public static void addContact( String name, String numContact) {

            if (numContacts < MAX) {
                names[numContacts] = name;
                numbers[numContacts] = numContact;
                numContacts++;
            }
        }

        public  static void viewContacts(){
            System.out.println("Ваши контакты:");
            for (int i = 0; i < numContacts; i++) {
                System.out.println("Имя: " + names[i]);
                System.out.println("Номер телефона: " + numbers[i]);
                System.out.println();
            }

        }

        public static void updateContact(int index, String name, String number){
            if (index > 0 && index < numContacts){
                names[index]=name;
                numbers[index]=number;
                System.out.println("Контакт по индексу "+index+" Обновлен ");
            }
            else
                System.out.println("недопустимый индекс."+index);
        }

        public static void deleteContact(int index){
            for (int i = 2; i < index;i--){
                if(index==numContacts){
                    System.out.println("недопустимый индекс: ");
                }

            }
        }




}
