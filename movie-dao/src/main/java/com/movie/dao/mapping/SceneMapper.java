package com.movie.dao.mapping;

import com.movie.dao.pojo.Cinema;
import com.movie.dao.pojo.Scene;
import com.movie.dao.pojo.SceneShow;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SceneMapper extends Mapper<Scene> {

    List<SceneShow> selectSceneShow();
    /**
     * 根据id删除一条数据
     * @param id
     * @return
     */
    int deleteOneData(@Param("id") Integer id);

    int insertOneData(@Param("sceneShow") SceneShow sceneShow);
}