package com.example.pos.Controller.Register;


import com.example.pos.Request.Register.CreateCompanyRequest;
import com.example.pos.Request.Register.CreatePersonalInfoRequest;
import com.example.pos.Request.Register.CreateUserRequest;
import com.example.pos.Response.Register.CreateCompanyResponse;
import com.example.pos.Response.Register.CreatePersonalInfoResponse;
import com.example.pos.Response.Register.CreateUserResponse;
import com.example.pos.Service.Register.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/register")
@CrossOrigin(origins = {"*"})
@RequiredArgsConstructor
public class RegisterController {

    private final RegisterService registerService;

    @PostMapping("/user")
    public ResponseEntity<CreateUserResponse> createUser (@RequestBody
                                                          CreateUserRequest createUserRequest){
        CreateUserResponse createUserResponse = registerService.createUser(createUserRequest);

        return new ResponseEntity<>(createUserResponse, HttpStatus.OK);
    }

    @PostMapping("/company")
    public ResponseEntity<CreateCompanyResponse> createCompany(@RequestBody
                                                               CreateCompanyRequest createCompanyRequest){

        CreateCompanyResponse createCompanyResponse = registerService.createCompany(createCompanyRequest);

        return new ResponseEntity<>(createCompanyResponse, HttpStatus.OK);
    }

    @PostMapping("/personal")
    public ResponseEntity<CreatePersonalInfoResponse> createPersonalInfo(@RequestBody CreatePersonalInfoRequest createPersonalInfoRequest){

            CreatePersonalInfoResponse createPersonalInfoResponse = registerService.createPersonalInfo(createPersonalInfoRequest);

            return new ResponseEntity<>(createPersonalInfoResponse, HttpStatus.OK);
    }
}
