package org.example;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.test.FlowableRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Unit test for simple App.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FlowableDemoAppTest{

//    @Resource
//    public FlowableRule flowableRule;

    @Resource
    public RepositoryService repositoryService;

    @Test
    public void testCreateDeployment(){
//        RepositoryService repositoryService = flowableRule.getRepositoryService();

        Deployment deploy = repositoryService.createDeployment()
                .addClasspathResource("FinancialReportProcess.bpmn20.xml")
                .deploy();

        System.out.println(deploy.getId());
    }

}
