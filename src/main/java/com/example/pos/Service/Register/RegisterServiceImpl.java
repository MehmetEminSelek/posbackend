package com.example.pos.Service.Register;

import com.example.pos.Entity.Company;
import com.example.pos.Entity.Membership;
import com.example.pos.Entity.PersonalInfo;
import com.example.pos.Entity.UserInfo;
import com.example.pos.Repository.CompanyRepository;
import com.example.pos.Repository.MembershipRepository;
import com.example.pos.Repository.PersonalInfoRepository;
import com.example.pos.Repository.UserInfoRepository;
import com.example.pos.Request.Register.CreateCompanyRequest;
import com.example.pos.Request.Register.CreatePersonalInfoRequest;
import com.example.pos.Request.Register.CreateUserRequest;
import com.example.pos.Response.Register.CreateCompanyResponse;
import com.example.pos.Response.Register.CreatePersonalInfoResponse;
import com.example.pos.Response.Register.CreateUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {

    private final UserInfoRepository userInfoRepository;

    private final MembershipRepository membershipRepository;

    private final CompanyRepository companyRepository;

    private final PersonalInfoRepository personalRepository;
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

    @Override
    public CreateCompanyResponse createCompany(CreateCompanyRequest createCompanyRequest) {
        Company company = new Company();

        company.setCompanyName(createCompanyRequest.getCompanyName());
        company.setCompanyType(createCompanyRequest.getCompanyType());
        company.setBrandName(createCompanyRequest.getBrandName());
        company.setKepAddress(createCompanyRequest.getKepAddress());
        company.setCompanyTitle(createCompanyRequest.getCompanyTitle());
        company.setMersisNo(createCompanyRequest.getMersisNo());
        company.setTicaretOdası(createCompanyRequest.getTicaretOdası());
        company.setTaxOffice(createCompanyRequest.getTaxOffice());
        company.setTaxOfficeNumber(createCompanyRequest.getTaxNumber());
        company.setAddress(createCompanyRequest.getAddress());
        company.setAddressDetail(createCompanyRequest.getAddressDetail());

        companyRepository.save(company);

        return new CreateCompanyResponse(company);
    }

    @Override
    public CreatePersonalInfoResponse createPersonalInfo(CreatePersonalInfoRequest createPersonalInfoRequest) {
        PersonalInfo personalInfo = new PersonalInfo();

        personalInfo.setName(createPersonalInfoRequest.getName());
        personalInfo.setSurname(createPersonalInfoRequest.getSurname());
        personalInfo.setEmail(createPersonalInfoRequest.getEmail());
        personalInfo.setPhoneNumber(createPersonalInfoRequest.getPhoneNumber());
        personalInfo.setTitle(createPersonalInfoRequest.getTitle());
        personalInfo.setPhoneNumber2(createPersonalInfoRequest.getPhoneNumber2());
        personalInfo.setAddress(createPersonalInfoRequest.getAddress());
        personalInfo.setPostalCode(createPersonalInfoRequest.getPostalCode());
        personalInfo.setIsAuthorized(createPersonalInfoRequest.getIsAuthorized());

        personalRepository.save(personalInfo);

        return new CreatePersonalInfoResponse(personalInfo);


    }
}
