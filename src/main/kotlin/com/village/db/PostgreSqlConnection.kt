package com.village.db

import java.io.Closeable
import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement


class Connection(private val coreConnection: java.sql.Connection) :
        java.sql.Connection by coreConnection, Closeable {

    override fun close() {
        coreConnection.close()
    }

    override fun createStatement(): Statement {
        return coreConnection.createStatement()
    }
}


fun connect(): Connection {

    val url = "jdbc:postgresql://localhost:5432/village"
    val user = "village_admin"
    val password = "village_adming"


    val c = DriverManager.getConnection(url, user, password)
    c.autoCommit = false
    return Connection(c)
}



