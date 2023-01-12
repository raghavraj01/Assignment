package io.datatroops.db

import io.datatroops.models.Company

trait CompanyRepository {

  def storeCompanyDetails(company: Company): Int

  def getUserByEmail(email: String): List[Company]

  def getCompanyById(id: Int): Company

  def updateCompanyIEmail(id: Int, newEmail: String): Company

}
