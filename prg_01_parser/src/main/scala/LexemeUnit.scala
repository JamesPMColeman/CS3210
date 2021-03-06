/*
 * CS3210 - Principles of Programming Languages - Fall 2020
 * Instructor: Thyago Mota
 * Description: Prg01 - LexemeUnit
 * Student(s) Name(s): Austin Gailey
 */

class LexemeUnit(private var lexeme: String, private var token: Int) {

  def getLexeme() = lexeme

  def getToken() = token

  override def toString: String = "(" + lexeme + "," + token + ")"
}
