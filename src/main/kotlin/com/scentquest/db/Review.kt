package com.scentquest.db

import jakarta.persistence.*
import lombok.Builder
import org.hibernate.annotations.ColumnDefault
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 *  리뷰 엔티티
 *
 * @author 윤승재
 * @since 2024 05 28
 *
 */
@Entity
@Builder
open class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Size(max = 20)
    @NotNull
    @ColumnDefault("'0'")
    @Column(name = "code", nullable = false, length = 20)
    open var code: String? = null

    @Size(max = 10)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "name", nullable = false, length = 10)
    open var name: String? = null

    @NotNull
    @ColumnDefault("'1'")
    @Lob
    @Column(name = "star", nullable = false)
    open var star: String? = null

    @NotNull
    @ColumnDefault("'0'")
    @Lob
    @Column(name = "season", nullable = false)
    open var season: String? = null

    @NotNull
    @ColumnDefault("'0'")
    @Lob
    @Column(name = "time", nullable = false)
    open var time: String? = null

    @NotNull
    @ColumnDefault("'0'")
    @Lob
    @Column(name = "rate", nullable = false)
    open var rate: String? = null

    @NotNull
    @ColumnDefault("'0'")
    @Lob
    @Column(name = "gender", nullable = false)
    open var gender: String? = null

    @NotNull
    @ColumnDefault("'0'")
    @Lob
    @Column(name = "price", nullable = false)
    open var price: String? = null
}