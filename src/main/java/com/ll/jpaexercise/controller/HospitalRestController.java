package com.ll.jpaexercise.controller;

import com.ll.jpaexercise.entity.dto.HospitalReviewResponse;
import com.ll.jpaexercise.entity.dto.ReviewCreateRequest;
import com.ll.jpaexercise.entity.dto.ReviewCreateResponse;
import com.ll.jpaexercise.service.HospitalService;
import com.ll.jpaexercise.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/hospitals")
@RequiredArgsConstructor
@RestController
public class HospitalRestController {

    private final HospitalService hospitalService;
    private final ReviewService reviewService;

    @GetMapping("/{id}")
    public ResponseEntity<List<HospitalReviewResponse>> getOneHospital(@PathVariable Long id) throws Exception {
        List<HospitalReviewResponse> hospitalReviewResponse = hospitalService.getOneHospital(id);
        return ResponseEntity.ok().body(hospitalReviewResponse);
    }

    @PostMapping("/{id}/reviews")
    public ResponseEntity<ReviewCreateResponse> saveHospital(@PathVariable Long id, @RequestBody ReviewCreateRequest request){
        return ResponseEntity.ok().body(reviewService.add(request));
    }

}
