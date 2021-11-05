package ru.mirea.task15;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Task15
{
    public static List<String> replace(List<String> list, String old_str, String new_str)
    {
        String str = "";
        for (int i = 0; i < list.size(); ++i)
        {
            if (i != list.size() - 1)
                str += list.get(i) + "\n";
            else
                str += list.get(i);
        }
        str = str.replaceFirst(old_str, new_str);
        list = Arrays.asList(str.split("\n"));

        return list;
    }

    public static void main(String[] args)
    {
        boolean go = true;
        int choice;
        Scanner sc = new Scanner(System.in);
        String data;
        String path = "./src/ru/mirea/task15/file.txt";
        while (go) {
            System.out.println("\n1) Перезаписать файл");
            System.out.println("2) Вывести файл");
            System.out.println("3) Заменить информацию в файле");
            System.out.println("4) Добавить в конец файла");
            System.out.println("0) Выход");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 0:
                {
                    go = false;
                    break;
                }
                case 1:
                {
                    try(FileWriter writer = new FileWriter(path, false))
                    {
                        System.out.print("Введите данные: ");
                        data = sc.nextLine();
                        writer.write(data);
                        writer.close();
                        System.out.println("Данные в файле.");
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 2:
                {
                    try(FileReader reader = new FileReader(path))
                    {
                        int c;
                        while((c=reader.read())!=-1){

                            System.out.print((char)c);
                        }
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 3:
                {
                    String new_data;
                    File file = new File(path);
                    List<String> lines;
                    try(FileReader reader = new FileReader(path))
                    {
                        lines = Files.readAllLines(file.toPath());
                        System.out.print("Введите данные для замены: ");
                        data = sc.nextLine();
                        System.out.print("Замена: ");
                        new_data = sc.nextLine();
                        lines = replace(lines, data, new_data);
                        Files.write(file.toPath(), lines);
                    }
                    catch(IOException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 4:
                {
                    try(FileWriter writer = new FileWriter(path, true))
                    {
                        System.out.print("Введите данные: ");
                        data = sc.nextLine();
                        writer.write(System.getProperty("line.separator") + data);
                        writer.close();
                        System.out.println("Данные записаны в конец файла.");
                    }
                    catch(IOException ex){

                        System.out.println(ex.getMessage());
                    }
                    break;
                }
            }
        }
    }
}
