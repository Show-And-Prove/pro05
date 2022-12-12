package com.shop.myapp;

import com.shop.myapp.entity.Board;
import com.shop.myapp.repository.BoardRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class BoardTests {

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void save() {
        Board params = Board.builder()
                .title("Test 데이터 - 제목")
                .content("Test 데이터 - 내용")
                .writer("whalswo")
                .hits(0)
                .deleteYn('N')
                .build();

        boardRepository.save(params);

    }

    @Test
     public void loadingData() {
        Board entity = boardRepository.findById((long) 1).get();
        assertThat(entity.getTitle()).isEqualTo("Test 데이터 - 제목");
        assertThat(entity.getContent()).isEqualTo("Test 데이터 - 내용");
        assertThat(entity.getWriter()).isEqualTo("whalswo");
    }

    @Test
    public void findAll() {
        long boardsCount = boardRepository.count();
        List<Board> boards = boardRepository.findAll();

    }
}
