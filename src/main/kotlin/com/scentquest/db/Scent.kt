package com.scentquest.db

import jakarta.persistence.*
import lombok.Builder
import org.hibernate.annotations.ColumnDefault
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 *  향수 엔티티
 *
 *  @author 윤승재
 *  @since 2024 05 28
 */
@Entity
@Builder
open class Scent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    open var id: Long? = null

    @Size(max = 20)
    @NotNull
    @ColumnDefault("'0'")
    @Column(name = "code", nullable = false, length = 20)
    open var code: String? = null

    @Size(max = 20)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "brand", nullable = false, length = 20)
    open var brand: String? = null

    @Size(max = 10)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "name", nullable = false, length = 10)
    open var name: String? = null

    @Size(max = 20)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "m_acc", nullable = false, length = 20)
    open var mAcc: String? = null

    @Size(max = 200)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "description", nullable = false, length = 200)
    open var description: String? = null
}