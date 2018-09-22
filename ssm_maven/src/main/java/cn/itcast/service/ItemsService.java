package cn.itcast.service;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;

import java.util.List;

public interface ItemsService {
    public List<Items> findAll();
}
