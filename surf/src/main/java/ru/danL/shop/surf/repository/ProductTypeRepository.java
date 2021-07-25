package ru.danL.shop.surf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.danL.shop.surf.entity.ProductType;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Long> {
}
