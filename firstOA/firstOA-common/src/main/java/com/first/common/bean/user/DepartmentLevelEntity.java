package com.first.common.bean.user;

/**
 * @author 周俊宇
 * @version 1.0.0
 * @title DepartmentLevelEntity
 * @description 层级关系表
 * @date 2024/4/8 17:58
 */
public class DepartmentLevelEntity {
    private Integer id;
    private String name; //名称
    private Integer level; //层级
    private Integer pid; //父ID
    private Integer sort; //排序
    private Integer category = 0; //默认为组织分类0

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
