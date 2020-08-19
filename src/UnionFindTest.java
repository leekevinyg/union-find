import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnionFindTest {

    @Test
    void unionFind() {
        UnionFind uf = new UnionFind(10);
        for (int i=0; i<10; i++) {
            int root = uf.find(i);
            assertEquals(i, root);
        }
        assertEquals(10, uf.getComponentCount());

        uf.union(1, 3);
        assertEquals(uf.find(1), uf.find(3));
        assertEquals(9, uf.getComponentCount());

        uf.union(5, 1);
        assertEquals(uf.find(5), uf.find(1));
        assertEquals(uf.find(5), uf.find(3));

        uf.union(5,3);
        assertEquals(uf.find(5), uf.find(1));
        assertEquals(uf.find(5), uf.find(3));

        assertEquals(8, uf.getComponentCount());
    }
}