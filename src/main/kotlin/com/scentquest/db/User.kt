package com.scentquest.db

import jakarta.persistence.*
import lombok.Builder
import org.hibernate.annotations.ColumnDefault
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 *  사용자 엔티티
 *
 *  @author 윤승재
 *  @since 2024 05 28
 */

@Entity
@Builder
open class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Size(max = 10)
    @NotNull
    @ColumnDefault("' '")
    @Column(name = "name", nullable = false, length = 10)
    open var name: String? = null

    @Size(max = 3)
    @NotNull
    @ColumnDefault("' '")
    @Column(name = "age", nullable = false, length = 3)
    open var age: String? = null

    @Size(max = 10)
    @NotNull
    @ColumnDefault("' '")
    @Column(name = "birth", nullable = false, length = 10)
    open var birth: String? = null

    @Size(max = 20)
    @NotNull
    @ColumnDefault("' '")
    @Column(name = "brand", nullable = false, length = 20)
    open var brand: String? = null

    @Size(max = 20)
    @NotNull
    @ColumnDefault("' '")
    @Column(name = "note", nullable = false, length = 20)
    open var note: String? = null

    @Size(max = 50)
    @NotNull
    @ColumnDefault("' '")
    @Column(name = "rate", nullable = false, length = 50)
    open var rate: String? = null
}