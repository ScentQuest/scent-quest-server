package com.scentquest.repository

import com.scentquest.db.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 *  사용자 레포지토리
 *
 *  @author 윤승재
 *  @since 2024. 05. 28
 */
@Repository
interface UserRepository : JpaRepository<User, Long>