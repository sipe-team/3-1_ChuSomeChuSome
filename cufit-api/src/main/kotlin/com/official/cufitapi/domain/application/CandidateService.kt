package com.official.cufitapi.domain.application

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class CandidateService {

    // 후보자 조회
    fun get() {

    }
}