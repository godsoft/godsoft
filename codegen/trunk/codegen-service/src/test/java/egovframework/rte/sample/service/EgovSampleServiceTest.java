package egovframework.rte.sample.service;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

//  필요할 경우, 스프링 컨텍스트/트랜잭션 등의 설정을 적용한다.
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:egovframework/spring/codegen-service.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
@Transactional
public abstract class EgovSampleServiceTest {

    /**
     * EgovSampleService에 정의된 메소드 만큼의 추상 메소드를 선언한다.
     */
    public abstract void testMethodA();

    /**
     * EgovSampleService에 정의된 메소드 만큼의 추상 메소드를 선언한다.
     */
    public abstract void testMethodZ();

}
