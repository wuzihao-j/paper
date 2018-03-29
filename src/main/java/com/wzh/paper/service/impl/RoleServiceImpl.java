package com.wzh.paper.service.impl;

import com.wzh.paper.dao.RoleDAO;
import com.wzh.paper.entity.Menu;
import com.wzh.paper.entity.Result;
import com.wzh.paper.entity.Role;
import com.wzh.paper.entity.User;
import com.wzh.paper.service.RoleService;
import com.wzh.paper.util.CalendarUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Resource
    private RoleDAO roleDAO;

    @Override
    public Result saveRole(Role role) {
//        Result result;
//        try {
            roleDAO.saveRole(role);
//            result = new Result(Result.SUCCESS_CODE, "添加成功");
//        } catch (Exception e) {
//            result = new Result(Result.FAIL_CODE, "添加失败");
//            e.printStackTrace();
//        }
        return new Result();
    }

    @Override
    public Result saveUsersRole(Role role) {
//        Result result;
//        try {
            roleDAO.saveUsersRole(role);
//            result = new Result(Result.SUCCESS_CODE, "添加成功");
//        } catch (Exception e) {
//            result = new Result(Result.FAIL_CODE, "添加失败");
//            e.printStackTrace();
//        }
        return new Result();
    }

    @Override
    public Result saveMenusRole(Role role) {
//        Result result;
//        try {
            roleDAO.saveMenusRole(role);
//            result = new Result(Result.SUCCESS_CODE, "添加成功");
//        } catch (Exception e) {
//            result = new Result(Result.FAIL_CODE, "添加失败");
//            e.printStackTrace();
//        }
        return new Result();
    }

    //flag=true 列出是某用户下的角色
    //flag=false 列出不是某用户下的角色
    @Override
    public Result listRolesUserSelect(User user, boolean flag) {
        List<Role> roles;
//        Result result;
//        try {
            if(flag){
                roles = roleDAO.listRolesByUser(user);
            } else {
                roles = roleDAO.listRolesNotByUser(user);
            }
//            result = new Result(Result.FAIL_CODE, "查询成功", roles);
//        } catch (Exception e) {
//            result = new Result(Result.FAIL_CODE, "查询失败");
//            e.printStackTrace();
//        }
        return new Result(roles);
    }

    @Override
    public Result listRolesMenuSelect(Menu menu, boolean flag) {
        List<Role> roles;
//        Result result;
//        try {
            if(flag){
                roles = roleDAO.listRolesByMenu(menu);
            } else {
                roles = roleDAO.listRolesNotByMenu(menu);
            }
//            result = new Result(Result.FAIL_CODE, "查询成功", roles);
//        } catch (Exception e) {
//            result = new Result(Result.FAIL_CODE, "查询失败");
//            e.printStackTrace();
//        }
        return new Result(roles);
    }


}
