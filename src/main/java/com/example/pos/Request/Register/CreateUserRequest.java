package com.example.pos.Request.Register;


import com.example.pos.Entity.Membership;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CreateUserRequest {

    private String username;

    private String password;

    private String email;

    private String shopName;

    private String shopUrl;

    private String membership;
}
