package yuan.boke.www.dao;

import tk.mybatis.mapper.common.Mapper;
import yuan.boke.www.entity.RoleUser;
import yuan.boke.www.entity.User;

public interface RoleUserMapper extends Mapper<User> {
    int deleteByPrimaryKey(Long id);

    int insert(RoleUser record);

    int insertSelective(RoleUser record);

    RoleUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleUser record);

    int updateByPrimaryKey(RoleUser record);
}