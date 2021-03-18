package io.github.arieldossantos.arch.repository;

import io.github.arieldossantos.arch.entity.UserEntity;

public interface UserRepository {
    UserEntity findById(int userId);
}
