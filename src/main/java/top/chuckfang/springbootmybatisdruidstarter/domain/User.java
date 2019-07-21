package top.chuckfang.springbootmybatisdruidstarter.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author https://www.chuckfang.top
 * @date Created on 2019-07-21 21:10
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -2919785903742673785L;

    private String id;

    private String userName;

}
