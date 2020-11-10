package hw_2;

import java.util.ArrayList;

public class InitializationData {

    public Information fillIn() {

        Information information = new Information();

        for (int i = 0; i < 30; i++) {
            String name = "Denis" + i;
            String email = name + "@mail.com";
            information.arrayList.add(name);
            information.set.add(email);
            information.map.put(email, name);
        }

        for (int i = 0; i < 10; i++){
            String name = "Denis" + 30;
            String email = name + "@mail.com";
            information.arrayList.add(name);
            information.set.add(email);
            information.map.put(email, name);
        }

        for(int i = 0; i < information.arrayList.size(); i++){
            for (int j = i + 1; j < information.arrayList.size(); j++) {
                if (information.arrayList.get(i).equals(information.arrayList.get(j))) {
                    information.arrayList.remove(j);
                    j--;
                }
            }
        }

//        Object[] st = information.arrayList.toArray();
//        for (Object s : st) {
//            if (information.arrayList.indexOf(s) != information.arrayList.lastIndexOf(s)) {
//                information.arrayList.remove(information.arrayList.lastIndexOf(s));
//            }
//        }



        System.out.println(information.arrayList);
        System.out.println(information.set);

        return information;
    }

    public void comparison(Information information){
        System.out.println(information.set.size() == information.arrayList.size() && information.arrayList.size() == information.map.size());
    }
}
