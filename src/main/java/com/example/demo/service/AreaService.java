package com.example.demo.service;

import com.example.demo.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 批量查询
     * @return
     */
    List<Area> getAreaList();

    /**
     * 根据id查询单条记录
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 插入
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);

}
