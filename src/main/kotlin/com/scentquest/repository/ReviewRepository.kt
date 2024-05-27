package com.scentquest.repository

import com.scentquest.db.Review
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * 리뷰 레포지토리
 *
 *  @author 윤승재
 *  @since 2024. 05. 28
 */
@Repository
interface ReviewRepository : JpaRepository<Review, Long>