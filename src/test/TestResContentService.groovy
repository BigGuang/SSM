package test

import com.waps.model.domain.ResContent;
import com.waps.model.service.ResContentService;
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestResContentService {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        ResContentService resContentService=(ResContentService) applicationContext.getBean("resContentService")
        List<ResContent> objList=resContentService.getAll()
        for (int i = 0; i < objList.size(); i++) {
            ResContent resContent =  objList.get(i)
        }
    }
}
