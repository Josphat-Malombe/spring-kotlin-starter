package com.qr.springkotlincontainer.model
import jakarta.persistence.*


@Entity
@Table(name = "users")
class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id: Long =0,

    @Column(nullable=false)
    var name: String,

    @Column(nullable=false,unique=true)
    var email: String
}