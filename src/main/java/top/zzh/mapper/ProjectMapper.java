package top.zzh.mapper;

import org.springframework.stereotype.Repository;
import top.zzh.model.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ProjectMapper类
 * Created By Donghua.Chen on  2018/1/9
 */
@Repository
public interface ProjectMapper {

    /**
     * 插入project数据
     * @param project
     * @return
     */
    int addProjectSelective(Project project);

    /**
     * 获取Project
     * @param batchNum
     * @return
     */
    List<Project> getProjectsByBatchNum(@Param("batchNum") String batchNum);
}
