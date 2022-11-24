package com.ll.jpaexercise.service;

import com.ll.jpaexercise.entity.Hospital;
import com.ll.jpaexercise.entity.dto.HospitalReviewResponse;
import com.ll.jpaexercise.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public List<HospitalReviewResponse> findById(Long id) throws Exception {
        Hospital hospital = hospitalRepository.findById(id)
                .orElseThrow(() -> new Exception("해당 병원이 없습니다."));

        List<HospitalReviewResponse> hospitalReviewResponse = HospitalReviewResponse.of(hospital);
        return hospitalReviewResponse;
    }
}
