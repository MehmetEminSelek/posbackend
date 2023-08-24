package com.example.pos.Response.Register;


import com.example.pos.Entity.Membership;
import com.example.pos.Entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CreateUserResponse {

    private String username;

    private String password;

    private String email;

    private String shopName;

    private String shopUrl;

    private String membership;


    public CreateUserResponse(UserInfo userInfo, Membership membership){
        this.username = userInfo.getUsername();
        this.password = userInfo.getPassword();
        this.email = userInfo.getEmail();
        this.shopName = userInfo.getShopName();
        this.shopUrl = userInfo.getShopUrl();
        this.membership = membership.getMembershipName();
    }
}
