package com.demo;

import java.util.Arrays;
import java.util.List;

public class VisaArrayElementsEqualizeCount {

	public static void main(String[] args) {

		final Integer[] a = new Integer[] { 123, 1234 };
		final Integer[] m = new Integer[] { 321, 4321 };

		List<Integer> aList = Arrays.asList(a);
		List<Integer> mList = Arrays.asList(m);

		System.out.println(countStepsArrayEqualize(aList, mList));

	}

	static int countStepsArrayEqualize(List<Integer> alist, List<Integer> mlist) {

		int count = 0;

		if (alist.size() == mlist.size()) {

			for (int i = 0; i < alist.size(); i++) {

				int aNum = alist.get(i);
				int mNum = mlist.get(i);

				int adigit, mdigit;

				while (aNum > 0 && mNum > 0) {
					adigit = aNum % 10;
					mdigit = mNum % 10;

					count += Math.abs(adigit - mdigit);

					aNum = aNum / 10;
					mNum = mNum / 10;
				}

			}

		}

		return count;

	}

}
