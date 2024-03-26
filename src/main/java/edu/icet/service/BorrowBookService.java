package edu.icet.service;

import edu.icet.dto.BorrowBookDto;
import edu.icet.entity.BorrowBookEntity;

import java.util.List;

public interface BorrowBookService {
    void addBorrowDetails(BorrowBookDto borrowBookDto);
    List<BorrowBookEntity> getAll();

}
