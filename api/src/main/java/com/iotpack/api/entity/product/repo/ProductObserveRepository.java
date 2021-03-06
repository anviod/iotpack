package com.iotpack.api.entity.product.repo;

import com.iotpack.api.entity.product.ProductEntity;
import com.iotpack.api.entity.product.ProductObserveEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductObserveRepository extends CrudRepository<ProductObserveEntity, Long>,
        JpaSpecificationExecutor<ProductObserveEntity>,
        JpaRepository<ProductObserveEntity, Long> {
}
