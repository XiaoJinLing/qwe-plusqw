package com.xiao.bl.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author XiaoJinLing
 * @since 2021-10-06
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 主键ID
     */
        private Long id;

      /**
     * 姓名
     */
      private String name;

      /**
     * 年龄
     */
      private Integer age;

      /**
     * 邮箱
     */
      private String email;


}
