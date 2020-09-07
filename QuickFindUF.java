package com.algorithms.java;

public class QuickFindUF {

	private int[] id;
	
	public QuickFindUF(int N) {
		id = new int[N];
		
		// Set id of each object to itself
		for(int i = 0; i < N; i++) {
			id[i] = i;
			}
		}
	
		// Check whether p & q are in the same component(2 array accesses)
		public boolean connected(int p, int q) {
			return id[p] == id[q];
		}
		
		// Change all entries with id[p] to id[q] ()at most 2N + 2 array accesses)
		public void union(int p, int q) {
			int pid = id[p];
			int qid = id[q];
			for(int i = 0; i < id.length; i++) {
				if(id[i] == pid) {
					id[i] = qid;
				}
			}
		}
		
		public static void main(String args[]){
				
			QuickFindUF UF = new QuickFindUF(10);
			
			UF.union(1, 3);
			UF.union(4, 5);
			UF.union(5, 6);
			UF.union(7, 3);
			UF.union(0, 2);
			UF.union(7, 4);
			
			System.out.println(UF.connected(1, 2));
			
			
		}
}
