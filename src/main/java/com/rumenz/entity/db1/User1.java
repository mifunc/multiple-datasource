package com.rumenz.entity.db1;
import java.util.Date;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;



/**
 * <p>
 * 
 * </p>
 *
 * @author 入门小站
 * @since 2020-05-13
 */

public class User1 implements Serializable{

    private static final long serialVersionUID=1L;


    
       private Integer id;
    
    


       private String name;
    
    

       public Integer getId() {
    
        return id;
    }

       public void setId(Integer id) {
    

        this.id = id;

    }
       public String getName() {
    
        return name;
    }

       public void setName(String name) {
    

        this.name = name;

    }


    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        "}";
    }
}
