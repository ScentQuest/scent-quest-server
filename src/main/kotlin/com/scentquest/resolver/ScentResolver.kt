package com.scentquest.resolver

import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.scentquest.db.Scent
import com.scentquest.repository.ScentRepository
import graphql.kickstart.tools.GraphQLQueryResolver

/**
 *
 * 향수 리졸버
 *
 * @author 윤승재
 * @since 2024. 05. 28
 */

@DgsComponent
class ScentResolver(private val scentRepository: ScentRepository) : GraphQLQueryResolver {
    @DgsQuery
    fun getAllScent(): MutableList<Scent> = scentRepository.findAll()
}