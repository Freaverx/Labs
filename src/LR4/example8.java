package LR4;

import java.util.Scanner;
public class example8 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);



            System.out.println("Введите текст для шифрования:");

            String text = scanner.nextLine();



            System.out.println("Введите ключ:");

            int key = scanner.nextInt();



            String encryptedText = encrypt(text, key);

            System.out.println("Текст после преобразования: " + encryptedText);



            System.out.println("Выполнить обратное преобразование? (y/n)");

            char choice = scanner.next().charAt(0);

            if (choice == 'y') {

                String decryptedText = decrypt(encryptedText, key);

                System.out.println("Текст после обратного преобразования: " + decryptedText);

            } else {

                System.out.println("До свидания!");

            }

        }



        public static String encrypt(String text, int key) {

            StringBuilder result = new StringBuilder();



            for (char c : text.toCharArray()) {

                if (Character.isLetter(c)) {

                    char encryptedChar = (char) (((c - 'a') + key) % 26 + 'a');

                    result.append(encryptedChar);

                } else {

                    result.append(c);

                }

            }



            return result.toString();

        }



        public static String decrypt(String text, int key) {

            StringBuilder result = new StringBuilder();



            for (char c : text.toCharArray()) {

                if (Character.isLetter(c)) {

                    char decryptedChar = (char) (((c - 'a') - key + 26) % 26 + 'a');

                    result.append(decryptedChar);

                } else {

                    result.append(c);

                }

            }



            return result.toString();

        }

    }
