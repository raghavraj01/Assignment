package io.datatroops.repositories

import io.datatroops.db.UserRepository
import io.datatroops.models.User


class UserRepositoryImpl extends UserRepository {

  var db: Map[String, User] = Map()

  override def storeUser(user: User): Int = {
    println(db.size)
  }

  override def getUserByEmail(email: String): List[User] = {
    println()
    List()
  }

  override def getUserByDesignation(designation: String): List[User] = {
    List()
  }

}
