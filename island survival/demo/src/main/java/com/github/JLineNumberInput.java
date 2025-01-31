package com.github;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

public class JLineNumberInput {
    public static void main(String[] args) throws Exception {
        Terminal terminal = TerminalBuilder.terminal();
        LineReader reader = LineReaderBuilder.builder().terminal(terminal).build();

        System.out.println("Введите цифры (нажмите 'q' для выхода):");

        while (true) {
            String input = reader.readCharacter() + "";

            if (input.matches("[0-9]")) {
                System.out.println("Вы ввели цифру: " + input);
            } else if (input.equalsIgnoreCase("q")) {
                System.out.println("Выход...");
                break;
            }
        }
    }
}
