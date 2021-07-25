package ru.danL.shop.surf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.danL.shop.surf.entity.Product;
import ru.danL.shop.surf.entity.ProductType;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
    public List<Product> findByProductType(ProductType productType);
}
