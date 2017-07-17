package jpa.dao;

import jpa.entity.Demo;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * 这是一个接口，没有具体的实现
 * 在CrudRepository自带有常用给的crud方法
 * 这样一个基本的dao就写完了
 * Created by liukedong on 2017/7/17.
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {

}
