public class Slytherin extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    public Slytherin (String name, int powerOfMagic,int spellDistance,int hardworking,int loyal,int honest){
        super(name,powerOfMagic,spellDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int getHardworking() {
        return hardworking;
    }
    public void setHardworking(int hardworking){
        this.hardworking = hardworking;
    }
    public int getLoyal(){
        return loyal;
    }
    public void setLoyal(int loyal){
        this.loyal = loyal;
    }
    public int getHonest(){
        return honest;
    }
    public void setHonest(int honest){
        this.honest = honest;
    }
    public static void getSummaPowerStudent(Slytherin slytherinOne, Slytherin slytherinTwo) {
        if (slytherinOne.getFullMagic() >slytherinTwo .getFullMagic()) {
            System.out.println(slytherinOne + " " + "лучший Гриффиндорец, чем" + " " + slytherinTwo);
        } else if (slytherinOne.getFullMagic() < slytherinTwo.getFullMagic()) {
            System.out.println(slytherinOne + " " + "лучший Гриффиндорец, чем" + " " + slytherinTwo);
        } else {
            System.out.println(slytherinOne + " " + "cтуденты равны" + " " + slytherinTwo);
        }
    }
    private int getFullMagic(){
        return hardworking+loyal+honest;
    }
    public static Slytherin getStudentSlytherin(String name, int powerOfMagic, int spellDistance, int hardworking, int loyal , int honest ) {
        Slytherin slytherins = new Slytherin(name, powerOfMagic, spellDistance, hardworking, loyal, honest);
        return slytherins;
    }
    public String toString() {
        return "имя:"+ getName()+" " +"сила магии:"+getPowerOfMagic()+" "+"дальность:" +getSpellDistance()+" " +"трудолюбие:"+ hardworking+" "+ "верность:"+loyal+" "+"честность:"+ honest;
    }
}
