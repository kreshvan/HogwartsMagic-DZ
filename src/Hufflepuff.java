public class Hufflepuff extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;
    public Hufflepuff (String name, int powerOfMagic,int spellDistance, int smart, int wise, int witty, int creativity){
        super(name,powerOfMagic,spellDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    public int getSmart() {
        return smart;
    }
    public void setSmart(int smart){
        this.smart = smart;
    }
    public int getWise(){
        return wise;
    }
    public void setWise(int wise){
        this.wise = wise;
    }
    public int getWitty(){
        return witty;
    }
    public void setWitty(int witty){
        this.witty = witty;
    }
    public int getCreativity(){
        return creativity;
    }
    public void setCreativity(int creativity){
        this.creativity = creativity;
    }
    public static void getSummaPowerStudent(Hufflepuff hufflepuffOne, Hufflepuff hufflepuffTwo) {
        if (hufflepuffOne.getFullMagic() >hufflepuffTwo .getFullMagic()) {
            System.out.println(hufflepuffOne + " " + "лучший Гриффиндорец, чем" + " " + hufflepuffTwo);
        } else if (hufflepuffOne.getFullMagic() < hufflepuffTwo.getFullMagic()) {
            System.out.println(hufflepuffOne + " " + "лучший Гриффиндорец, чем" + " " + hufflepuffTwo);
        } else {
            System.out.println(hufflepuffOne + " " + "cтуденты равны" + " " + hufflepuffTwo);
        }
    }
    private int getFullMagic(){
        return smart+wise+witty+creativity;
    }
    public static Hufflepuff getStudentHufflepuf(String name,int powerOfMagic, int spellDistance, int smart , int wise , int witty, int creativity  ) {
        Hufflepuff hufflepuffs = new Hufflepuff(name, powerOfMagic, spellDistance, smart, wise, witty, creativity);
        return hufflepuffs;
    }
    public String toString(){
        return "имя:"+ getName()+" " +"сила магии:"+getPowerOfMagic()+" "+"дальность:" +getSpellDistance()+" "+"интелект:"+ smart+" "+"мудрость:"+" "+wise+" "+"остроумие:"+witty+" "+"творчество:"+creativity;
    }
}






