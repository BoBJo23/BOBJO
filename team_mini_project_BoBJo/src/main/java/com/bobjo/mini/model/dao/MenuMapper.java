package com.bobjo.mini.model.dao;

import com.bobjo.mini.model.dto.MenuDTO;

import java.util.List;

public interface MenuMapper {

    List<MenuDTO> selectAllMenu();
    MenuDTO selectMenuByCode(int code);
    int insertMenu(MenuDTO menu);
    int updateMenu(MenuDTO menu);
    int deleteMenu(int code);
}
