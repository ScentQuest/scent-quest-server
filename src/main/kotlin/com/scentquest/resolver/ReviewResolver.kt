package com.scentquest.resolver

import com.netflix.graphql.dgs.DgsComponent
import com.scentquest.repository.ReviewRepository
import graphql.kickstart.tools.GraphQLQueryResolver

/**
 *  리뷰 리졸버
 *
 *  @author 윤승재
 *  @since 2024. 05. 28
 */
@DgsComponent
class ReviewResolver(private val reviewRepository: ReviewRepository) : GraphQLQueryResolver