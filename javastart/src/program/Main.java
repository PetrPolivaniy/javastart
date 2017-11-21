package program;

/**
 * Created by Admin on 19.11.2017.
 */

import program.service.ClientService;
import program.service.CmdLineService;
import program.service.impl.ClientServiceImpl;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientServiceImpl();
        CmdLineService cmdLineService = new CmdLineService();

        boolean isWork = true;
        do {
            cmdLineService.showMenu();
            int s = cmdLineService.readCommand();
            switch (s) {
                case 1:
                    clientService.addClient();
                    break;
                case 2:
                    clientService.removeClient();
                    break;
                case 4:
                    isWork = false;
                    break;
                default:
                    System.out.println("Неправильный ввод \n");
                    break;
            }
        }
        while (isWork);
    }
}

