public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    public Gryffindor(String name, int powerOfMagic, int spellDistance, int nobility, int honor, int courage) {
        super(name, powerOfMagic, spellDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getCourage() {
        return courage;
    }
    public void setCourage(int courage) {
        this.courage = courage;
    }
    public static void getSummaPowerStudent(Gryffindor gryffindorOne, Gryffindor gryffindorTwo) {
        if (gryffindorOne.getFullMagic() > gryffindorTwo.getFullMagic()) {
            System.out.println(gryffindorOne + " " + "лучший Гриффиндорец, чем" + " " + gryffindorTwo);
        } else if (gryffindorOne.getFullMagic() < gryffindorTwo.getFullMagic()) {
            System.out.println(gryffindorOne + " " + "лучший Гриффиндорец, чем" + " " + gryffindorTwo);
        } else {
            System.out.println(gryffindorOne + " " + "cтуденты равны" + " " + gryffindorTwo);
        }
    }
    private int getFullMagic(){
        return nobility+honor+courage;
    }
    public static Gryffindor getStudentGryffindor(String name, int powerOfMagic, int spellDistance, int nobility, int honor, int courage) {
        Gryffindor gryffindors = new Gryffindor(name, powerOfMagic, spellDistance, nobility, honor, courage);
        return gryffindors;
    }
    public String toString() {
        return "имя:"+ getName()+" " +"сила магии:"+getPowerOfMagic()+" "+"дальность:" +getSpellDistance()+" " +"благородство:" +nobility+" "+ "честь:"+ honor+" "+"храбрость:"+" " + courage;
    }
}









