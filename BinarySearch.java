public class BinarySearch<T extends Comparable<T>> {
  /* Sucht mittels binärer Suche das Element x in dem Array a und
   * gibt bei Erfolg den Index i mit a[i].compareTo(x) == 0
   * zurück, ansonsten -1.
   */
    public int search(T[] a, T x) { 
    int l =0;
    int r = (a.length)-1;
    int i;
    while(l<=r){
    i=(l+r)/2;
    if(a[i].compareTo(x) == 0){
    return i;
    }
    if(a[i].compareTo(x) < 0 ){
    l=i+1;
    }else{
    r=i-1;
    }
    }
    return -1;
    }
}
// Quellen : Ihre Vorlessung Folien von Sortieralgorithmen