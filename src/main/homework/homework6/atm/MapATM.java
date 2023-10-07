package homework.homework6.atm;

import java.util.Arrays;

/*
Реализовал аналог HashMap c необходимым мне функционалом для банкомата.
 */
public class MapATM {
    private MapATMElement[] map;


    public void put(int key, int value) {
        if (map == null) {
            map = new MapATMElement[]{new MapATMElement(key, value)};
            return;
        }
        for (MapATMElement mapATMElement : map) {
            if (mapATMElement.getKey() == key)
                return;
        }
        MapATMElement[] newMap = new MapATMElement[map.length + 1];
        System.arraycopy(map, 0, newMap, 0, map.length);
        newMap[newMap.length - 1] = new MapATMElement(key, value);
        map = newMap;
    }

    public int get(int key){
        if(!containInKeys(key)){
            return -1;
        }
        for (MapATMElement mapATMElement : map) {
            if (mapATMElement.getKey() == key) {
                return mapATMElement.getValue();
            }
        }
        return -1;
    }

    public int[] getKeys() {
        if (map == null) {
            return null;
        } else {
            int[] keys = new int[map.length];
            for (int i = 0; i < map.length; i++) {
                keys[i] = map[i].getKey();
            }
            return keys;
        }
    }

    public boolean containInKeys(int value) {
        int[] keys = getKeys();
        for (int key : keys) {
            if (key == value) {
                return true;
            }
        }
        return false;
    }

    public int getNearestKey(int key){
        int[] keys = getKeys();
        Arrays.sort(keys);
        int index = Arrays.binarySearch(keys, key);
        return keys[(index + 2) * (-1)];
    }
}
