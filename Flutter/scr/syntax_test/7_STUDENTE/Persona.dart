class Persona {
  String _nome;
  String _cognome;

  Persona({String nome, String cognome}) {
    this.setNome = nome;
    this.setCognome = cognome;
  }

  String get getNome => _nome;

  set setNome(String nome) => this._nome = nome;

  String get getCognome => _cognome;

  set setCognome(String cognome) => this._cognome = cognome;


}
