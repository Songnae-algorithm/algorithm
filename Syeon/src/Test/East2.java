package Test;

import java.util.*;

public class East2 {

	static int max = 0;

	private static int sumOfDigit(int num) {
		int sum = 0;

		while (num != 0) {
			// num을 10으로 나눈 나머지를 sum에 더한다.
			sum += num % 10;
			// num을 10으로 나눈 값을 다시 num에 저장한다.
			num /= 10;
		}
		return sum;
	}

	public static void doCombination(int[] combArr, int n, int r, int index, int target, List<Integer> list) {

		// r ==0 이란 것은 뽑을 원소를 다 뽑았다는 뜻.
		if (r == 0) {

			int sum = 0;

			// System.out.println(Arrays.toString(combArr));
			for (int i = 0; i < index; i++) {

				sum += list.get(combArr[i]);

			}
			System.out.println("썸" + sum);

			if (sum > max) {
				max = sum;
			}

			// 끝까지 다 검사한 경우..1개를 뽑은 상태여도 실패한 경우임 무조건 return 으로 종료
		} else if (target == n) {

			return;//

		} else {
			combArr[index] = target;
			// (i) 뽑는 경우
			// 뽑으니까, r-1
			// 뽑았으니 다음 index + 1 해줘야 함
			doCombination(combArr, n, r - 1, index + 1, target + 1, list);

			// (ii) 안 뽑는경우
			// 안뽑으니까 그대로 r
			// 안뽑았으니, index는 그대로!
			// index를 그대로하면, 예를 들어 현재 1번 구슬을 comArr에 넣엇어도 다음 재귀에 다시 엎어쳐서 결국 1구슬을 뽑지 않게 된다.
			doCombination(combArr, n, r, index, target + 1, list);
		}

	}

	public static int solution(int[] A) {

		Map<Integer, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < A.length; i++) {

			int num = A[i];
			int key = sumOfDigit(num);// 6

			List<Integer> value = new ArrayList<>();

			if (map.containsKey(key)) { // key값(sum)이 이미 있으면 원래의 list에 추가
				value = map.get(key);
			}
			value.add(num);

			map.put(key, value);
		}
		System.out.println(map);

		for (Integer key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));

			int n = map.get(key).size(); // n개

			int[] combArr = new int[n];
			if (n >= 2) {
				doCombination(combArr, n, 2, 0, 0, map.get(key));// n개중에 2개를 뽑아서 더한 최댓값
			}
		}
		System.out.println(max + "최댓값");

		if (max == 0) {
			max = -1;
		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		int arr1[] = { 51, 71, 17, 42 };

		int arr2[] = { 42, 33, 60 };
		int arr3[] = { 51, 32, 43 };

		int arr4[] = { 14, 23, 13, 15, 24, 33, 22, 31, 41 };

		solution(arr4);

	}
}
