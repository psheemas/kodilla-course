package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Ciastka");

        //When
        productDao.save(product1);

        //Then
        int id = product1.getId();
        Optional<Product> readProduct = productDao.findById(id);
        Assert.assertTrue(readProduct.isPresent());

        //CleanUp
        productDao.deleteById(id);

    }

}