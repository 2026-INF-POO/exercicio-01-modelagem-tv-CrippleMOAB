class Tv{
  double polegadas;
  int volume=5;
  String marca;
  int voltagem;
  int canal=1;
  int ligar(){
    return voltagem*polegadas;
  }
  void desligar(){
    System.out.println("Desligando...");
  }
  int aumentarVolume(){
    if(volume==10){
      System.out.println("Volume máximo atingido!");
    }
    else{
      volume++;
      System.out.println("Volume: "+volume);
    }
    return volume;
  }
  int diminuirVolume(){
    if(volume==1){
      System.out.println("Volume mínimo atingido!");
    }
    else{
      volume--;
      System.out.println("Volume: "+volume);
    }
    return volume;
  }
  int subirCanal(){
    canal++;
    System.out.println("Canal: "+canal);
    return canal;
  }
  int descerCanal(){
    if(canal>1){
      canal--;
      System.out.println("Canal: "+canal);
    }
    else{
      System.out.println("Canal inválido!");
    }
    return canal;
  }
}
