public class UnionFind {
    private int[] parents;
    private int[] sizes;
    private int componentCount;

    public UnionFind(int numComponents) {
        parents = new int[numComponents];
        sizes = new int[numComponents];
        componentCount = numComponents;

        for (int i=0; i < numComponents; i++) {
            parents[i] = i;
            sizes[i] = 1;
        }
    }

    public int find(int n) {
        while (parents[n] != n) {
            n = parents[n];
        }
        return n;
    }

    public void union(int a, int b) {
        int rootA = find(a);
        int sizeA = sizes[rootA];

        int rootB = find(b);
        int sizeB = sizes[rootB];

        if (rootA == rootB) {
            return;
        }

        if (sizeA > sizeB) {
            // put B's tree under A
            parents[rootB] = rootA;
            sizes[rootA] += sizes[rootB];
        } else {
            parents[rootA] = rootB;
            sizes[rootB] += sizes[rootA];
        }
        componentCount--;
    }

    public int getComponentCount() {
        return componentCount;
    }
}