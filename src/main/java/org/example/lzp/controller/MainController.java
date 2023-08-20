package org.example.lzp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author : lzp
 * @date : 2023/7/27 14:15
 * @apiNote : TODO
 */
@RestController
public class MainController {
    @Autowired
    StringRedisTemplate redisTemplate;
    @GetMapping("/text")
    public void print(String str){
        String count = redisTemplate.opsForValue().get("count");
        System.out.println(LocalDateTime.now()+" this is param:"+str);

        if (StringUtils.isEmpty(count)) {
            redisTemplate.opsForValue().set("count","1");
        }else {
            Integer integer = Integer.valueOf(count);
            integer++;
            redisTemplate.opsForValue().set("count", String.valueOf(integer));
        }
    }
}
