package test

import com.waps.model.domain.ResFile
import com.waps.model.service.ResFileService
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

class TestResFileService {
    public static void main(String[] args)  throws Exception{
        @SuppressWarnings("resource")
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath*:applicationContext.xml")
        ResFileService resFileService=(ResFileService) applicationContext.getBean("resFileService")
//        List<ResFile> objList=resFileService.getAll()
//        for (int i = 0; i < objList.size(); i++) {
//            ResFile resFile =  objList.get(i)
//            println resFile.getId()+"  "+resFile.getResName()+"  "+resFile.getFilePath()
//        }


        Map<String,Object> map=new HashMap<String,Object>()
        map.put("start", 10)
        map.put("size", 20)
        List<ResFile> fileList=resFileService.find(map)

        for (int i = 0; i < fileList.size(); i++) {
            ResFile resFile =  fileList.get(i)
            println resFile.getId()+"  "+resFile.getResName()+"  "+resFile.getFilePath()
        }
    }
}
