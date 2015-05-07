package co.scalamde.example

import org.scalatest.FunSuite

class UserTest extends FunSuite {

  test("Crea un usuario sin genero") {
    val usuario: Usuario = Usuario(3, "Ana", "Garcia", 31, None)
    assert(usuario.genero === None)
  }

  test("Crea un usuario con genero masculino") {
    val usuario: Usuario = Usuario(3, "Ana", "Franco", 35, Some("masculino"))
    assert(usuario.genero === Some("masculino"))
  }

  test("Encuentra la edad del usuario 1") {
    val usr = UsuarioRepository.findById(1)
    val edad: Int = usr.map(u => u.edad).getOrElse(0)
    assert(edad === 32)
  }

  test("Encuentra el genero del usuario 1") {
    val usr = UsuarioRepository.findById(1)
    val genero: Option[String] = usr.flatMap(u => u.genero)
    assert(genero === Some("masculino"))
  }

  test("Encuentra el genero del usuario 2"){
    val usr = UsuarioRepository.findById(2)
    val genero: Option[String] = usr.flatMap(u => u.genero)
    assert(genero === None)
  }

  test("Encuentra el genero del usuario 3"){
    val usr = UsuarioRepository.findById(2)
    val genero: Option[String] = usr.flatMap(u => u.genero)
    assert(genero === None)
  }
}
