package io.datatroops.db

import io.datatroops.models.User

trait UserRepository {

  def storeUser(user: User): Int

  def getUserByEmail(email: String): List[User]

  def getUserByDesignation(designation: String): List[User]

}
