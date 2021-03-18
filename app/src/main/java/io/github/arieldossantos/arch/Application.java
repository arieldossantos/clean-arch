package io.github.arieldossantos.arch;

import io.github.arieldossantos.arch.facade.UserFacade;

public class Application {
    public static void main(String[] args) {
        var userFacade = new UserFacade();
        System.out.println("Getting first user");
        System.out.println(userFacade.getFirstUser());
        System.out.println("----");
        System.out.println("Selecting on database");
        userFacade.selectNumberOne();

    }
}
