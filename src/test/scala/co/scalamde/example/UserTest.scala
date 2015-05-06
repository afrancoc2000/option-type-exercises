package co.scalamde.example

import org.scalatest.FunSuite

class UserTest extends FunSuite {

  test("Crea un usuario sin genero") {
    val usuario: Usuario = ???
    assert(usuario.genero === None)
  }

  test("Crea un usuario con genero masculino") {
    val usuario: Usuario = ???
    assert(usuario.genero === Some("masculino"))
  }

  test("Encuentra la edad del usuario 1") {
    val edad: Int = ???
    assert(edad === 32)
  }

  test("Encuentra el genero del usuario 1") {
    val genero: Option[String] = ???
    assert(genero === Some("masculino"))
  }

  test("Encuentra el genero del usuario 2"){
    val genero: Option[String] = ???
    assert(genero === None)
  }

  test("Encuentra el genero del usuario 3"){
    val genero: Option[String] = ???
    assert(genero === None)
  }
}
