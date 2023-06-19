package Sem_2;

public class Seminar2 {

    public static void main(String[] args) {

        String s = "Help World! My name is Евгений! ";

        s.equals("!");
        s.contains("!");
        System.out.println(s.replace("!", ""));
        System.out.println(s.toUpperCase());
        System.out.println(s.charAt(s.length()/2));
        System.out.println(s.indexOf("e"));
        System.out.println(s.indexOf("!?"));
        System.out.println(s.repeat(3));
        System.out.println(s.substring(s.length()/2, s.length()-1));
        String[] tmp = s.split(" ");
        s.endsWith("!");
        s.lastIndexOf("!");
        System.out.println("!");

        StringBuilder builder = new StringBuilder(s);
        s = builder.toString();
        builder.append("!");
        builder.replace(0, builder.length()/2, "??");
        builder.deleteCharAt(8);
        builder.delete(builder.length()/2, builder.length()-1);
        System.out.println(builder.reverse());
        builder = new StringBuilder(s);
        builder.charAt(1);
        builder.indexOf("!");
        builder.lastIndexOf("!");
        builder.insert(builder.indexOf("!"), "??");
        System.out.println(builder);
        builder.compareTo(new StringBuilder(s));
        builder.setCharAt(12, 'f');


        String s1 = "";
        StringBuilder builder1 = new StringBuilder(10000);


        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            s1 += Character.getName(i);
        }
        System.out.println(System.nanoTime() - start);

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            builder1.append(Character.getName(i));
        }
        System.out.println(System.nanoTime() - start);


    }

}
