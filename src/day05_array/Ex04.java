package day05_array;

public class Ex04 {
    public static void main(String[] args) {
        //int[] nums = new int[]{10, 20, 30, 40}; // 배열선언과 동시에 초기화
        int[] nums = {10, 20, 30, 40};  // new int[] 생략 가능
        System.out.println(nums); // [I@4eec7777(16진수) <--- 배열공간 시작 주소
//        int[] nums;
//        nums = {10, 20, 30, 40}; // XXX
//        nums = new int[] {10, 20, 30, 40};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
    }
}
