package test

import com.waps.model.domain.ResCatalog;
import com.waps.model.service.ResCatalogService;
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestResCatalogService {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        ResCatalogService resCatalogService=(ResCatalogService) applicationContext.getBean("resCatalogService")
        List<ResCatalog> objList=resCatalogService.getAll()
        for (int i = 0; i < objList.size(); i++) {
            ResCatalog resCatalog =  objList.get(i)
        }
    }
}
