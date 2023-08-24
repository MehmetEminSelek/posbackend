package com.example.pos.Service.Register;

import com.example.pos.Entity.Membership;
import com.example.pos.Entity.UserInfo;
import com.example.pos.Repository.MembershipRepository;
import com.example.pos.Repository.UserInfoRepository;
import com.example.pos.Request.Register.CreateUserRequest;
import com.example.pos.Response.Register.CreateUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {

    private final UserInfoRepository userInfoRepository;

    private final MembershipRepository membershipRepository;
    @Override
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        UserInfo userInfo = new UserInfo();

        userInfo.setUsername(createUserRequest.getUsername());
        userInfo.setPassword(createUserRequest.getPassword());
        userInfo.setEmail(createUserRequest.getEmail());
        userInfo.setShopName(createUserRequest.getShopName());
        userInfo.setShopUrl(createUserRequest.getShopUrl());

        userInfoRepository.save(userInfo);

        Membership membership = new Membership();
        membership.setMembershipName(String.valueOf(createUserRequest.getMembership()));

        membershipRepository.save(membership);

        return new CreateUserResponse(userInfo, membership);
    }
}
