package program.service;

import java.util.Scanner;

/**
 * Created by Admin on 19.11.2017.
 */
public class CmdLineService {
    private Scanner command = new Scanner(System.in);
    public void showMenu(){
        System.out.println("1. Создать клиента");
        System.out.println("2. Изменить клиента");
        System.out.println("3. Удалить клиента");
        System.out.println("4. Выход");
    }
    public int readCommand() {
        return command.nextInt();
    }
}
