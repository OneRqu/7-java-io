package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles
        int current;
        int prev = -1;

        while ((current = System.in.read()) != -1) {
            if (prev == 13) {  // \r
                if (current != 10) {  // \n
                    System.out.write(13);
                }
            } else if (prev != -1) {
                System.out.write(prev);
            }

            prev = current;
        }

        if (prev != -1) {
            System.out.write(prev);
        }

        System.out.flush();

    }
}
