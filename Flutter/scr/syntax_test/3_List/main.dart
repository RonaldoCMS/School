main(List<String> args) {
  
  
  var lista2 = new List<int>();
  //In questo modo è possibile creare una lista dinamica
  
  for(var i = 0; i < 10; i++) {
    lista2.add(i);
  }


  var lista = new List<int>(3); //Lista statica

  for(var i = 0; i < 3; i++) {
    lista[i] = i;
  }


  /* Foreach in */

/*  for (var e in lista2) {
      print(e);
  } */

  /* Foreach method */
  //lista2.forEach((var e) => print(e));

  /* Iterator */

  var it = lista2.iterator;
  while(it.moveNext()) {
    print(it.current);
  }

}