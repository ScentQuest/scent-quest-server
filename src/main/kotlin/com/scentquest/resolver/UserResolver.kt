package com.scentquest.resolver

import com.netflix.graphql.dgs.DgsComponent
import com.scentquest.repository.UserRepository
import graphql.kickstart.tools.GraphQLQueryResolver

/**
 *  유저 리졸버
 *
 *  @author 윤승재
 *  @since 2024. 05. 28
 */
@DgsComponent
class UserResolver(private val userRepository: UserRepository) : GraphQLQueryResolver