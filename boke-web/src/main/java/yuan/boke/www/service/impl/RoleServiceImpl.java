package yuan.boke.www.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yuan.boke.www.dao.RoleMapper;
import yuan.boke.www.entity.Role;
import yuan.boke.www.service.RoleService;

import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public List<Role> findByUid(Long uid) {
        return roleMapper.findByUid(uid);
    }
}
