package com.busanit501.spring_project.service;

import com.busanit501.spring_project.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoServiceTests {

    @Autowired(required = false)
    private TodoService todoService;

    @Test
    public void testInsert() {
        // 화면에서 전달 받은 더미 데이터 작성, TodoDTO
        TodoDTO todoDTO = TodoDTO.builder()
                .title("서비스 단위테스트 스프링 버전")
                .dueDate(LocalDate.now())
                .writer("이상용, 서비스 단위테스트")
                .build();
        todoService.register(todoDTO);
    }
}
