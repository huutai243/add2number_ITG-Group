package Cong2So;

public class Sum2Number {
	
	    public static String sum(String stn1, String stn2) {
	        String result = ""; // Biến lưu kết quả của phép cộng
	        int len1 = stn1.length(); // Chiều dài chuỗi số thứ nhất
	        int len2 = stn2.length(); // Chiều dài chuỗi số thứ hai
	        int maxLen = Math.max(len1, len2); // Lấy chiều dài lớn nhất của 2 chuỗi số
	        int carry = 0; // Biến nhớ khi cộng 2 số
	        int sum = 0; // Biến lưu kết quả khi cộng 2 số

	        // Duyệt đồng thời chuỗi stn1, stn2 từ phải sang trái
	        for (int i = 0; i < maxLen; i++) {
	            int digit1 = 0; // Kí số tại vị trí i của stn1
	            int digit2 = 0; // Kí số tại vị trí i của stn2

	            if (i < len1) {
	                digit1 = stn1.charAt(len1 - i - 1) - '0'; // Chuyển kí tự thành kí số
	            }

	            if (i < len2) {
	                digit2 = stn2.charAt(len2 - i - 1) - '0'; // Chuyển kí tự thành kí số
	            }

	            sum = digit1 + digit2 + carry; // Cộng kí số và nhớ
	            carry = sum / 10; // Lấy phần nguyên của kết quả để tính nhớ
	            sum %= 10; // Lấy phần dư của kết quả là kí số mới

	            result = sum + result; // Thêm kí số mới vào kết quả
	        }

	        if (carry > 0) {
	            result = carry + result; // Nếu vẫn còn nhớ, thêm vào kết quả
	        }

	        return result;         //Trả về tổng 2 số
	    }
	    
	    public static void main(String[] args) {
	        String stn1 = "12";
	        String stn2 = "56";
	        String sum = Sum2Number.sum(stn1, stn2);
	        System.out.println("Sum of " + stn1 + " and " + stn2 + " is " + sum);
	    }
	   
	}






