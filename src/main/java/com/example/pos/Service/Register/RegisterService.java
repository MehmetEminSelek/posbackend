package com.example.pos.Service.Register;

import com.example.pos.Request.Register.CreateCompanyRequest;
import com.example.pos.Request.Register.CreatePersonalInfoRequest;
import com.example.pos.Request.Register.CreateUserRequest;
import com.example.pos.Response.Register.CreateCompanyResponse;
import com.example.pos.Response.Register.CreatePersonalInfoResponse;
import com.example.pos.Response.Register.CreateUserResponse;

public interface RegisterService {

    CreateUserResponse createUser(CreateUserRequest createUserRequest);

    CreateCompanyResponse createCompany(CreateCompanyRequest createCompanyRequest);

    CreatePersonalInfoResponse createPersonalInfo(CreatePersonalInfoRequest createPersonalInfoRequest);
}
