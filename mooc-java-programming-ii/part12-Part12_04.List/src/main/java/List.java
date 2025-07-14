public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (firstFreeIndex == this.values.length - 1      ) {
            grow();
        }
        
        this.values[firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public boolean contains(Type value) {
        return this.indexOfValue(value) >= 0;
    }

    public void remove(Type value) {
        if (this.indexOfValue(value) >= 0) {
            this.moveLeft(firstFreeIndex);
            this.firstFreeIndex--;
        }
    }

    public int indexOfValue(Type value) {
        for(int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveLeft(int fromIndex) {
        for(int i = fromIndex; i < this.values.length - 1; i++) {
            this.values[i] = this.values[i + 1]; 
        }
    }

    private void grow() {
        Type[] newValues = (Type[]) new Object[this.values.length + this.values.length / 2];
        for(int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    public Type value(int index) {
    if (index < 0 || index >= this.firstFreeIndex) {
        throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
    }

    return this.values[index];
}

    public int size() {
        return this.values.length;
    }
}
