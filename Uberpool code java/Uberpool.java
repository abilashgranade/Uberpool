
class Uberpool{
  public static void main(String[] args) {
 Operation obj = new  Operation();
   
    obj.addop("ABILASH");
    obj.addop("BIBHASH");
    obj.addop("AGEETH");
    
    obj.dispop();
    obj.addop("RAMA");
    obj.removeop("ABILASH");
    obj.dispop();
  }
}
