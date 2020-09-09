package com.algorithms.java;

public class QuickUnionUF {

	private int[] id;
	
	// Set id of each of object to itself (N array accesses)
	public QuickUnionUF(int N) {
		id = new int[N];
		for(int i = 0; i < N; i++) {
			id[i] = i;
		}
	}
	
	// Chase parent pointers until reach root(depth of i array accesses)
	private int root(int i) {
		while(i != id[i]) {
			i = id[i];
		}
		return i;
	}
	
	// Check if p and q have same root (depth of p & q array accesses)
	public boolean connected(int p, int q) {
		
		return root(p) == root(q);
	}
	
	
	// Change root of p to point to root of q (depth of p & q array accesses)
	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
	
	public static void main(String[] args) {
		
		QuickFindUF UF = new QuickFindUF(10);
		
		UF.union(2,4);
		UF.union(3,6);
		UF.union(8,5);
		UF.union(5,4);
		UF.union(7,3);
		UF.union(6,1);
		
		System.out.println(UF.connected(2, 5));
		System.out.println(UF.connected(3, 2));
		System.out.println(UF.connected(2, 7));
		System.out.println(UF.connected(7, 5));
		System.out.println(UF.connected(9, 1));
	}
	
	
}
