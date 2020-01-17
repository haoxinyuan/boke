package yuan.boke.www.security.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import yuan.boke.www.entity.Role;
import yuan.boke.www.entity.User;
import yuan.boke.www.service.RoleService;
import yuan.boke.www.service.UserService;
import java.util.List;

public class AccountDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userService.findByEmail(email);
        if(user == null){
            throw new UsernameNotFoundException("用户名或密码错误");
        }
        List<Role> roles = roleService.findByUid(user.getId());
        user.setRoles(roles);
        return user;
    }
}
