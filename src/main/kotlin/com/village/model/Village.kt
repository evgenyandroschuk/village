package com.village.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

//@Entity
class Village(
//        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        var description: String,
        var owner: String,
        var phone: String
)