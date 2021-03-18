package io.github.arieldossantos.arch.facade;

import io.github.arieldossantos.arch.entity.UserEntity;
import io.github.arieldossantos.arch.usecase.UserUseCase;

import java.util.UUID;

public class UserFacade {
    public UserEntity getFirstUser() {
        return new UserEntity(
                UUID.randomUUID(),
                "Ariel Zinho",
                "ariel@zinho.com"
        );
    }

    public void selectNumberOne() {
        new UserUseCase().doSomething();
    }
}
