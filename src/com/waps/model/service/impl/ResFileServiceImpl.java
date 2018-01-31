package

    com.waps.model.service.impl;

import com.waps.model.domain.ResFile;
import com.waps.model.dao.ResFileDao;
import com.waps.model.service.ResFileService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *   服务实现类
 * </p>
 *
 * @author 金小光
 * @since 2018-01-30
 */

@Service(value = "resFileService")
public class ResFileServiceImpl implements ResFileService {

    private ResFileDao resfiledao;

    @Resource
    public void setResFileDao(ResFileDao resfiledao) {
        this.resfiledao = resfiledao;
    }

    @Override
    public int add(ResFile obj){
        return resfiledao.add(obj);
    }

    @Override
    public int delete(String id){
        return resfiledao.delete(id);
    }

    @Override
    public int update(ResFile obj){
        return resfiledao.update(obj);
    }

    @Override
    public ResFile getResFile(ResFile obj){
        return resfiledao.getResFile(obj);
    }

    @Override
    public ResFile getResFileById(String id){
        return resfiledao.getResFileById(id);
    }

    @Override
    public Long getTotal(Map<String, Object> map){
        return resfiledao.getTotal(map);
    }

    @Override
    public List<ResFile> getAll(){
        return resfiledao.getAll();
    }

    @Override
    public List<ResFile> find(Map<String, Object> map){
        return resfiledao.find(map);
    }
}
