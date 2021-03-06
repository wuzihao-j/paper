package com.wzh.paper.entity;

import java.util.List;

public class Production {
    private Long production_id;
    private String productionName;
    private List<Menu> menus;

    public Long getProduction_id() {
        return production_id;
    }

    public void setProduction_id(Long production_id) {
        this.production_id = production_id;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
