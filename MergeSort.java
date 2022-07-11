package com.greatlearning.main;

public class MergeSort {

	void merge(int A[],int left, int mid, int right) {

		int n1  = mid-left+1;
		int n2  = right-mid;

		int leftArray[] = new int[n1];
		int rightArray[] = new int[2];

		for(int i=0;i<n1;i++) {
			leftArray[i] = A[left+i];
		}

		for(int j=0;j<n2;j++) {
			rightArray[j] = A[mid+1+j];
		}

		int i=0;
		int j=0;
		int k = left;

		while(i<n1 && j<n2) {

			if(leftArray[i]>= rightArray[j])
			{
				A[k] = leftArray[i];
				i++;
			}
			else
			{
				A[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while(i<n1) {   
			A[k] = leftArray[i];
			i++;
			k++;
		}


		while(j<n2) {
			A[k] = rightArray[j];
			j++;
			k++;
		}

	}

	public void sort(int currency[],int left, int right) { 
		if(left < right) {

			int mid = (left+right)/2; // finding mid element

			sort(currency,left,mid);
			sort(currency,mid+1,right);

			merge(currency,left,mid,right);

		}
	}

}