package test

import com.waps.model.domain.ResDown;
import com.waps.model.service.ResDownService;
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestResDownService {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        ResDownService resDownService=(ResDownService) applicationContext.getBean("resDownService")
        List<ResDown> objList=resDownService.getAll()
        for (int i = 0; i < objList.size(); i++) {
            ResDown resDown =  objList.get(i)
        }
    }
}
