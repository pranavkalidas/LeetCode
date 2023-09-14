package TopInterview150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        //list.remove(0);
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(3,4);
        list.add(5);
        list.set(0,99);
        System.out.println(list);
//        Random random = new Random();
//        System.out.println(random.nextInt(0,0));
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1));
        System.out.println(obj.remove(2));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());
        System.out.println(obj.remove(1));
        System.out.println(obj.insert(2));
        System.out.println(obj.getRandom());

    }
}

class RandomizedSet {
    List<Integer> list;
    HashMap<Integer,Integer> map;
    Random random = new Random();
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();

    }

    public boolean insert(int val) {
        if(list.contains(val)){
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int index = map.get(val);
        if(index < list.size()-1){      //If not last element then swap
            int lastEle = list.get(list.size()-1);
            list.set(index,lastEle);
            map.put(lastEle,index);
        }
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(0,list.size()));
    }
}
