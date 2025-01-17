/*
 * package days05;
 * 
 * import java.util.OptionalInt; import java.util.stream.IntStream;
 * 
 * public class Ex01_05 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * //전공자들은 공부하기
 * 
 * // 자바) 람다식와 스트림(Stream)
 * 
 * OptionalInt oi = new Random().ints(0, 101).limit(10).max(); if (
 * oi.isPresent() ) { System.out.println( oi.getAsInt() ); } //
 * 
 * 
 * int [] m = { 96, 11, 67, 94, 20, 99, 38, 93, 3, 83 };
 * 
 * OptionalInt oi = IntStream.of(m).max(); System.out.println( oi.getAsInt() );
 * } }
 */