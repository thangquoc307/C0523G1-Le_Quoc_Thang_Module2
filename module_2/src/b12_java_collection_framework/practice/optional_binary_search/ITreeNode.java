package b12_java_collection_framework.practice.optional_binary_search;

public interface ITreeNode<E> {
    boolean insert(E element);
    void inOrder();
    int getSize();

}
