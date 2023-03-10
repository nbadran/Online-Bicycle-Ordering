package group09.SalesService.Repositories;

import group09.SalesService.Entities.InStoreSale;
import group09.SalesService.Entities.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InStoreSaleRepository extends JpaRepository<InStoreSale, Long> {
}
