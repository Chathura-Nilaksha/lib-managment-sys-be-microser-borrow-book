package edu.icet.controller;

import edu.icet.dto.BorrowBookDto;
import edu.icet.entity.BorrowBookEntity;
import edu.icet.service.BorrowBookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
//check how to do "auto commit --> false"--said to do so only have an annotation
public class BorrowBookController {
    final BorrowBookService borrowBookService;
    BorrowBookDto borrowBookDto;
    @PostMapping("/add-borrow-details")
    public void addBorrowDetails(@RequestBody BorrowBookDto borrowBookDto){
        borrowBookService.addBorrowDetails(borrowBookDto);
    }
    @GetMapping("/get-all")
    public List<BorrowBookEntity> getAll(){
        return borrowBookService.getAll();
    }
}
