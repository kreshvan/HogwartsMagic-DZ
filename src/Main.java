public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = new Gryffindor[3];
        gryffindors[0] = Gryffindor.getStudentGryffindor("Harry Potter", 10, 11, 12, 13, 14);
        gryffindors[1] = Gryffindor.getStudentGryffindor("Hermione Granger", 11, 12, 13, 14, 15);
        gryffindors[2] = Gryffindor.getStudentGryffindor("Ron Weasley", 12, 13, 14, 15, 16);
        Slytherin[] slytherins = new Slytherin[3];
        slytherins[0] = Slytherin.getStudentSlytherin("Draco Malfoy", 13, 14, 15, 16, 17);
        slytherins[1] = Slytherin.getStudentSlytherin("Graham Montagu", 14, 15, 16, 17, 18);
        slytherins[2] = Slytherin.getStudentSlytherin("Gregory Goyle", 15, 16, 17, 18, 19);
        Hufflepuff[] hufflepuffs = new Hufflepuff[3];
        hufflepuffs[0] = Hufflepuff.getStudentHufflepuf("Zachariah Smith", 16, 17, 18, 19, 20, 21);
        hufflepuffs[1] = Hufflepuff.getStudentHufflepuf("Cedric Diggory", 17, 18, 19, 20, 21, 22);
        hufflepuffs[2] = Hufflepuff.getStudentHufflepuf("Justin Finch-Fletchley", 18, 19, 20, 21, 22, 23);
        Ravenclaw[] ravenclaws = new Ravenclaw[3];
        ravenclaws[0] = Ravenclaw.getStudentRavenclaw("Zhou Chang", 19, 20, 21, 22, 23, 24, 25);
        ravenclaws[1] = Ravenclaw.getStudentRavenclaw("Padma Patil", 20, 21, 22, 23, 24, 25, 26);
        ravenclaws[2] = Ravenclaw.getStudentRavenclaw("Marcus Belby", 21, 22, 23, 24, 25, 26, 27);
        System.out.println(gryffindors[1]);
        System.out.println();
        System.out.println(slytherins[2]);
        System.out.println();
        System.out.println(hufflepuffs[2]);
        System.out.println();
        System.out.println(ravenclaws[2]);
        System.out.println();
        Gryffindor.getSummaPowerStudent(gryffindors[0], gryffindors[1]);
        System.out.println();
        Slytherin.getSummaPowerStudent(slytherins[1], slytherins[2]);
        System.out.println();
        Hogwarts.getSummaPowerStudent(slytherins[1], gryffindors[2]);
    }
}