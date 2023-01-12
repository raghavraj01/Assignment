package io.datatroops.bootstrap

import io.datatroops.db.{CompanyRepository, UserRepository}
import io.datatroops.repositories.{CompanyRepositoryImpl, UserRepositoryImpl}

class RepositoryInstantiator {
  val userRepository: UserRepository = new UserRepositoryImpl
  val companyRepository: CompanyRepository = new CompanyRepositoryImpl
}
