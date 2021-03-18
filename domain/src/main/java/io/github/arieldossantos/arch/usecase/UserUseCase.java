package io.github.arieldossantos.arch.usecase;

import io.github.arieldossantos.arch.infra.falserm.DatabaseDAO;

public class UserUseCase {
    public void doSomething() {
        var dao = new DatabaseDAO();
        dao.executeSelect();
    }
}
