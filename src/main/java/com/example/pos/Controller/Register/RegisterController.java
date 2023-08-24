package com.example.pos.Controller.Register;


import com.example.pos.Request.Register.CreateUserRequest;
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

    @PostMapping
    public ResponseEntity<CreateUserResponse> createUser (@RequestBody
                                                          CreateUserRequest createUserRequest){
        CreateUserResponse createUserResponse = registerService.createUser(createUserRequest);

        return new ResponseEntity<>(createUserResponse, HttpStatus.OK);
    }
}
