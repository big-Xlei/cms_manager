package com.xl.apps.cms.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.xl.apps.cms.utils.CustomerException;
import com.xl.apps.cms.utils.Message;
import com.xl.apps.cms.utils.MessageUtil;
import com.xl.apps.cms.utils.PermissionException;
import com.xl.apps.cms.utils.UnAuthorizedException;


/**
 * 
 * @author DX
 * 	统一异常处理类
 */
@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(value =  Exception.class) // 捕获 Controller 中抛出的指定类型的异常，也可以指定其他异常
    public <E> Message handler(Exception exception){
        exception.printStackTrace();
        if(exception instanceof CustomerException){
            if(exception instanceof PermissionException){

                System.out.println("=====================权限不足");
                return MessageUtil.forbidden("权限不足");
            }
            if( exception instanceof UnAuthorizedException){
                return MessageUtil.unAuthorized(exception.getMessage());
            }
            return MessageUtil.error(exception.getMessage());
        }
        return MessageUtil.error("后台接口异常！，请联系开发人员");
    }
}
