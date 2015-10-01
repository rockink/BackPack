import java.lang.reflect.Array;


/**
 *
 * @author Nirmal
 * @param <T> Any Class
 *
 */
public class BackPack<T> {

    T[] obj;
    int pointer;
    int[] pointerArray;

    public BackPack(T[] obj, int pointer) {

        pointerArray = new int[obj.length];

        for (int i = 0; i < obj.length; i++) {
            pointerArray[i] = i;
        }

        this.pointer = pointer;
        this.obj = obj;
    }

    public void addContent(T singleObj) {
    
        
        obj[getLastElementPointer()] = singleObj;
        pointer = getLastElementPointer();
    }

    private int getLastElementPointer() {

        return pointer == 0 ? pointerArray.length - 1 : pointer - 1;
    }

    public T[] getContent(Class<T> c) {

        //initiate new array
        T[] retObj = (T[]) Array.newInstance(c, pointerArray.length);
        int arrayLength = retObj.length;

        //index for new array
        int j = 0;

        int finalPoint = getLastElementPointer();

        for (int i = pointer;; i++) {

            //own iterator
            if (i == arrayLength) {
                i = 0;
            }

            retObj[j++] = obj[i];

            if (i == finalPoint) {
                break;
            }

        }

        return retObj;
    }

}
