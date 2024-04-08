package com.nsgrigorjev.pp_2_4_1_springboot.mapper;

import com.nsgrigorjev.pp_2_4_1_springboot.database.entity.User;
import com.nsgrigorjev.pp_2_4_1_springboot.dto.UserCreationDto;
import com.nsgrigorjev.pp_2_4_1_springboot.dto.UserResponseDto;

public class UserMapper {

    public static UserResponseDto toDto(User entity) {
        return new UserResponseDto(
                entity.getId(),
                entity.getName(),
                entity.getLastname(),
                entity.getAge());
    }

    public static User toEntity(UserCreationDto dto) {
        return new User(dto.name(), dto.lastname(), dto.age());
    }

    public static User toEntity(UserResponseDto dto) {
        return new User(dto.id(),dto.name(), dto.lastname(), dto.age());
    }
}
