package System;

import System.Controller.PetController;
import System.Model.Pet;
import System.Services.IRepository;
import System.Services.PetRepository;
import System.UserInterface.ConsoleMenu;

public class Program {
    public static void main(String[] args) throws Exception {

        IRepository <Pet> myFarm = new PetRepository();
        PetController controller = new PetController(myFarm);
        new ConsoleMenu (controller).start();
    }
}    