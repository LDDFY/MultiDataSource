package com.multi.datasource.multi;

import com.multi.datasource.multi.entity.first.User;
import com.multi.datasource.multi.entity.second.Product;
import com.multi.datasource.multi.repository.first.UserRepository;
import com.multi.datasource.multi.repository.second.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void test1() {
        User user = userRepository.findById(1);
        Product product = productRepository.findById(1);
        System.out.println(user);
        System.out.println(product);
    }
}
