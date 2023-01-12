package io.datatroops.repositories

import io.datatroops.db.CompanyRepository
import io.datatroops.models.Company

class CompanyRepositoryImpl extends CompanyRepository{

  var db: Map[String, Company] = Map()

  /***
   * Store Company Details, ensure the id should be autoincrement, means every time when you store
   * a new company details, id (key in Map) should get auto incremented.
   * @param company
   * @return
   */
  override def storeCompanyDetails(company: Company): Int = {
  db += (db.size.toString -> company)
  db.size
  }

  /***
   * Fetech the company by Company Id(auto-increment)
   * @param id
   * @return
   */
  override def getCompanyById(id: Int): Company = {

    println(db(id.toString))

  }
  /***
   * Fetch the list of company having the email.
   * @param email
   * @return
   */
  override def getUserByEmail(email: String): List[Company] = {
  db.values.filter(x=>x.emailId=="cvbnm").toList

  }

  /***
   * update the company email by Id
   * @param id
   * @return
   */
  override def updateCompanyIEmail(id: Int, newEmail: String): Company = {
  if(db.contains(id.toString)){
    db(id.toString)
  }

  }
  else
  println("id not exist")

}
