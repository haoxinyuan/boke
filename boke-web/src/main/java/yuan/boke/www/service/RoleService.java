package yuan.boke.www.service;

import yuan.boke.www.entity.Role;

import java.util.List;

public interface RoleService {
    /**
     * 根据用户id查询所有角色
     * @param uid
     * @return
     */
    List<Role> findByUid(Long uid);
}
