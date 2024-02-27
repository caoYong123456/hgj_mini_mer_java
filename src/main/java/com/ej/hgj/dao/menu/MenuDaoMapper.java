package com.ej.hgj.dao.menu;

import com.ej.hgj.entity.menu.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MenuDaoMapper {

    List<Menu> menuList(Menu menu);

    List<Menu> getMenuList(Menu menu);

    List<Menu> getUserMenuList(String staffId);

    List<Menu> findMenuByRoleId(String roleId);

}
