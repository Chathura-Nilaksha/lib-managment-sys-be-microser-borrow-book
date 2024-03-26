package edu.icet.repository;

import edu.icet.entity.BorrowBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowBookRepository extends JpaRepository<BorrowBookEntity, Long> {
}
