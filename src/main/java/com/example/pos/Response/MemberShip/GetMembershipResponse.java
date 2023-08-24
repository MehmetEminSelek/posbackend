package com.example.pos.Response.MemberShip;


import com.example.pos.Entity.Membership;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Member;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GetMembershipResponse {

    private String membershipName;

    public  GetMembershipResponse(Membership membership) {
        this.membershipName = membership.getMembershipName();;
    }
}
