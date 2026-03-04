class Tv{
  double polegadas;
  int volume=5;
  String marca;
  int voltagem;
  int canal=1;
  int ligar(int voltagem, int polegadas){
    return voltagem*polegadas;
  }
  void desligar(){
    System.out.println("Desligando...");
  }
  int aumentarVolume(int volume){
    if(volume==10){
      System.out.println("Volume máximo atingido!");
    }
    else{
      volume++;
      System.out.println("Volume: "+volume);
    }
    return volume;
  }
  int diminuirVolume(int volume){
    if(volume==1){
      System.out.println("Volume mínimo atingido!");
    }
    else{
      volume--;
      System.out.println("Volume: "+volume);
    }
    return volume;
  }
  int subirCanal(int canal){
    canal++;
    System.out.println("Canal: "+canal);
    return canal;
  }
  int descerCanal(int canal){
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
