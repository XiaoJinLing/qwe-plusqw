package com.xiao.bl.service.impl;

import com.xiao.bl.entity.User;
import com.xiao.bl.mapper.UserMapper;
import com.xiao.bl.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XiaoJinLing
 * @since 2021-10-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
