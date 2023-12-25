package com.auguigu08.constructor.exer1;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

/**
 * @author: 张强
 * @Project: JavaTest
 * @Pcakage: com.auguigu08.constructor.exer1.StudentTest
 * @Date: 2023年12月25日 11:09
 * @Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("张强",21);
        Student s2 = new Student("张强",21,"大连理工");
        Student s3 = new Student("张强",21,"大连理工","计算机科学与技术");

    }
}
