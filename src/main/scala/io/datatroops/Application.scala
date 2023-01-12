package io.datatroops

import io.datatroops.bootstrap.RepositoryInstantiator
import io.datatroops.models.{Company, User}

object Application extends App {

  val repositoryInstantiator = new RepositoryInstantiator
  val userRepository = repositoryInstantiator.userRepository
  val companyRepository = repositoryInstantiator.companyRepository

  /***
   * Invoke All the method one by one and test them.
   */
  val company1 = Company("fghj","fghjk","fghjl")
  companyRepository.storeCompanyDetails(company1)
  companyRepository.getCompanyById(0)
  companyRepository.getUserByEmail("fghjk")
  companyRepository.updateCompanyIEmail(0,"XCVBN")
  println("========================================================")
  val user1= User("dfghj","dfghjk",25,100.0,"cvbnm","fghj","XCVBN")
  userRepository.getUserByEmail("XCVBN")
  userRepository.storeUser(user1)
  userRepository.getUserByDesignation("cvbnm")

}
