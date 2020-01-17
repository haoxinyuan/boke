package yuan.boke.www.dao;

import tk.mybatis.mapper.common.Mapper;
import yuan.boke.www.entity.RoleResource;
import yuan.boke.www.entity.User;

public interface RoleResourceMapper extends Mapper<User> {
    int deleteByPrimaryKey(Long id);

    int insert(RoleResource record);

    int insertSelective(RoleResource record);

    RoleResource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleResource record);

    int updateByPrimaryKey(RoleResource record);
}