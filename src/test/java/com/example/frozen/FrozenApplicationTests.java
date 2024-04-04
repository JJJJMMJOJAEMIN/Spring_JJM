package com.example.frozen;

import com.example.frozen.Class.Member;
import jakarta.persistence.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class FrozenApplicationTests {

    @PersistenceContext
    EntityManager em;

    @Test
    @Transactional
    void test() {

        Member member = new Member();
        member.setId("member1");
        member.setUsername("회원1");

        Member findMember = em.find(Member.class, "member1");
    }
}
