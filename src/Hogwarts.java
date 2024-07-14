public class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int spellDistance;
    public Hogwarts (String name,int powerOfMagic, int spellDistance){
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.spellDistance = spellDistance;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPowerOfMagic(){
        return powerOfMagic;
    }
    public void setPowerOfMagic(int powerOfMagic){
        this.powerOfMagic = powerOfMagic;
    }
    public int getSpellDistance(){
        return spellDistance;
    }
    public void setSpellDistance(int spellDistance){
        this.spellDistance = spellDistance;
    }
    public String toString (){
        return name+powerOfMagic+spellDistance;
    }
    public static void getSummaPowerStudent(Gryffindor studentOne, Gryffindor studentTwo) {
        if (studentOne.getFullHogwartsMagic() >  studentTwo.getFullHogwartsMagic()) {
            System.out.println(studentOne + " " + "лучший Гриффиндорец, чем" + " " +  studentTwo);
        } else if (studentOne.getFullHogwartsMagic() <  studentTwo.getFullHogwartsMagic()) {
            System.out.println(studentOne + " " + "лучший Гриффиндорец, чем" + " " +  studentTwo);
        } else {
            System.out.println(studentOne + " " + "cтуденты равны" + " " +  studentTwo);
        }
    }
    int getFullHogwartsMagic(){
        return powerOfMagic+spellDistance;
    }
    public static Hogwarts getStudent(String name,int powerOfMagic, int spellDistance){
        Hogwarts student = new Hogwarts(name,powerOfMagic,spellDistance);
        return student;
    }
}
