package com.bobjo.mini.service;

import com.bobjo.mini.model.dao.MenuMapper;
import com.bobjo.mini.model.dto.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Random;

import static com.bobjo.mini.common.Template.getSqlSession;

public class MenuService {

    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        /* sqlSession은 요청 단위로 생성해야 하기 때문에 getMapper로 메소드 스코프로 매번 불러와야한다. */
        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        List<MenuDTO> menuList = menuMapper.selectAllMenu();

        sqlSession.close();

        return menuList;
    }

    public boolean insertMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        int result = menuMapper.insertMenu(menu);

        /* insert, update, delete의 경우에는 성공과 실패 여부에 따라 트랜잭션 처리 */
        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }

    public MenuDTO getRandomMenu() {
        List<MenuDTO> menuList = selectAllMenu();

        if (menuList != null && !menuList.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(menuList.size());
            return menuList.get(randomIndex);
        } else {
            // 메뉴가 없을 경우에 대한 처리
            return null;
        }
    }

}
