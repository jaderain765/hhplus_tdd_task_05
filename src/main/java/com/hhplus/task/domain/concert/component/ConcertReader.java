package com.hhplus.task.domain.concert.component;

import com.hhplus.task.domain.concert.models.Concert;
import com.hhplus.task.domain.concert.repositories.ConcertReaderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ConcertReader {


    private final ConcertReaderRepository readerRepository;

    public Concert findConcert(Long id){
        return readerRepository.findById(id);
    }

    public Integer findCapacityById(Long concertId) {
        return readerRepository.findById(concertId).getCapacity();
    }

    public List<Concert> findAll(){
        return readerRepository.findAll();
    }

    public List<Concert> findAllAvailable() {
        return readerRepository.findAllAbailable();
    }

    public boolean concertIsAbailableById(Long id){
        return readerRepository.isAbailableById(id);
    }
}
