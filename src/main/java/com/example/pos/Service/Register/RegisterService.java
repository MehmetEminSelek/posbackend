package com.example.pos.Service.Register;

import com.example.pos.Request.Register.CreateUserRequest;
import com.example.pos.Response.Register.CreateUserResponse;

public interface RegisterService {

    CreateUserResponse createUser(CreateUserRequest createUserRequest);
}
