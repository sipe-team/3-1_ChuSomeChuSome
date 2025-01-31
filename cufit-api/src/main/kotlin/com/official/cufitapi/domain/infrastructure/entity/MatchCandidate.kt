package com.official.cufitapi.domain.infrastructure.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


/*
   후보자 Table
 */
class MatchCandidate(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    /*
     사용자 id
    */
    val memberId: Long,

    /*
     이상형 정보
    */

) {
}