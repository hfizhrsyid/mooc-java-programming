public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }

        return null;
    }

    public void add(K key, V value) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new List<>();
        }

        List<Pair<K, V>> valuesAtIndex = values[hashValue];

        int index = -1;
        for(int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.firstFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
    for (int i = 0; i < this.values[fromIdx].size(); i++) {
        Pair<K, V> value = this.values[fromIdx].value(i);

        int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
        if(newArray[hashValue] == null) {
            newArray[hashValue] = new List<>();
        }

        newArray[hashValue].add(value);
    }
}

    public void grow() {
        List<Pair<K, V>>[] newValues = new List[this.values.length * 2];

        for(int i = 0; i < this.values.length; i++) {
            copy(newValues, i);
        }

        this.values = newValues;
    }
}
