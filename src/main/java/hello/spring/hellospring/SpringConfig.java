package hello.spring.hellospring;

import hello.spring.hellospring.repository.MemberRepository;
import hello.spring.hellospring.repository.MemoryMemberRepository;
import hello.spring.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
