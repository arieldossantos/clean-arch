package io.github.arieldossantos.arch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
public final class UserEntity {
    private UUID id;
    private String name;
    private String email;

}
