import java.util.*;

public class Seminar3 {



    public static void main(String[] args) {
        Object o;
        Integer integer; //наследник обджекта!
        Boolean aBoolean;  //наследник обджекта!

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.clear();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(15));
            list2.add(new Random().nextInt(15));
        }

//        list.add(1);
//        list.add(0, 1);
//        list.addAll(list2);
//        list.addAll(4, list2);
        int a = list.get(0);
        System.out.println(list.indexOf(3));
        list.size();
        System.out.println(list.contains(3));
        list.set(list.size()/2, 16);

//        list.remove(1);
//        ArrayList<String> strings = new ArrayList<>();
//        list.remove("new Integer(1)");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (int i: list) {
//            System.out.println(i);
//        }

//        ListIterator<Integer> iterator = list.listIterator(list.size()-1);
//        while (iterator.hasPrevious()){
//            int i = iterator.previous();
//            iterator.remove();
//            iterator.nextIndex();
//        }

//        list.forEach(n -> System.out.println(n));

//        ArrayList<Integer> integers = (ArrayList<Integer>) list.subList(0, 3);

        System.out.println(list);
        System.out.println(list2);

//        list.retainAll(list2);
//        list.removeAll(list2);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        if (list.isEmpty());

        System.out.println("-".repeat(16));
//        System.out.println(list);

//        list.clear();
//        for (int i: list2) list.add(0, i);
//        list2.forEach(n -> list.add(0, n));
//        System.out.println(list);
//        System.out.println(list2);

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(20, 4);
        integers.addFirst(0);
        integers.addLast(9);
        integers.get(5);
        integers.set(3, 4);



    }

}
