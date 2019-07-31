package com.village.others


import com.village.db.connect



fun main(args: Array<String>) {
    println("test")

    connect().use {
        val st = it.createStatement()
        val rs = st.executeQuery("select * from village")

        while (rs.next()) {
            val id = rs.getLong("id")
            val description = rs.getString("description")
            val owner = rs.getString("owner")
            val phone = rs.getString("phone")
            println("$id $description $owner $phone")
        }
    }

}




