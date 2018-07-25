package com.example.demo.dao;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 批量查询
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据id查询单条记录
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 插入
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 修改
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);

}
