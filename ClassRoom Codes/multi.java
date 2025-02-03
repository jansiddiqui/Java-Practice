// public class multi {
// 	public static void main(String[] args){
// 		for(int i = 65; i < 68 ; i++){
// 			System.out.print((char)i);
// 		}
// 	}	
// }


// class multi {
//     public static void main(String args[]) {
//         do {
//             int count = 0;
//             do {
//                 count++;
//             } while (count < 2);
//             System.out.println(count);
//             break;
//         } while (true);
//     }
// }


// public class multi{
//     public static void main(String[] args){
//         for(int i = 0; i<5; i++){
//             System.out.println("hello");
//             break;
//         }
//     }
// }

// public class multi {
// 	public static void main(String[] args) {
// 		for (char ch : "12345".toCharArray()) {
//             if (ch == '3') {
//                 continue;
//             }
//             System.out.print(ch + " ");
//         }
// 	}
// }


class multi {
	public static void main(String[] args) {
		int k = 0;
        for (int i = 10; i > 0; i--) { 
            while (i > 3) 
                i -= 3; 
                k += 1;
            }
        System.out.println(k); 
	}
}