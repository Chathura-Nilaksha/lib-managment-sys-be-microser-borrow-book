package edu.icet.service.impl;

import edu.icet.dto.BorrowBookDto;
import edu.icet.entity.BorrowBookEntity;
import edu.icet.repository.BorrowBookRepository;
import edu.icet.service.BorrowBookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class BorrowBookImpl implements BorrowBookService {
    final ModelMapper modelMapper;
    final BorrowBookRepository borrowBookRepository;
    @Override
    public void addBorrowDetails(BorrowBookDto borrowBookDto) {
        borrowBookRepository.save(modelMapper.map(borrowBookDto, BorrowBookEntity.class));
    }
    @Override
    public List<BorrowBookEntity> getAll() {
        return borrowBookRepository.findAll();
    }
}
