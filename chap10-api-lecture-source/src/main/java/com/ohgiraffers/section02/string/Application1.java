package com.ohgiraffers.section02.string;

public class Application1 {
    public static void main(String[] args) {
        /* charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
         * 인덱스를 벗어난 정수를 인자로 전달하는 경우 IndexOutOfBoundsException이 발생한다. */

        String str1 = "apple";

        for(int i = 0; i < str1.length(); i++) {
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }
        System.out.println();

        /* compareTo() : 인자로 전달된 문자열과 사전순으로 비교하여
        * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환한다.
        * 단, 이 메소드는 대소문자를 구분하여 비교한다. */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3)));      //0

        /* 대문자와 소문자는 32만큼 차이가 난다. */
        System.out.println("compareTo() : " + (str2.compareTo(str4)));      //32
        System.out.println("compareTo() : " + (str4.compareTo(str2)));      //-32

        System.out.println("compareTo() : " + (str2.compareTo(str5)));      //-5
        System.out.println("compareTo() : " + (str5.compareTo(str2)));      //5

        /* compareToIgnoreCase() : 대소문자를 구분하지 않고 비교한다. */
        System.out.println("compareToIgnoreCase() : " + str2.compareToIgnoreCase(str4));    //0

        /* concat() : 문자열에 인자로 전다로딘 문자열을 합치기해서 새로운 문자열을 반환한다.
        *             원본 문자열에는 영향을 주지 않는다. */
        System.out.println("concat() : " + (str2.concat(str5)));    //javaoracle
        System.out.println("str2 : " + str2);    //java : 원본에 영향없음

        /* insexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        *              단, 일치하는 문자가 없는 경우 -1을 반환한다. */
        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));       //1
        System.out.println("indexOf('b') : " + indexOf.indexOf('b'));       //-1

        /* trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "   java   ";
        System.out.println("trimStr : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim() + "#");

        /* toLowerCase() : 모든 문자를 소문자로 변환시킨다.
        *  toUpperCase() : 모든 문자를 대문자로 변환시킨다. */
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toLowerCase() : " + caseStr.toUpperCase());

        /* substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다. */
        String javamysql = "javamysql";
        System.out.println("substring(3, 6) : " + javamysql.substring(3, 6));
        System.out.println("substring(3) : " + javamysql.substring(3));

        /* replace() : 문자열에서 대체할 문자열로 변경해서 반환한다. */
        System.out.println("replace() : " + javamysql.replace("java", "python"));

        /* length() : 문자열의 길이를 정수형으로 반환한다.*/
        System.out.println("length() : " + javamysql.length());
        System.out.println("빈 문자열의 길이 : " + ("".length()));

        /* isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환
        *              길이가 0인 문자열은 null과는 다르다. */
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "abc".isEmpty());

    }
}
