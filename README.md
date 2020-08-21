# Union Find 

A reference implementation of the weighted union-find data structure. 
The data structure is backed by an array and exposes the following operations:

* **Union(int a, int b)**

Connects 2 nodes by setting the root of one node to the root of the other. This operation completes in ```O(lg n)``` time.

* **Find(int a)**

Returns the root of the tree that ```a``` is in. This operation completes in ```O(lg n)``` time.

* getComponentCount()

Returns the total number of connected components in the graph. This operation completes in constant ```O(1)``` time.


