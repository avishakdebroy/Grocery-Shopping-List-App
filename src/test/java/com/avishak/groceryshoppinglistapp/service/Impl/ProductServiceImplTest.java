package com.avishak.groceryshoppinglistapp.service.Impl;


import com.avishak.groceryshoppinglistapp.entity.Product;
import com.avishak.groceryshoppinglistapp.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

        @Mock
        private ProductRepository productRepository;

        private ProductServiceImpl underTest;

        @BeforeEach
        void setUp() {
            underTest = new ProductServiceImpl(productRepository);
        }

        @Test
        void itShouldSaveProduct() {
            // given
            Product product = new Product();

            // when
            underTest.saveProduct(product);

            // then
            verify(productRepository).save(product);
        }


        @Test
        void itShouldDeleteProductById() {
            // given
            Long id = 1L;

            // when
            underTest.deleteProductById(id);

            // then
            verify(productRepository).deleteById(id);
        }

        // Create a parameterized test to test
          @ParameterizedTest
          @ValueSource(strings = {"", " "})
            void itShouldThrowExceptionWhenNameIsBlank(String name) {
                // given
                Product product = new Product();
                product.setName(name);

                // when
                underTest.saveProduct(product);

                // then
                verify(productRepository).save(product);
            }

}