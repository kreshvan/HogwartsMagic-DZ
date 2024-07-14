public class Ravenclaw extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;
    public Ravenclaw (String name,int powerOfMagic, int spellDistance,int cunning, int determination,
                      int ambition,int resourcefulness,int power ){
        super(name, powerOfMagic, spellDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }
    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning){
        this.cunning = cunning;
    }
    public int getDetermination(){
        return determination;
    }
    public void setDetermination(int determination){
        this.determination = determination;
    }
    public int getAmbition(){
        return ambition;
    }
    public void setAmbition(int ambition){
        this.ambition = ambition;
    }
    public int getResourcefulness(){
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness){
        this.resourcefulness= resourcefulness;
    }
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power= power;
    }

    public static void getSummaPowerStudent(Ravenclaw ravenclawOne,Ravenclaw ravenclawTwo) {
        if (ravenclawOne.getFullMagic() >ravenclawTwo .getFullMagic()) {
            System.out.println(ravenclawOne + " " + "лучший Гриффиндорец, чем" + " " + ravenclawTwo);
        } else if (ravenclawOne.getFullMagic() < ravenclawTwo.getFullMagic()) {
            System.out.println(ravenclawOne + " " + "лучший Гриффиндорец, чем" + " " + ravenclawTwo);
        } else {
            System.out.println(ravenclawOne+ " " + "cтуденты равны" + " " + ravenclawTwo);
        }
    }
    private int getFullMagic(){
        return cunning+determination+ambition+resourcefulness+power;
    }
    public static Ravenclaw getStudentRavenclaw( String name,int powerOfMagic, int spellDistance, int cunning , int determination , int ambition, int resourcefulness, int power){
        Ravenclaw ravenclaws = new Ravenclaw(name,powerOfMagic,spellDistance,cunning,determination,ambition,resourcefulness,power);
        return ravenclaws; //показываю java конструктор для данного класса, исходя из новых свойств данного класса.
    }
    public String toString(){ //прописываю как правильно должен выводить в консоль метод tiString ,исходя их новых данных данного класса
        return "имя:"+ getName()+" " +"сила магии:"+getPowerOfMagic()+" "+"дальность:" +getSpellDistance()+" "+"хитрость:"+cunning+" "+"решительность:"+determination+" "+"амбициозность:"+ambition+" "+"находчивость:"+resourcefulness+" "+"жажда власти:"+power;                                                                                   // выведу все через sout в main
    }
}
