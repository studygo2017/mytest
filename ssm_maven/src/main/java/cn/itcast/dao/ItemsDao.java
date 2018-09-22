package cn.itcast.dao;

import cn.itcast.domain.Items;

import java.util.List;

public interface ItemsDao {
    public List<Items> findAll();
}
