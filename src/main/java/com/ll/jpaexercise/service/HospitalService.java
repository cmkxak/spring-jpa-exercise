package com.ll.jpaexercise.service;

import com.ll.jpaexercise.entity.Hospital;
import com.ll.jpaexercise.entity.dto.HospitalReviewResponse;
import com.ll.jpaexercise.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public List<HospitalReviewResponse> getOneHospital(Long id) throws Exception {
        Hospital hospital = hospitalRepository.findById(id)
                .orElseThrow(() -> new Exception("해당 병원이 없습니다."));

        List<HospitalReviewResponse> hospitalReviewResponse = hospital.getReviews().stream().map(
                review -> HospitalReviewResponse.of(hospital, review)).collect(Collectors.toList());

        return hospitalReviewResponse;
    }
}
